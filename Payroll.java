package EmployeeApp;

import java.awt.EventQueue;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Font;

public class Payroll {

	public JFrame frmMotorPhEmployee;
	private JTextField txtBasicSalary;
	private JTextField txtClothing;
	private JTextField txtPhone;
	private JTextField txtRice;
	private JTextField txtBonus;
	private JTextField txtTax;
	private JTextField txtInsurance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payroll window = new Payroll();
					window.frmMotorPhEmployee.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Payroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//Composition of frame (Label, Button, Text field, etc.)
		frmMotorPhEmployee = new JFrame();
		frmMotorPhEmployee.setTitle("Motor PH: Employee App - Claricia, J. A.");
		frmMotorPhEmployee.setBounds(100, 100, 510, 334);
		frmMotorPhEmployee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMotorPhEmployee.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Payroll");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(23, 20, 144, 27);
		frmMotorPhEmployee.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 63, 493, 9);
		frmMotorPhEmployee.getContentPane().add(separator);
		
		JLabel lblBasic = new JLabel("Basic Salary : ");
		lblBasic.setBounds(23, 83, 86, 14);
		frmMotorPhEmployee.getContentPane().add(lblBasic);
		
		JLabel lblBonus = new JLabel("Bonus : ");
		lblBonus.setBounds(23, 193, 56, 14);
		frmMotorPhEmployee.getContentPane().add(lblBonus);
		
		JLabel lblAllowance = new JLabel("Allowances");
		lblAllowance.setBounds(23, 108, 86, 14);
		frmMotorPhEmployee.getContentPane().add(lblAllowance);
		
		JLabel lblDeductions = new JLabel("Deductions");
		lblDeductions.setBounds(269, 83, 77, 14);
		frmMotorPhEmployee.getContentPane().add(lblDeductions);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 222, 493, 9);
		frmMotorPhEmployee.getContentPane().add(separator_1);
		
		JLabel lblGross = new JLabel("Gross Salary : ");
		lblGross.setBounds(269, 193, 87, 14);
		frmMotorPhEmployee.getContentPane().add(lblGross);
		
		JLabel lblClothing = new JLabel("Clothing : ");
		lblClothing.setBounds(33, 128, 76, 14);
		frmMotorPhEmployee.getContentPane().add(lblClothing);
		
		JLabel lblPhone = new JLabel("Phone :");
		lblPhone.setBounds(33, 148, 67, 14);
		frmMotorPhEmployee.getContentPane().add(lblPhone);
		
		JLabel lblRice = new JLabel("Rice : ");
		lblRice.setBounds(33, 168, 46, 14);
		frmMotorPhEmployee.getContentPane().add(lblRice);
		
		JLabel lblNewLabel_5 = new JLabel("Tax : ");
		lblNewLabel_5.setBounds(279, 108, 67, 14);
		frmMotorPhEmployee.getContentPane().add(lblNewLabel_5);
		
		JLabel lblInsurance = new JLabel("Insurance :");
		lblInsurance.setBounds(279, 128, 77, 14);
		frmMotorPhEmployee.getContentPane().add(lblInsurance);
		
		JLabel lblNet = new JLabel("Net Salary : ");
		lblNet.setBounds(269, 168, 67, 14);
		frmMotorPhEmployee.getContentPane().add(lblNet);
		
		JLabel lblNetResult = new JLabel("...");
		lblNetResult.setBounds(356, 168, 99, 14);
		frmMotorPhEmployee.getContentPane().add(lblNetResult);
		
		JLabel lblGrossResult = new JLabel("...");
		lblGrossResult.setBounds(356, 193, 99, 14);
		frmMotorPhEmployee.getContentPane().add(lblGrossResult);
		
		txtBasicSalary = new JTextField();
		txtBasicSalary.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c) && c != '.') {
					e.consume();
				}
			}
		});
		
		txtBasicSalary.setBounds(119, 83, 86, 20);
		frmMotorPhEmployee.getContentPane().add(txtBasicSalary);
		txtBasicSalary.setColumns(10);
		
		//This portion won't allow user to type a String on the textfield which requires a "Digit" or int datatype.
		txtClothing = new JTextField();
		txtClothing.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c) && c != '.') {
					//this consume means if the user type a "letter" it will not appear on the textfield, only numbers are valid input.
					e.consume();
				}
			}
		});
		
		txtClothing.setBounds(119, 125, 86, 20);
		frmMotorPhEmployee.getContentPane().add(txtClothing);
		txtClothing.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c) && c != '.') {
					e.consume();
				}
			}
		});
		
		txtPhone.setBounds(119, 145, 86, 20);
		frmMotorPhEmployee.getContentPane().add(txtPhone);
		txtPhone.setColumns(10);
		
		txtRice = new JTextField();
		txtRice.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c) && c != '.') {
					e.consume();
				}
			}
		});
		
		txtRice.setBounds(119, 165, 86, 20);
		frmMotorPhEmployee.getContentPane().add(txtRice);
		txtRice.setColumns(10);
		
		txtBonus = new JTextField();
		txtBonus.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c) && c != '.') {
					e.consume();
				}
			}
		});
		
		txtBonus.setBounds(119, 190, 86, 20);
		frmMotorPhEmployee.getContentPane().add(txtBonus);
		txtBonus.setColumns(10);
		
		txtTax = new JTextField();
		txtTax.setText("(10%)");
		txtTax.setForeground(Color.GRAY);
		txtTax.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c) && c != '.') {
					e.consume();
				}
			}
		});
		
		txtTax.setBounds(356, 105, 99, 20);
		frmMotorPhEmployee.getContentPane().add(txtTax);
		txtTax.setColumns(10);
		
		txtInsurance = new JTextField();
		txtInsurance.setText("(10%)");
		txtInsurance.setForeground(Color.GRAY);
		txtInsurance.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c) && c != '.') {
					e.consume();
				}
			}
		});
		
		txtInsurance.setBounds(356, 125, 99, 20);
		frmMotorPhEmployee.getContentPane().add(txtInsurance);
		txtInsurance.setColumns(10);
		
		//This profile button will close the Payroll frame and open the Employee frame
		JButton btnProfile = new JButton("Profile");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee emp = new Employee();
				frmMotorPhEmployee.setVisible(false);
				emp.frmMotorPhEmployee.setVisible(true);
			}
		});
		
		btnProfile.setBounds(23, 240, 86, 38);
		frmMotorPhEmployee.getContentPane().add(btnProfile);
		
		//Computation of Net and Gross Salary
		JButton btnCompute = new JButton("Compute");
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Converts textfields datatype to int, computation purposes
				double basicSalary = Double.parseDouble(txtBasicSalary.getText());
				double clothing = Double.parseDouble(txtClothing.getText());
				double phone = Double.parseDouble(txtPhone.getText());
				double rice = Double.parseDouble(txtRice.getText());
				double bonus = Double.parseDouble(txtBonus.getText());
				
				//Computations and conversions of String to Int datatype
				
				//DecimalFormat class which is already included in java library. It is use to format decimal places
				DecimalFormat df = new DecimalFormat("#.##");
				
				//Formats the output to 2 decimal places
				double tax = Double.parseDouble(txtBasicSalary.getText()) * (0.10);
				String taxDeci = df.format(tax);
				double insurance = Double.parseDouble(txtBasicSalary.getText()) * (0.10);
				String insuranceDeci = df.format(insurance);
				
				//Displays computed tax and insurance in "JTextField"
				txtTax.setText(String.valueOf(taxDeci));
				txtInsurance.setText(String.valueOf(insuranceDeci));
				
				//Formats the output to 2 decimal places
				double net = basicSalary + clothing + phone + rice + bonus ;
				String netDeci = df.format(net);
				double gross = net - (tax + insurance);
				String grossDeci = df.format(gross);
				
				//Converstion of int datatype to string to display it on the "JLabel";
				lblNetResult.setText(String.valueOf(netDeci));
				lblGrossResult.setText(String.valueOf(grossDeci));
				
			}
		});
		
		btnCompute.setBounds(284, 240, 86, 38);
		frmMotorPhEmployee.getContentPane().add(btnCompute);
		
		//Reset all the text field to empty
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBasicSalary.setText(null);
				txtClothing.setText(null);
				txtPhone.setText(null);
				txtRice.setText(null);
				txtBonus.setText(null);
				txtTax.setText("(10%)");
				txtTax.setForeground(Color.GRAY);
				txtInsurance.setText("(10%)");
				txtInsurance.setForeground(Color.GRAY);
				lblNetResult.setText("...");
				lblGrossResult.setText("...");	
			}
		});
		
		btnReset.setBounds(381, 240, 86, 38);
		frmMotorPhEmployee.getContentPane().add(btnReset);
	}
}
