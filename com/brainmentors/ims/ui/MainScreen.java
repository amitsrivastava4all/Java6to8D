package com.brainmentors.ims.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import org.jfree.ui.RefineryUtilities;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainScreen extends JFrame {

	// Instance Variables
	
	JMenuItem mntmLogin = new JMenuItem("Login/Register");
	JMenuBar menuBar = new JMenuBar();
	/**
	 * Create the frame.
	 */
	public MainScreen() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int choice = JOptionPane.showConfirmDialog(MainScreen.this,"Do u really wanna to close this window","IMS",JOptionPane.YES_NO_OPTION);
				if(choice==JOptionPane.YES_OPTION){
					System.exit(0);
				}
				else
				{
					return;
				}
			}
		});
		ImageIcon imageIcon = new ImageIcon(MainScreen.class.getResource("logo.png"));
		this.setIconImage(imageIcon.getImage());
		this.setTitle("IMS-2016");
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		Icon icon = new ImageIcon(MainScreen.class.getResource("giphy.gif"));
		JLabel backgroundImg = new JLabel("");
		backgroundImg.setIcon(icon);
		backgroundImg.setBounds(28, 27, 715, 577);
		getContentPane().add(backgroundImg);
		
		
		setJMenuBar(menuBar);
		
		JMenu mnUser = new JMenu("User");
		mnUser.setFont(new Font("Segoe UI", Font.BOLD, 18));
		mnUser.setMnemonic('U');
		menuBar.add(mnUser);
		
		
		mntmLogin.setIcon(new ImageIcon(MainScreen.class.getResource("/com/brainmentors/ims/ui/loginicon.png")));
		mntmLogin.setFont(new Font("Segoe UI", Font.BOLD, 18));
		mntmLogin.setAccelerator(KeyStroke.getKeyStroke(
		        java.awt.event.KeyEvent.VK_U, 
		        java.awt.Event.CTRL_MASK));
		mntmLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginScreen loginScreen = new LoginScreen(MainScreen.this);
				loginScreen.setVisible(true);
			}
		});
		mntmLogin.setMnemonic(KeyEvent.VK_L);
		mnUser.add(mntmLogin);
		
		JMenuItem mntmPiechart = new JMenuItem("PieChart");
		mntmPiechart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPieChart();
			}
		});
		mntmPiechart.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnUser.add(mntmPiechart);
		
		JMenuItem mntmRegister = new JMenuItem("AboutUs");
		mntmRegister.setFont(new Font("Segoe UI", Font.BOLD, 18));
		mnUser.add(mntmRegister);
		
		mnUser.addSeparator();
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setForeground(Color.RED);
		mntmExit.setFont(new Font("Segoe UI", Font.BOLD, 18));
		mnUser.add(mntmExit);
		
		
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	private void showPieChart(){
		PieChartDemo demo = new PieChartDemo("IMS - Most Selling Products");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
	}
}
