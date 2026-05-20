import java.sql.Connection;
import java.sql.Statement;

public class CreateDatabase {

    public static void main(String[] args) {

        try {

            Connection conn = DBConnection.connect();

            Statement stmt = conn.createStatement();

            stmt.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS products (" +
                            "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                            "name TEXT," +
                            "stock INTEGER," +
                            "supplier TEXT)");

            stmt.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS suppliers (" +
                            "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                            "name TEXT)");

            stmt.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS orders (" +
                            "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                            "product TEXT," +
                            "quantity INTEGER)");

            System.out.println("Tables Created");

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}