package DatabaseStuff;
import java.sql.*;
public class dbTest {
	public void dataB(){
		try{
	Class driver = Class.forName("com.mysql.jdbc.Driver");

	Connection c = DriverManager.getConnection(
			"jdbc:mysql://localhost/ProjectDatabase?useSSL=false", 
		            "root", "password");
	
	Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM employee;");
			while(rs.next()){
				String out = String.format("%s is in %s.", 
						   rs.getString("first_name"), rs.getString("last_name"));

						System.out.println(out);
	
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}

	
	}

}
