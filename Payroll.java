package EmployeeApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.io.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Payroll {

	public JFrame frmMotorPhEmployee;
	private JLabel lblProfilePic;
	private JTextField txtBasicSalary;
	private JTextField txtPhone;
	private JTextField txtClothing;
	private JTextField txtRice;
	private JTextField txtBonus;
	private JTextField txtInsurance;
	private JTextField txtName;
	private JTextField txtDepartment;
	private JTextField txtEmail;
	private JTextField txtAddress;
	private JTextField txtContact;
	private JTextField txtBirthday;
	private JTextField txtTax;
	private JTextField txtNet;
	private JTextField txtGross;

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
		frmMotorPhEmployee.setBounds(100, 100, 511, 349);
		frmMotorPhEmployee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMotorPhEmployee.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 59, 475, 194);
		frmMotorPhEmployee.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Information", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 11, 63, 14);
		panel.add(lblName);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(10, 36, 81, 14);
		panel.add(lblDepartment);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(10, 86, 81, 14);
		panel.add(lblAddress);
		
		lblProfilePic = new JLabel("Picture");
		lblProfilePic.setBounds(315, 11, 150, 150);
		panel.add(lblProfilePic);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 61, 46, 14);
		panel.add(lblEmail);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setBounds(10, 111, 63, 14);
		panel.add(lblContact);
		
		JLabel lblBirthday = new JLabel("Birthday");
		lblBirthday.setBounds(10, 136, 63, 14);
		panel.add(lblBirthday);
		
		txtName = new JTextField();
		txtName.setBounds(83, 8, 222, 20);
		panel.add(txtName);
		txtName.setColumns(10);
		
		txtDepartment = new JTextField();
		txtDepartment.setColumns(10);
		txtDepartment.setBounds(83, 33, 222, 20);
		panel.add(txtDepartment);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(83, 58, 222, 20);
		panel.add(txtEmail);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(83, 83, 222, 20);
		panel.add(txtAddress);
		
		txtContact = new JTextField();
		txtContact.setColumns(10);
		txtContact.setBounds(83, 108, 222, 20);
		panel.add(txtContact);
		
		txtBirthday = new JTextField();
		txtBirthday.setColumns(10);
		txtBirthday.setBounds(83, 133, 222, 20);
		panel.add(txtBirthday);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Payroll", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblBasic = new JLabel("Basic Salary");
		lblBasic.setBounds(10, 11, 91, 14);
		panel_1.add(lblBasic);
		
		JLabel lblAllowance = new JLabel("Allowances");
		lblAllowance.setBounds(10, 36, 72, 14);
		panel_1.add(lblAllowance);
		
		JLabel lblClothing = new JLabel("Clothing");
		lblClothing.setBounds(20, 61, 62, 14);
		panel_1.add(lblClothing);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(20, 86, 46, 14);
		panel_1.add(lblPhone);
		
		JLabel lblRice = new JLabel("Rice Subsidy");
		lblRice.setBounds(20, 111, 77, 14);
		panel_1.add(lblRice);
		
		JLabel lblBonus = new JLabel("Bonus");
		lblBonus.setBounds(10, 136, 72, 14);
		panel_1.add(lblBonus);
		
		JLabel lblDeduction = new JLabel("Deductions");
		lblDeduction.setBounds(249, 11, 72, 14);
		panel_1.add(lblDeduction);
		
		JLabel lblInsurance = new JLabel("Insurance");
		lblInsurance.setBounds(259, 36, 62, 14);
		panel_1.add(lblInsurance);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(231, 61, 9, 3);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(259, 61, 46, 14);
		panel_1.add(lblTax);
		
		JLabel lblNet = new JLabel("Salary (Net)");
		lblNet.setBounds(249, 86, 72, 14);
		panel_1.add(lblNet);
		
		JLabel lblGross = new JLabel("Salary (Gross)");
		lblGross.setBounds(246, 111, 91, 14);
		panel_1.add(lblGross);
		
		txtBasicSalary = new JTextField();
		txtBasicSalary.setBounds(111, 8, 118, 20);
		panel_1.add(txtBasicSalary);
		txtBasicSalary.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(111, 83, 118, 20);
		panel_1.add(txtPhone);
		txtPhone.setColumns(10);
		
		txtClothing = new JTextField();
		txtClothing.setBounds(111, 58, 118, 20);
		panel_1.add(txtClothing);
		txtClothing.setColumns(10);
		
		txtRice = new JTextField();
		txtRice.setBounds(111, 108, 118, 20);
		panel_1.add(txtRice);
		txtRice.setColumns(10);
		
		txtBonus = new JTextField();
		txtBonus.setBounds(111, 133, 118, 20);
		panel_1.add(txtBonus);
		txtBonus.setColumns(10);
		
		txtInsurance = new JTextField();
		txtInsurance.setBounds(347, 33, 118, 20);
		panel_1.add(txtInsurance);
		txtInsurance.setColumns(10);
		
		txtTax = new JTextField();
		txtTax.setColumns(10);
		txtTax.setBounds(347, 58, 118, 20);
		panel_1.add(txtTax);
		
		txtNet = new JTextField();
		txtNet.setColumns(10);
		txtNet.setBounds(347, 83, 118, 20);
		panel_1.add(txtNet);
		
		txtGross = new JTextField();
		txtGross.setColumns(10);
		txtGross.setBounds(347, 108, 118, 20);
		panel_1.add(txtGross);
		
		JLabel lblEmployeeName = new JLabel("Employee No.");
		lblEmployeeName.setBounds(10, 26, 101, 14);
		frmMotorPhEmployee.getContentPane().add(lblEmployeeName);
		
		//Logouts the Employee Window and brings back the Login Window
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginSystem login = new LoginSystem();
				frmMotorPhEmployee.setVisible(false);
				login.frmDfsf.setVisible(true);	
			}
		});
		
		btnLogout.setBounds(376, 264, 109, 35);
		frmMotorPhEmployee.getContentPane().add(btnLogout);
		
		//Reads the textfile from local directory
		JComboBox<String> comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox.getSelectedItem().equals("1111")) {
					try {
						BufferedReader reader = new BufferedReader(
								new FileReader("C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\1111.txt"));
						
						//Reads the text file per line and outputs per line to their respective textfields
						String name = reader.readLine();
						txtName.setText(name);
						String department = reader.readLine();
						txtDepartment.setText(department);
						String email = reader.readLine();
						txtEmail.setText(email);
						String address = reader.readLine();
						txtAddress.setText(address);
						String contact = reader.readLine();
						txtContact.setText(contact);
						String birthday = reader.readLine();
						txtBirthday.setText(birthday);
						String basic = reader.readLine();
						txtBasicSalary.setText(basic);
						String clothing = reader.readLine();
						txtClothing.setText(clothing);
						String phone = reader.readLine();
						txtPhone.setText(phone);
						String rice = reader.readLine();
						txtRice.setText(rice);
						String bonus = reader.readLine();
						txtBonus.setText(bonus);
						String insurance = reader.readLine();
						txtInsurance.setText(insurance);
						String tax = reader.readLine();
						txtTax.setText(tax);
						String net = reader.readLine();
						txtNet.setText(net);
						String gross = reader.readLine();
						txtGross.setText(gross);									
						reader.close();
						
						lblProfilePic.setIcon(new ImageIcon("C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Icons\\male.png"));					
	
					}catch(IOException ex) {
						JOptionPane.showMessageDialog(null,"File not found");
					}
				}else if(comboBox.getSelectedItem().equals("2222")) {
					try {
						BufferedReader reader = new BufferedReader(
								new FileReader("C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\2222.txt"));
						
						//Reads the text file per line and outputs per line to their respective textfields
						String name = reader.readLine();
						txtName.setText(name);
						String department = reader.readLine();
						txtDepartment.setText(department);
						String email = reader.readLine();
						txtEmail.setText(email);
						String address = reader.readLine();
						txtAddress.setText(address);
						String contact = reader.readLine();
						txtContact.setText(contact);
						String birthday = reader.readLine();
						txtBirthday.setText(birthday);
						String basic = reader.readLine();
						txtBasicSalary.setText(basic);
						String clothing = reader.readLine();
						txtClothing.setText(clothing);
						String phone = reader.readLine();
						txtPhone.setText(phone);
						String rice = reader.readLine();
						txtRice.setText(rice);
						String bonus = reader.readLine();
						txtBonus.setText(bonus);
						String insurance = reader.readLine();
						txtInsurance.setText(insurance);
						String tax = reader.readLine();
						txtTax.setText(tax);
						String net = reader.readLine();
						txtNet.setText(net);
						String gross = reader.readLine();
						txtGross.setText(gross);									
						reader.close();
						
						lblProfilePic.setIcon(new ImageIcon("C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Icons\\female.png"));
						BufferedImage image = ImageIO.read(new File("C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Icons\\female.png"));
								
					}catch(IOException ex) {
						JOptionPane.showMessageDialog(null,"File not found");
					}		
				}else if(comboBox.getSelectedItem().equals("....")) {
					
					//Sets the textfields to empty
					txtName.setText("....");
					txtDepartment.setText("....");
					txtEmail.setText("....");
					txtAddress.setText("....");
					txtContact.setText("....");
					txtBirthday.setText(".....");
					txtBasicSalary.setText(".....");
					txtClothing.setText(".....");
					txtPhone.setText(".....");
					txtRice.setText(".....");
					txtBonus.setText(".....");
					txtInsurance.setText(".....");
					txtTax.setText(".....");
					txtNet.setText(".....");
					txtGross.setText(".....");
					lblProfilePic.setIcon(new ImageIcon("C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Icons\\blank.png"));
				}
			}			
		});
		
		comboBox.setToolTipText("");
		comboBox.setBounds(88, 22, 67, 22);
		comboBox.addItem("....");
		comboBox.addItem("1111");
		comboBox.addItem("2222");
		frmMotorPhEmployee.getContentPane().add(comboBox);
	
	}
}
