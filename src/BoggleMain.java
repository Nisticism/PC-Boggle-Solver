import java.awt.EventQueue;
import javax.swing.*;

import java.awt.Font;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class BoggleMain {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoggleMain window = new BoggleMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private JTextField a1;
	private JTextField a2;
	private JTextField a3;
	private JTextField a4;
	private JTextField b1;
	private JTextField b2;
	private JTextField b3;
	private JTextField b4;
	private JTextField c1;
	private JTextField c2;
	private JTextField c3;
	private JTextField c4;
	private JTextField d1;
	private JTextField d2;
	private JTextField d3;
	private JTextField d4;
	
	String aa1;
	String aa2;
	String aa3;
	String aa4;
	
	String bb1;
	String bb2;
	String bb3;
	String bb4;
	
	String cc1;
	String cc2;
	String cc3;
	String cc4;
	
	String dd1;
	String dd2;
	String dd3;
	String dd4;
	
	/**
	 * Create the application.
	 */
	
	public BoggleMain() {
		initialize();
	}
	
	public void StringGetter() {
		aa1 = a1.getText();
		aa2 = a2.getText();
		aa3 = a3.getText();
		aa4 = a4.getText();
		
		bb1 = b1.getText();
		bb2 = b2.getText();
		bb3 = b3.getText();
		bb4 = b4.getText();
		
		cc1 = c1.getText();
		cc2 = c2.getText();
		cc3 = c3.getText();
		cc4 = c4.getText();
		
		dd1 = d1.getText();
		dd2 = d2.getText();
		dd3 = d3.getText();
		dd4 = d4.getText();
	}
	
	public void SolverChecker() {
		
		if (aa1.length() != 1 || aa2.length() != 1 || aa3.length() != 1 || aa4.length() != 1 || bb1.length() != 1 || bb2.length() != 1 || bb3.length() != 1 || bb4.length() != 1 || cc1.length() != 1 || cc2.length() != 1 || cc3.length() != 1 || cc4.length() != 1 || dd1.length() != 1 || dd2.length() != 1 || dd3.length() != 1 || dd4.length() != 1) {
			JOptionPane.showMessageDialog(null, "Please enter one letter in each box");		
		}
		else if (aa1.length() == 1 && aa2.length() == 1 && aa3.length() == 1 && aa4.length() == 1 && bb1.length() == 1 && bb2.length() == 1 && bb3.length() == 1 && bb4.length() == 1 && cc1.length() == 1 && cc2.length() == 1 && cc3.length() == 1 && cc4.length() == 1 && dd1.length() == 1 && dd2.length() == 1 && dd3.length() == 1 && dd4.length() == 1) {
			new SolverOpener(aa1,aa2,aa3,aa4,bb1,bb2,bb3,bb4,cc1,cc2,cc3,cc4,dd1,dd2,dd3,dd4);
			frame.dispose();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 551, 328);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		a1 = new JTextField();
		a1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		a1.setBounds(39, 72, 48, 29);
		//a1.setText("a");
		frame.getContentPane().add(a1);
		a1.setColumns(10);
		
		JLabel lblHealthInsuranceNumber = new JLabel("Enter all the letters on the board: ");
		lblHealthInsuranceNumber.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblHealthInsuranceNumber.setBounds(55, 37, 204, 23);
		frame.getContentPane().add(lblHealthInsuranceNumber);
		
		JLabel takafulFundRecords = new JLabel("Boggle Solver");
		takafulFundRecords.setFont(new Font("Arial", Font.ITALIC, 20));
		takafulFundRecords.setBounds(89, 0, 216, 37);
		frame.getContentPane().add(takafulFundRecords);
		
		
		a2 = new JTextField();
		a2.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		a2.setColumns(10);
		a2.setBounds(104, 72, 48, 29);
		//a2.setText("b");
		frame.getContentPane().add(a2);
		
		a3 = new JTextField();
		a3.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		a3.setColumns(10);
		a3.setBounds(169, 72, 48, 29);
		//a3.setText("c");
		frame.getContentPane().add(a3);
		
		a4 = new JTextField();
		a4.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		a4.setColumns(10);
		a4.setBounds(234, 72, 48, 29);
		//a4.setText("t");
		frame.getContentPane().add(a4);
		
		b1 = new JTextField();
		b1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		b1.setColumns(10);
		b1.setBounds(39, 119, 48, 29);
		//b1.setText("o");
		frame.getContentPane().add(b1);
		
		b2 = new JTextField();
		b2.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		b2.setColumns(10);
		b2.setBounds(104, 120, 48, 29);
		//b2.setText("r");
		frame.getContentPane().add(b2);
		
		b3 = new JTextField();
		b3.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		b3.setColumns(10);
		b3.setBounds(169, 120, 48, 29);
		//b3.setText("u");
		frame.getContentPane().add(b3);
		
		b4 = new JTextField();
		b4.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		b4.setColumns(10);
		b4.setBounds(234, 120, 48, 29);
		//b4.setText("d");
		frame.getContentPane().add(b4);
		
		c1 = new JTextField();
		c1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		c1.setColumns(10);
		c1.setBounds(39, 167, 48, 29);
		//c1.setText("s");
		frame.getContentPane().add(c1);
		
		c2 = new JTextField();
		c2.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		c2.setColumns(10);
		c2.setBounds(104, 168, 48, 29);
		//c2.setText("n");
		frame.getContentPane().add(c2);
		
		c3 = new JTextField();
		c3.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		c3.setColumns(10);
		c3.setBounds(169, 168, 48, 29);
		//c3.setText("i");
		frame.getContentPane().add(c3);
		
		c4 = new JTextField();
		c4.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		c4.setColumns(10);
		c4.setBounds(234, 168, 48, 29);
		//c4.setText("m");
		frame.getContentPane().add(c4);
		
		d1 = new JTextField();
		d1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		d1.setColumns(10);
		d1.setBounds(39, 213, 48, 29);
		//d1.setText("r");
		frame.getContentPane().add(d1);
		
		d2 = new JTextField();
		d2.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		d2.setColumns(10);
		d2.setBounds(104, 213, 48, 29);
		//d2.setText("o");
		frame.getContentPane().add(d2);
		
		d3 = new JTextField();
		d3.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		d3.setColumns(10);
		d3.setBounds(169, 213, 48, 29);
		//d3.setText("r");
		frame.getContentPane().add(d3);
		
		d4 = new JTextField();
		d4.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		d4.setColumns(10);
		d4.setBounds(234, 213, 48, 29);
		//d4.setText("s");
		frame.getContentPane().add(d4);
		
		JButton Solve = new JButton("Solve");
		Solve.setForeground(new Color(153, 0, 0));
		Solve.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		Solve.setBackground(UIManager.getColor("Button.light"));
		Solve.setBounds(330, 214, 180, 31);
		Solve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StringGetter();
				SolverChecker();
			}
		});
		frame.getContentPane().add(Solve);
	}
}