package GUI;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;

public class Test2 extends JPanel {
	private JTextField text_id;
	private JTextField text_firstName;
	private JTextField text_lastName;
	private JTextField text_Address;
	private JTextField text_postcode;
	private JTextField text_City;
	private JTextField text_NationInsurance;
	private JTextField text_AccountName;
	private JTextField text_bic;
	private JTextField text_iban;
	private JTextField text_startSalary;
	private JTextField text_department;

	/**
	 * Create the panel.
	 */
	public Test2() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 213, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 28, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel ID_label = new JLabel("Employee ID");
		GridBagConstraints gbc_ID_label = new GridBagConstraints();
		gbc_ID_label.anchor = GridBagConstraints.WEST;
		gbc_ID_label.insets = new Insets(0, 0, 5, 5);
		gbc_ID_label.gridx = 2;
		gbc_ID_label.gridy = 1;
		add(ID_label, gbc_ID_label);
		
		text_id = new JTextField();
		GridBagConstraints gbc_text_id = new GridBagConstraints();
		gbc_text_id.insets = new Insets(0, 0, 5, 5);
		gbc_text_id.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_id.gridx = 3;
		gbc_text_id.gridy = 1;
		add(text_id, gbc_text_id);
		text_id.setColumns(10);
		
		JLabel first_name = new JLabel("First Name");
		GridBagConstraints gbc_first_name = new GridBagConstraints();
		gbc_first_name.anchor = GridBagConstraints.WEST;
		gbc_first_name.insets = new Insets(0, 0, 5, 5);
		gbc_first_name.gridx = 2;
		gbc_first_name.gridy = 2;
		add(first_name, gbc_first_name);
		
		text_firstName = new JTextField();
		text_firstName.setText("");
		GridBagConstraints gbc_text_firstName = new GridBagConstraints();
		gbc_text_firstName.insets = new Insets(0, 0, 5, 5);
		gbc_text_firstName.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_firstName.gridx = 3;
		gbc_text_firstName.gridy = 2;
		add(text_firstName, gbc_text_firstName);
		text_firstName.setColumns(10);
		
		JLabel last_name = new JLabel("Last Name");
		GridBagConstraints gbc_last_name = new GridBagConstraints();
		gbc_last_name.anchor = GridBagConstraints.WEST;
		gbc_last_name.insets = new Insets(0, 0, 5, 5);
		gbc_last_name.gridx = 2;
		gbc_last_name.gridy = 3;
		add(last_name, gbc_last_name);
		
		text_lastName = new JTextField();
		GridBagConstraints gbc_text_lastName = new GridBagConstraints();
		gbc_text_lastName.insets = new Insets(0, 0, 5, 5);
		gbc_text_lastName.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_lastName.gridx = 3;
		gbc_text_lastName.gridy = 3;
		add(text_lastName, gbc_text_lastName);
		text_lastName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Address");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 4;
		add(lblNewLabel, gbc_lblNewLabel);
		
		text_Address = new JTextField();
		GridBagConstraints gbc_text_Address = new GridBagConstraints();
		gbc_text_Address.insets = new Insets(0, 0, 5, 5);
		gbc_text_Address.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Address.gridx = 3;
		gbc_text_Address.gridy = 4;
		add(text_Address, gbc_text_Address);
		text_Address.setColumns(10);
		
		JLabel lbl_postcode = new JLabel("Postcode");
		GridBagConstraints gbc_lbl_postcode = new GridBagConstraints();
		gbc_lbl_postcode.anchor = GridBagConstraints.WEST;
		gbc_lbl_postcode.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_postcode.gridx = 2;
		gbc_lbl_postcode.gridy = 5;
		add(lbl_postcode, gbc_lbl_postcode);
		
