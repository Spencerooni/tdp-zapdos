package GUI;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.GridLayout;

public class report extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public report() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);

	}
}
