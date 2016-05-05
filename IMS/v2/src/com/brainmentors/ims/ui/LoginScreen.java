package com.brainmentors.ims.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginScreen extends JFrame {
	private JTextField useridTxt;
	private JPasswordField pwdTxt;

	
	public static void main(String[] args) {
		
					LoginScreen frame = new LoginScreen();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public LoginScreen() {
		setResizable(false);
		getContentPane().setForeground(Color.RED);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 362);
		getContentPane().setLayout(null);
		
		JLabel lblUserid = new JLabel("Userid");
		lblUserid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUserid.setBounds(54, 75, 84, 29);
		getContentPane().add(lblUserid);
		
		useridTxt = new JTextField();
		useridTxt.setToolTipText("Enter the Userid");
		useridTxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		useridTxt.setBounds(148, 72, 265, 32);
		getContentPane().add(useridTxt);
		useridTxt.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPassword.setBounds(54, 158, 84, 29);
		getContentPane().add(lblPassword);
		
		pwdTxt = new JPasswordField();
		pwdTxt.setToolTipText("Enter the Password");
		pwdTxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pwdTxt.setBounds(148, 153, 265, 34);
		getContentPane().add(pwdTxt);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(Color.RED);
		lblLogin.setBackground(Color.PINK);
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblLogin.setBounds(182, 11, 131, 50);
		getContentPane().add(lblLogin);
		
		
		Icon loginicon = new ImageIcon(LoginScreen.class.getResource("loginicon.png"));
		Icon reseticon = new ImageIcon(LoginScreen.class.getResource("reset.png"));
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setIcon(loginicon);
		btnNewButton.setBounds(31, 226, 131, 75);
		getContentPane().add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setIcon(reseticon);
		btnClear.setBounds(182, 226, 151, 75);
		getContentPane().add(btnClear);
	}
}
