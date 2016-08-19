package DatabaseStuff;

import java.sql.*;


public class reportGenerator {
	public void genReport(){
		try{
			Class driver = Class.forName("com.mysql.jdbc.Driver");

			Connection c = DriverManager.getConnection(
					"jdbc:mysql://localhost/ProjectDatabase?useSSL=false", 
				            "root", "password");
			
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("SELECT project_id, first_name, last_name  FROM assignment JOIN employee ON employee.employee_id = assignment.employee_id ORDER BY project_id");
			while(rs.next()) {
				String out = String.format("%s is in %s is in %s", rs.getInt("project_id"), rs.getString("first_name"), rs.getString("last_name"));
				System.out.println(out);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
