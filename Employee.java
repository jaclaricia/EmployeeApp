package EmployeeApp;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Employee {

	public JFrame frmMotorPhEmployee;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee window = new Employee();
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
	public Employee() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmMotorPhEmployee = new JFrame();
		frmMotorPhEmployee.setTitle("Motor PH: Employee App - Claricia, J. A.");
		frmMotorPhEmployee.setBounds(200, 200, 499, 323);
		frmMotorPhEmployee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMotorPhEmployee.getContentPane().setLayout(null);
		
		//Frame compositions (Labels, Button, Text Fields, etc.)
		
		JLabel lblNewLabel = new JLabel("Employee");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(31, 20, 226, 24);
		frmMotorPhEmployee.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setBounds(31, 90, 46, 14);
		frmMotorPhEmployee.getContentPane().add(lblName);
		
		JLabel lblEmpNo = new JLabel("Employee No. :");
		lblEmpNo.setBounds(298, 251, 94, 14);
		frmMotorPhEmployee.getContentPane().add(lblEmpNo);
		
		JLabel lblNewLabel_3 = new JLabel("Address :");
		lblNewLabel_3.setBounds(31, 115, 46, 14);
		frmMotorPhEmployee.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Birthday :");
		lblNewLabel_4.setBounds(31, 140, 64, 14);
		frmMotorPhEmployee.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email :");
		lblNewLabel_5.setBounds(31, 165, 46, 14);
		frmMotorPhEmployee.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Contact No. :");
		lblNewLabel_6.setBounds(31, 190, 80, 14);
		frmMotorPhEmployee.getContentPane().add(lblNewLabel_6);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 61, 484, 8);
		frmMotorPhEmployee.getContentPane().add(separator);
		
		JLabel lblEmpNoField = new JLabel("2022999999");
		lblEmpNoField.setBounds(384, 251, 100, 14);
		frmMotorPhEmployee.getContentPane().add(lblEmpNoField);
		
		JLabel lblNameField = new JLabel("Juan Dela Cruz");
		lblNameField.setBounds(113, 90, 103, 14);
		frmMotorPhEmployee.getContentPane().add(lblNameField);
		
		JLabel lblAddressField = new JLabel("Mapua Malayan Digital College");
		lblAddressField.setBounds(113, 115, 175, 14);
		frmMotorPhEmployee.getContentPane().add(lblAddressField);
		
		JLabel lblNewLabel_8 = new JLabel("01/01/1900");
		lblNewLabel_8.setBounds(113, 140, 103, 14);
		frmMotorPhEmployee.getContentPane().add(lblNewLabel_8);
		
		JLabel lblEmailField = new JLabel("delacruzjuan@mmdc.mcl.edu.ph");
		lblEmailField.setBounds(113, 165, 175, 14);
		frmMotorPhEmployee.getContentPane().add(lblEmailField);
		
		JLabel lblContactNoField = new JLabel("+639999999999");
		lblContactNoField.setBounds(113, 190, 124, 14);
		frmMotorPhEmployee.getContentPane().add(lblContactNoField);
		
		ImageIcon originalIcon = new ImageIcon(Employee.class.getResource("/Icons/profile.jpg"));
		Image originalImage = originalIcon.getImage();
		Image resizedImage = originalImage.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		ImageIcon resizedIcon = new ImageIcon(resizedImage);
		JLabel lblEmpPic = new JLabel();
		lblEmpPic.setIcon(resizedIcon);
		
		lblEmpPic.setBounds(298, 90, 150, 150);
		frmMotorPhEmployee.getContentPane().add(lblEmpPic);
		
		//Logout on click, backs to login frame
		
		JButton btnExit = new JButton("Logout");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginSystem login = new LoginSystem();
				frmMotorPhEmployee.setVisible(false);
				login.frmDfsf.setVisible(true);
				
			}
		});
		
		btnExit.setBounds(149, 226, 108, 39);
		frmMotorPhEmployee.getContentPane().add(btnExit);
		
		
		//To payroll frame on click
		
		JButton btnPayroll = new JButton("Payroll");
		btnPayroll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payroll pay = new Payroll();
				frmMotorPhEmployee.setVisible(false);
				pay.frmMotorPhEmployee.setVisible(true);
			}
		});
		
		btnPayroll.setBounds(31, 226, 108, 39);
		frmMotorPhEmployee.getContentPane().add(btnPayroll);
		
		frmMotorPhEmployee.setVisible(true);
	}
}

