package DataBase_Connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDBMS   {
   static private String url ="" ;
   static private String username ="" ;
   static private String id ="";

    
   static void StartConnectivity () throws SQLException {
       Connection conn = DriverManager.getConnection(url,username,id);
    }


}
