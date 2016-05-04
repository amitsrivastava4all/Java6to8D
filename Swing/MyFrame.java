import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// Step -1 extends JFrame
public class MyFrame extends JFrame {
	// Design
	MyFrame(){
		// Step -2 Create Button and Add it in ContentPane
		JButton ok = new JButton("Ok");
		JButton cancel = new JButton("Cancel");
		this.getContentPane().setLayout(null);
		ok.setBounds(10, 20, 70, 50);
		cancel.setBounds(10, 90, 90, 50);
		//this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().add(ok);
		this.getContentPane().add(cancel);
		this.setSize(300,200);
		this.setLocation(200, 100);
		this.setTitle("MyFrame");
		
	}
	public static void main(String[] args) {
		MyFrame obj = new MyFrame();
		
		obj.setVisible(true);
		

	}

}
