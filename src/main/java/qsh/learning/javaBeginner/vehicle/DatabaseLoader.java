package qsh.learning.javaBeginner.vehicle;

import org.h2.tools.Server;
import qsh.learning.javaBeginner.vehicle.wheel.BrandWheel;
import qsh.learning.javaBeginner.vehicle.wheel.DirectionWheel;
import qsh.learning.javaBeginner.vehicle.wheel.Wheel;
import qsh.learning.javaBeginner.vehicle.wheel.WheelRepository;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class DatabaseLoader {

    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Server.createTcpServer("-tcpPort" ,"9092", "-tcpAllowOthers").start();

        try (var conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "")) {


            WheelRepository wheelRepository = new WheelRepository(conn);

            Wheel wheel1 = new Wheel("GoodYear pneu", "001", 18, DirectionWheel.RIGHT, 0.2);
            Wheel wheel2 = new Wheel("Michelin", "002", 19, DirectionWheel.RIGHT, 0.1);
            Wheel wheel3 = new Wheel("Michelin", "006", 17, DirectionWheel.LEFT, 1);

            wheelRepository.insertWheel(wheel1);
            wheelRepository.insertWheel(wheel2);
            wheelRepository.insertWheel(wheel3);


            Set<Wheel> wheelsFound = new HashSet<>(wheelRepository.findWheelByBrand(BrandWheel.MICHE));
            if (wheelsFound.containsAll(Set.of(wheel2, wheel3)) && wheelsFound.size() == 2) {
                System.out.println("SUCCESS");
            } else {
                System.out.println("FAIL");
            }

        }
    }
}
