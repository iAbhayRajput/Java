import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ta1 {
   static final String DB_URL = "jdbc:mysql://localhost:3306/my_new_database"; 
   static final String USER = "root"; //USERNAME
   static final String PASS = "India@1234"; //PASSWORD

   public static void main(String[] args) {
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();) 
         {		      
          String sql = "CREATE TABLE REGISTRATION " +
                   "(id INTEGER not NULL, " +
                   " first VARCHAR(255), " + 
                   " last VARCHAR(255), " + 
                   " age INTEGER, " + 
                   " PRIMARY KEY ( id ))"; 

         stmt.executeUpdate(sql);

         System.out.println("Created table in given database...");
         int result = stmt.executeUpdate( "insert into registration(id,first,last,age) values('1','Avinash','kumar','21'),('2','Prem','kumar','19')"); 

         System.out.println("successfully inserted");
         
 
	conn.close();    	  
      } 
      catch (SQLException e) 
      {
         e.printStackTrace();
      } 
   }
}
