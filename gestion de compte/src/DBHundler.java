
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DBHundler extends Configs {
    Connection dbConnection;

    public DBHundler() {
        super();
    }

    public Connection getConnection() {
        String connectionString = "jdbc:mysql://" + Configs.dbHost + ":" + Configs.dbPort + "/" + Configs.dbName
                + "?autoReconnect=true&useSSL=false";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            dbConnection = (Connection) DriverManager.getConnection(connectionString, Configs.dbUser, Configs.dbPass);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return dbConnection;
    }
}