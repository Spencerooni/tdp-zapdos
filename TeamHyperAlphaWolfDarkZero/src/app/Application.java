package app;

import EmployeeRelated.Employee;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee(1, "Tim", "Bob", "PA 88 66 22 A");
		
		System.out.println(emp1.getEmpFirstName() + " " +
		emp1.getEmpLastName());
		
		
	}

}
