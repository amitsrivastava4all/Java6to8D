package com.brainmentors.ims.ui.welcome;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;
import javax.swing.border.LineBorder;

import com.brainmentors.ims.ui.MainScreen;

public class IMSSplashScreen extends JWindow {


	public static void main(String[] args) {
		
					IMSSplashScreen frame = new IMSSplashScreen();
					frame.setVisible(true);
					frame.doProgress();
				
	}
	
	private Timer timer ;
	private int counter=1;
	JProgressBar progressBar = new JProgressBar();
	JLabel projectlbl = new JLabel("Inventory Management System");
	private boolean isVisible = true;
	private void doProgress(){
		// Anonymous Class 
		ActionListener al = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				projectlbl.setVisible(isVisible);
				isVisible = !isVisible;
				progressBar.setValue(counter);
				if(counter>=100){
					timer.stop();
					IMSSplashScreen.this.setVisible(false);
					IMSSplashScreen.this.dispose();
					MainScreen mainScreen = new MainScreen();
					mainScreen.setVisible(true);
				}
				counter++;
				
			}
		};
		timer = new Timer(100, al);
		timer.start();
	}

	/**
	 * Create the frame.
	 */
	public IMSSplashScreen() {
		getContentPane().setBackground(new Color(176, 224, 230));
		Icon icon = new ImageIcon(IMSSplashScreen.class.getResource("welcome.png"));
		setBounds(100, 100, 502, 484);
		getContentPane().setLayout(null);
		
		
		projectlbl.setForeground(Color.RED);
		projectlbl.setFont(new Font("Tahoma", Font.BOLD, 24));
		projectlbl.setBounds(45, 319, 403, 54);
		getContentPane().add(projectlbl);
		
		JLabel welcomeImgLbl = new JLabel("");
		welcomeImgLbl.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		welcomeImgLbl.setIcon(icon);
		welcomeImgLbl.setBounds(30, 39, 418, 342);
		getContentPane().add(welcomeImgLbl);
		progressBar.setFont(new Font("Tahoma", Font.BOLD, 20));
		progressBar.setStringPainted(true);
		
		
		progressBar.setForeground(Color.YELLOW);
		progressBar.setBackground(Color.GREEN);
		progressBar.setBounds(24, 396, 418, 37);
		getContentPane().add(progressBar);
		
	}
}
