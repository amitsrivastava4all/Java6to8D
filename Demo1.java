import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Demo1 extends JFrame {
	private JTextField firstTxt;
	private JTextField secondTxt;
	JLabel resultLbl = new JLabel("");
	private JTextField resultTxt;
	private JButton ninebt;
	private JButton eightbt;
	private JButton sevenbt;
	private JButton addbt;
	private JButton equalbt;
	int firstNo ;
	String operator ;
	
	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		obj.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Demo1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 440);
		getContentPane().setLayout(null);
		
		JButton btnOk = new JButton("+");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addLogic();
				/*JOptionPane.showMessageDialog(Demo1.this, "U Click on OK");*/
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnOk.setBounds(524, 11, 89, 23);
		getContentPane().add(btnOk);
		
		firstTxt = new JTextField();
		firstTxt.setToolTipText("Enter the First No");
		firstTxt.setFont(new Font("Tahoma", Font.BOLD, 18));
		firstTxt.setBounds(248, 39, 331, 41);
		getContentPane().add(firstTxt);
		firstTxt.setColumns(10);
		
		secondTxt = new JTextField();
		secondTxt.setToolTipText("Enter the Second No");
		secondTxt.setFont(new Font("Tahoma", Font.BOLD, 18));
		secondTxt.setColumns(10);
		secondTxt.setBounds(248, 155, 331, 41);
		getContentPane().add(secondTxt);
		
		
		resultLbl.setHorizontalAlignment(SwingConstants.CENTER);
		resultLbl.setForeground(Color.RED);
		resultLbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		resultLbl.setBounds(29, 59, 198, 82);
		getContentPane().add(resultLbl);
		
		resultTxt = new JTextField();
		resultTxt.setHorizontalAlignment(SwingConstants.RIGHT);
		resultTxt.setToolTipText("Enter the Second No");
		resultTxt.setFont(new Font("Tahoma", Font.BOLD, 18));
		resultTxt.setColumns(10);
		resultTxt.setBounds(248, 238, 331, 41);
		getContentPane().add(resultTxt);
		
		ninebt = new JButton("9");
		ninebt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			printOperand(ninebt); //Call
			}
		});
		ninebt.setFont(new Font("Tahoma", Font.BOLD, 18));
		ninebt.setBounds(477, 320, 89, 23);
		getContentPane().add(ninebt);
		
		eightbt = new JButton("8");
		eightbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printOperand(eightbt);
			}
		});
		eightbt.setFont(new Font("Tahoma", Font.BOLD, 18));
		eightbt.setBounds(357, 323, 89, 23);
		getContentPane().add(eightbt);
		
		sevenbt = new JButton("7");
		sevenbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printOperand(sevenbt);
			}
		});
		sevenbt.setFont(new Font("Tahoma", Font.BOLD, 18));
		sevenbt.setBounds(219, 323, 89, 23);
		getContentPane().add(sevenbt);
		
		addbt = new JButton("+");
		addbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber();
			}
		});
		addbt.setFont(new Font("Tahoma", Font.BOLD, 18));
		addbt.setBounds(94, 323, 89, 23);
		getContentPane().add(addbt);
		
		equalbt = new JButton("=");
		equalbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcLogic();
			}
		});
		equalbt.setFont(new Font("Tahoma", Font.BOLD, 18));
		equalbt.setBounds(94, 357, 89, 23);
		getContentPane().add(equalbt);
		
	}
	private void addLogic(){
		int result = Integer.parseInt(firstTxt.getText()) + Integer.parseInt(secondTxt.getText());
		resultLbl.setText(String.valueOf(result));
	}
	//Define
	private void printOperand(JButton button){
		resultTxt.setText(resultTxt.getText() + button.getText());
	}
	private void addNumber(){
		firstNo = Integer.parseInt(resultTxt.getText());
		resultTxt.setText("");
		operator = "+";
	}
	private void calcLogic(){
		int result = 0;
		switch(operator){
		case "+":
			result = firstNo + Integer.parseInt(resultTxt.getText());
			break;
			
		}
		resultTxt.setText(String.valueOf(result));
	}
}
