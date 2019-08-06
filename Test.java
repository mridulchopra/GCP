

package test;
import java.sql.*;  
/**
 *
 * @author HP
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://35.236.163.90:3306/student","root","123");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from students");  
while(rs.next())  
System.out.println(rs.getString(1)+"  "+rs.getInt(2));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
    }
    
}
