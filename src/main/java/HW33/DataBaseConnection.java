package HW33;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataBaseConnection {
    public static Connection getConnection() throws IOException, SQLException, ClassNotFoundException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/resources/dbInfo.properties"));
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection(
                prop.getProperty("db_url"),
                prop.getProperty("db_login"),
                prop.getProperty("db_password"));
        return connection;
    }
}
