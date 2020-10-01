import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String dbDriver = "org.h2.Driver";
    private static final String dbUser = "admin";
    private static final String dbPassword = "admin";
    private static final String dbUrl = "jdbc:h2:~/WaterPipelineSystem";

    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName(dbDriver);
            connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            System.out.println("Connection OK");
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Connection ERROR");
        }
        return  connection;
    }
}
