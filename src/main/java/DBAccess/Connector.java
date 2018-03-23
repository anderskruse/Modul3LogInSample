package DBAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 The purpose of Connector is to...

 @author wtfakm
 */
public class Connector {

    private static final String URL = "jdbc:mysql://207.154.207.5:3306/Legohouse";
    //private static final String URL = "jdbc:mysql://localhost:3306/useradmin?serverTimezone=UTC";
    private static final String USERNAME = "anders";
    private static final String PASSWORD = "cba123";

    private static Connection singleton;

    public static void setConnection( Connection con ) {
        singleton = con;
    }

    public static Connection connection() throws ClassNotFoundException, SQLException {
        if ( singleton == null ) {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            singleton = DriverManager.getConnection( URL, USERNAME, PASSWORD );
        }
        return singleton;
    }

}
