package praco;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praco {

	private JFrame frame;
	private JTextField textEmployeeName;
	private JTextField textRate;
	private JTextField textHour;
	private JTextField textNumberOfDays;
	private JTextField textTaxOfMonthlyWage;
	private JTextField textPhilhealth;
	private JTextField textSSS;
	private JTextField textSalary;
	private JTextField textDeduction;
	private JTextField textGross;
	private JTextField textTotalDeduction;
	private JTextField textNetSalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Praco window = new Praco();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Praco() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 977, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Simple Payroll System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(258, 0, 259, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblEmployeeName = new JLabel("Employee Name:");
		lblEmployeeName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmployeeName.setBounds(58, 49, 119, 20);
		frame.getContentPane().add(lblEmployeeName);
		
		textEmployeeName = new JTextField();
		textEmployeeName.setBounds(187, 50, 96, 19);
		frame.getContentPane().add(textEmployeeName);
		
		JLabel lblNewLabel_1 = new JLabel("Rate Per Hour:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(68, 77, 119, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		textRate = new JTextField();
		textRate.setBounds(187, 76, 96, 19);
		frame.getContentPane().add(textRate);
		textRate.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Hour Per Day:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(78, 100, 96, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		textHour = new JTextField();
		textHour.setBounds(187, 106, 96, 19);
		frame.getContentPane().add(textHour);
		textHour.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Number of days worked:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(24, 138, 180, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		textNumberOfDays = new JTextField();
		textNumberOfDays.setBounds(187, 137, 96, 19);
		frame.getContentPane().add(textNumberOfDays);
		textNumberOfDays.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("DEDUCTION OF SALARY:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setBounds(331, 45, 219, 29);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("TAX15%of Monthly Wage");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(306, 69, 174, 29);
		frame.getContentPane().add(lblNewLabel_5);
		
		textTaxOfMonthlyWage = new JTextField();
		textTaxOfMonthlyWage.setEditable(false);
		textTaxOfMonthlyWage.setBounds(495, 76, 96, 19);
		frame.getContentPane().add(textTaxOfMonthlyWage);
		textTaxOfMonthlyWage.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Philhealth 5%");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(380, 108, 125, 13);
		frame.getContentPane().add(lblNewLabel_6);
		
		textPhilhealth = new JTextField();
		textPhilhealth.setEditable(false);
		textPhilhealth.setBounds(495, 107, 96, 19);
		frame.getContentPane().add(textPhilhealth);
		textPhilhealth.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("SSS2%");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(415, 138, 90, 13);
		frame.getContentPane().add(lblNewLabel_7);
		
		textSSS = new JTextField();
		textSSS.setEditable(false);
		textSSS.setBounds(495, 137, 96, 19);
		frame.getContentPane().add(textSSS);
		textSSS.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Gross Salary:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(674, 42, 105, 35);
		frame.getContentPane().add(lblNewLabel_8);
		
		textSalary = new JTextField();
		textSalary.setEditable(false);
		textSalary.setBounds(770, 52, 96, 19);
		frame.getContentPane().add(textSalary);
		textSalary.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Deduction:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(684, 63, 90, 41);
		frame.getContentPane().add(lblNewLabel_9);
		
		textDeduction = new JTextField();
		textDeduction.setEditable(false);
		textDeduction.setBounds(770, 76, 96, 19);
		frame.getContentPane().add(textDeduction);
		textDeduction.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("GROSS SALARY:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_10.setBounds(24, 191, 190, 29);
		frame.getContentPane().add(lblNewLabel_10);

		JButton btnNewButton = new JButton("Compute");
		btnNewButton.addActionListener((ActionListener) new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				int rateperhour=Integer.valueOf(textRate.getText());
				int hourperday=Integer.valueOf(textHour.getText());
				int numberofdaysworked=Integer.valueOf(textNumberOfDays.getText());
				int grosssalary=rateperhour*hourperday*numberofdaysworked;
				textSalary.setText(String.valueOf(grosssalary));
				double tax=(double)(0.15*grosssalary);
				textTaxOfMonthlyWage.setText(String.valueOf(tax));
				double health=(double)(0.05*grosssalary);
				textPhilhealth.setText(String.valueOf(health));
				double sss=(double)(0.02*grosssalary);
				textSSS.setText(String.valueOf(sss));
				double deduction=tax+health+sss;
				textDeduction.setText(String.valueOf(deduction));
				double netsalary=grosssalary-deduction;
				textNetSalary.setText(String.valueOf(netsalary));
				textGross.setText(String.valueOf(grosssalary));
				textTotalDeduction.setText(String.valueOf(deduction));
			}
		});	
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setForeground(new Color(11, 11, 11));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(380, 246, 153, 64);
		frame.getContentPane().add(btnNewButton);
		
		
		
		textGross = new JTextField();
		textGross.setEditable(false);
		textGross.setBounds(187, 199, 96, 19);
		frame.getContentPane().add(textGross);
		
		JLabel lblNewLabel_11 = new JLabel("TOTAL DEDUCTION :");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_11.setBounds(293, 189, 192, 33);
		frame.getContentPane().add(lblNewLabel_11);
		
		textTotalDeduction = new JTextField();
		textTotalDeduction.setEditable(false);
		textTotalDeduction.setBounds(495, 199, 96, 19);
		frame.getContentPane().add(textTotalDeduction);
		textTotalDeduction.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("NET SALARY:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_12.setBounds(647, 191, 133, 29);
		frame.getContentPane().add(lblNewLabel_12);
		
		textNetSalary = new JTextField();
		textNetSalary.setEditable(false);
		textNetSalary.setBounds(770, 199, 96, 19);
		frame.getContentPane().add(textNetSalary);
		textNetSalary.setColumns(10);
		
	}
}
