import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;


public class SecondFrame extends JFrame {
	private JTextField textField;

	
	public static void main(String[] args) {
		SecondFrame obj = new SecondFrame();
		obj.setVisible(true);
	}

	
	public SecondFrame() {
		this.getContentPane().setLayout(null);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnOk.setBounds(167, 107, 89, 23);
		getContentPane().add(btnOk);
		
		textField = new JTextField();
		textField.setBounds(251, 53, 232, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		this.setSize(621,384);
	}
}
