import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection connect() {

        Connection conn = null;

        try {

            Class.forName("org.sqlite.JDBC");

            conn = DriverManager.getConnection(
                    "jdbc:sqlite:../database/inventory.db");

            System.out.println("Database Connected");

        } catch (Exception e) {

            System.out.println(e);

        }

        return conn;
    }
}