		text_postcode = new JTextField();
		GridBagConstraints gbc_text_postcode = new GridBagConstraints();
		gbc_text_postcode.insets = new Insets(0, 0, 5, 5);
		gbc_text_postcode.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_postcode.gridx = 3;
		gbc_text_postcode.gridy = 5;
		add(text_postcode, gbc_text_postcode);
		text_postcode.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("City");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 6;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		text_City = new JTextField();
		GridBagConstraints gbc_text_City = new GridBagConstraints();
		gbc_text_City.insets = new Insets(0, 0, 5, 5);
		gbc_text_City.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_City.gridx = 3;
		gbc_text_City.gridy = 6;
		add(text_City, gbc_text_City);
		text_City.setColumns(10);
		
		JLabel lblNationalInsurance = new JLabel("National insurance");
		GridBagConstraints gbc_lblNationalInsurance = new GridBagConstraints();
		gbc_lblNationalInsurance.anchor = GridBagConstraints.EAST;
		gbc_lblNationalInsurance.insets = new Insets(0, 0, 5, 5);
		gbc_lblNationalInsurance.gridx = 2;
		gbc_lblNationalInsurance.gridy = 7;
		add(lblNationalInsurance, gbc_lblNationalInsurance);
		
		text_NationInsurance = new JTextField();
		GridBagConstraints gbc_text_NationInsurance = new GridBagConstraints();
		gbc_text_NationInsurance.insets = new Insets(0, 0, 5, 5);
		gbc_text_NationInsurance.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_NationInsurance.gridx = 3;
		gbc_text_NationInsurance.gridy = 7;
		add(text_NationInsurance, gbc_text_NationInsurance);
		text_NationInsurance.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Account Name");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 8;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		text_AccountName = new JTextField();
		GridBagConstraints gbc_text_AccountName = new GridBagConstraints();
		gbc_text_AccountName.insets = new Insets(0, 0, 5, 5);
		gbc_text_AccountName.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_AccountName.gridx = 3;
		gbc_text_AccountName.gridy = 8;
		add(text_AccountName, gbc_text_AccountName);
		text_AccountName.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("IBAN");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 9;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		text_iban = new JTextField();
		GridBagConstraints gbc_text_iban = new GridBagConstraints();
		gbc_text_iban.insets = new Insets(0, 0, 5, 5);
		gbc_text_iban.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_iban.gridx = 3;
		gbc_text_iban.gridy = 9;
		add(text_iban, gbc_text_iban);
		text_iban.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("BIC");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 10;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		text_bic = new JTextField();
		GridBagConstraints gbc_text_bic = new GridBagConstraints();
		gbc_text_bic.insets = new Insets(0, 0, 5, 5);
		gbc_text_bic.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_bic.gridx = 3;
		gbc_text_bic.gridy = 10;
		add(text_bic, gbc_text_bic);
		text_bic.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Start Salary");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 2;
		gbc_lblNewLabel_5.gridy = 11;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		text_startSalary = new JTextField();
		GridBagConstraints gbc_text_startSalary = new GridBagConstraints();
		gbc_text_startSalary.insets = new Insets(0, 0, 5, 5);
		gbc_text_startSalary.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_startSalary.gridx = 3;
		gbc_text_startSalary.gridy = 11;
		add(text_startSalary, gbc_text_startSalary);
		text_startSalary.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Department");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 2;
		gbc_lblNewLabel_6.gridy = 12;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		text_department = new JTextField();
		GridBagConstraints gbc_text_department = new GridBagConstraints();
		gbc_text_department.insets = new Insets(0, 0, 5, 5);
		gbc_text_department.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_department.gridx = 3;
		gbc_text_department.gridy = 12;
		add(text_department, gbc_text_department);
		text_department.setColumns(10);
		
		JButton btnNewButton = new JButton("Add Employee");
		GridBagConstraints btn_addEmployee = new GridBagConstraints();
		btn_addEmployee.insets = new Insets(0, 0, 5, 5);
		btn_addEmployee.gridx = 2;
		btn_addEmployee.gridy = 14;
		add(btnNewButton, btn_addEmployee);
		
		JButton btnNewButton_1 = new JButton("Report");
		GridBagConstraints btn_report = new GridBagConstraints();
		btn_report.insets = new Insets(0, 0, 5, 5);
		btn_report.gridx = 3;
		btn_report.gridy = 14;
		add(btnNewButton_1, btn_report);

	}
}
