package com.brainmentors.ims.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.brainmentors.ims.user.dto.UserDTO;
import com.brainmentors.ims.user.logic.ReadWriterUser;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class LoginScreen extends JFrame {
	private JTextField useridTxt;
	private JPasswordField pwdTxt;
	private MainScreen mainScreen;
	private JTable table;

	
	public static void main(String[] args) {
		
					//LoginScreen frame = new LoginScreen();
					//frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public LoginScreen(MainScreen mainScreen) {
		this.mainScreen = mainScreen;
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			    LoginScreen.this.setVisible(false);
			    LoginScreen.this.dispose();
			}
		});
		getContentPane().setForeground(Color.RED);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 770);
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		btnNewButton.setIcon(loginicon);
		btnNewButton.setBounds(31, 226, 131, 75);
		getContentPane().add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setIcon(reseticon);
		btnClear.setBounds(182, 226, 151, 75);
		getContentPane().add(btnClear);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register();
			}
		});
		btnNewButton_1.setBounds(344, 226, 151, 75);
		getContentPane().add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 312, 517, 355);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new UserTableModel());
		scrollPane.setViewportView(table);
	}
	
	private void login(){
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(useridTxt.getText());
		userDTO.setPwd(pwdTxt.getText());
		
		try{
		if(ReadWriterUser.checkLogin(userDTO)){
			JOptionPane.showMessageDialog(this, "Welcome "+userDTO.getUserid());
			mainScreen.mntmLogin.setEnabled(false);
			mainScreen.setTitle("Welcome "+userDTO.getUserid()+" in IMS");
			JMenu operations = new JMenu("Operations");
			operations.setFont(new Font("Segoe UI", Font.BOLD, 18));
			operations.setMnemonic('O');
			mainScreen.menuBar.add(operations);
			JMenuItem stock = new JMenuItem("Stock Operations");
			stock.setFont(new Font("Segoe UI", Font.BOLD, 18));
			operations.add(stock);
			JMenuItem wareHouse = new JMenuItem("WareHouse Operations");
			wareHouse.setFont(new Font("Segoe UI", Font.BOLD, 18));
			operations.add(wareHouse);
			mainScreen.menuBar.revalidate();
			this.setVisible(false);
			this.dispose();
		}
		else
		{
			JOptionPane.showMessageDialog(this, "Invalid Userid or Password ");
		}
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(this, "Some Error During Login...");
			e.printStackTrace();
		}
	}
	
	private void register(){
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(useridTxt.getText());
		userDTO.setPwd(pwdTxt.getText());
		userDTO.setEmail("abcd@yahoo.com");
		userDTO.setPhone("11111");
		ArrayList<UserDTO> userList = new ArrayList<>();
		userList.add(userDTO);
		
		try{
			ArrayList<UserDTO> users = ReadWriterUser.readUsers();
			if(users!=null){
				for(UserDTO u : users){
					userList.add(u);
				}
			}
		if(ReadWriterUser.registerUser(userList)){
			JOptionPane.showMessageDialog(this, "User Register .....");
			table.setModel(new UserTableModel());
		}
		}
		catch(IOException e){
			JOptionPane.showMessageDialog(this, "Error in User Register....");
			e.printStackTrace();
		}
	}
}
