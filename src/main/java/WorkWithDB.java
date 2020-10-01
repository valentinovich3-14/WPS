import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WorkWithDB {
    public static void uploadSystemCSVtoDB(String filePath){
        Connection connection = ConnectionFactory.getConnection();
        try {
            int id = 0;
            Statement statement = connection.createStatement();
            statement.execute("drop table if exists system");
            statement.execute("create table system (id int NOT NULL AUTO_INCREMENT primary key , IDX int, IDY int, LENGTH int)");
            statement.executeQuery("insert into system ( IDX, IDY, LENGTH )    select convert( \"IDX\",int ), convert( \"IDY\",int ), convert( \"LENGTH\", int)   from CSVREAD( 'filePath', 'IDX;IDY;LENGTH', ';', 1)");

            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void uploadPointsCSVtoDB(String filePath){
        Connection connection = ConnectionFactory.getConnection();
        try {
            int id = 0;
            Statement statement = connection.createStatement();
            statement.execute("drop table if exists points");
            statement.execute("create table points (id int NOT NULL AUTO_INCREMENT primary key , IDA int, IDB int)");
            statement.executeQuery("insert into points ( IDA, IDB )    select convert( \"IDA\",int ), convert( \"IDB\",int )   from CSVREAD( 'filePath', 'IDA;IDB', ';', 1)");
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
