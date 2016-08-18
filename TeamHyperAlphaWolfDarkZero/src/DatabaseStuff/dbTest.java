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
	;
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
	
	}
	
	public void addEmployee(String ID, String firstName,
			String lastName, String address, String city, String postcode,
			String emailAddr, String nationalInsurance, String accountName,
			String iban, String bic, String startSalary){
		try{
	Class driver = Class.forName("com.mysql.jdbc.Driver");
	Connection c = DriverManager.getConnection(
			"jdbc:mysql://localhost/ProjectDatabase?useSSL=false", 
		            "root", "password");
	
	Statement st = c.createStatement();
			String insert = "INSERT"
					+ " INTO employee VALUES('" + ID + "', '" + 
					firstName + "', '" + lastName + "', '"+address+"', "
							+ "'"+city+"', '" + postcode +"' "+ ",'"
					+emailAddr+"',"+ "'"+nationalInsurance+"', '"
							+accountName+
									"', '"+iban+"', '"+bic+"',"
									+ " '"+startSalary+"');";
			System.out.println(insert);
			int rs = st.executeUpdate(insert);
			
			System.out.println("Done boiz");
			
		}catch(Exception e){
			System.out.println(e.toString());
		}
	
	}
	
	

}
