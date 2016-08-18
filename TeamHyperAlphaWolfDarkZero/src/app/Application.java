package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import EmployeeRelated.Employee;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee(1, "Tim", "Bob", "PA 88 66 22 A");
		
		System.out.println(emp1.getEmpFirstName() + " " +
		emp1.getEmpLastName());
		
		JFrame frame = new JFrame("The Spike");
		frame.setSize(400, 400);
		frame.setSize(400, 400);
		
		JButton button = new JButton("Submit");
		button.setActionCommand("hi");
		frame.add(button);
		
		frame.setVisible(true);
		
		//button.addActionListener(new ButtonCLickListener());
		
		
		
	}


}

final class ButtonClickListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
       String command = e.getActionCommand();  
       if( command.equals( "hi" ))  {
          System.out.println("");
       }
    }
}
