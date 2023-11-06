package qsh.learning.javaBeginner.vehicle.wheel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WheelRepository {

    private final Connection conn;
    private final PreparedStatement insertWheelStatement;
    private final PreparedStatement findByBrandStatement;

    public static final String CREATE_TABLE = """
            CREATE TABLE IF NOT EXISTS WHEEL (
              brandWheel varchar(5) NOT NULL,
              serialId varchar(10) NOT NULL,
              diameter INTEGER NOT NULL,
              direction varchar(5) NOT NULL,
              wear DOUBLE PRECISION
             )
             """;
    public static final String DROP_TABLE = "DROP TABLE IF EXISTS WHEEL";

    public WheelRepository(Connection conn) {
        this.conn = conn;
        initSchema();
        try {
            insertWheelStatement = conn.prepareStatement("INSERT INTO WHEEL VALUES (?, ?, ?, ?, ?)");
            findByBrandStatement = conn.prepareStatement("SELECT * FROM WHEEL WHERE brandWheel = ?");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void initSchema() {
        try (Statement statement = conn.createStatement()) {
            statement.executeUpdate(DROP_TABLE);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try (Statement statement = conn.createStatement()) {
            statement.executeUpdate(CREATE_TABLE);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertWheel(Wheel wheel) {
        try {
            insertWheelStatement.setString(1, wheel.wheelId().getBrandWheel().name());
            insertWheelStatement.setString(2, wheel.wheelId().getSerialId());
            insertWheelStatement.setInt(3, wheel.diameter());
            insertWheelStatement.setString(4, wheel.direction().name());
            insertWheelStatement.setDouble(5, wheel.wear());
            insertWheelStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Wheel> findWheelByBrand(BrandWheel byBrandWheel) {
        try {
            findByBrandStatement.setString(1, byBrandWheel.name());
            ResultSet resultSet = findByBrandStatement.executeQuery();

            List<Wheel> result = new ArrayList<>();
            while (resultSet.next()) {
                String brandWheel = resultSet.getString("brandWheel");
                String serialId = resultSet.getString("serialId");
                int diameter = resultSet.getInt("diameter");
                DirectionWheel direction = DirectionWheel.valueOf(resultSet.getString("direction"));
                double wear = resultSet.getDouble("wear");
                Wheel wheel = new Wheel(new WheelId(brandWheel, serialId), diameter, direction, wear);
                result.add(wheel);
            }
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
