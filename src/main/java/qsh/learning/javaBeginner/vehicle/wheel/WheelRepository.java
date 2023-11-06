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
        // initialiser les PreparedStatement
    }

    private void initSchema() {
        // utiliser des Statment pour les requête DLL
    }

    public void insertWheel(Wheel wheel) {
        //
    }

    public List<Wheel> findWheelByBrand(BrandWheel byBrandWheel) {
      //
    }
}
