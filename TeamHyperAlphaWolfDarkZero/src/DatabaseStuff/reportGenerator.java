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
			ResultSet rs = st.executeQuery("SELECT first_name, last_name, department.name  FROM assignment JOIN employee ON employee.employee_id = assignment.employee_id JOIN department ON department.id = assignment.department_id ORDER BY department_id");
			while(rs.next()) {
				String out = String.format("%s %s works in %s", rs.getString("first_name"), rs.getString("last_name"), rs.getInt("department.name"));
				System.out.println(out);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
