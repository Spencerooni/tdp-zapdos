package DatabaseStuff;
import java.sql.*;
public class dbTest {
	public void dataB(){
		try{
	Class driver = Class.forName("com.mysql.jdbc.Driver");
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost/employeedatabase.sql", 
		            "root", "password");
	
	Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM employee");
			while(rs.next()){
				String out = String.format("%s is in %s.", 
						   rs.getString("first_name"), rs.getString("last_name"));
			}
		}catch(Exception e){}
	
	}

}
