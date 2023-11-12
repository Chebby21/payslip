package payroll;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Payroll {

	private JFrame frame;
	private JTextField textField;
	private JTextField textSalary;
	private JTextField textFM;
	private JTextField textFT;
	private JTextField textFW;
	private JTextField textFTH;
	private JTextField textFF;
	private JTextField textFS;
	private JTextField textFSU;
	private JTextField textSM;
	private JTextField textST;
	private JTextField textSW;
	private JTextField textSTH;
	private JTextField textSF;
	private JTextField textSS;
	private JTextField textSSU;
	private JTextField textRH;
	private JTextField textRA;
	private JTextField textOH;
	private JTextField textOA;
	private JTextField textNP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payroll window = new Payroll();
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
	public Payroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.setBounds(100, 100, 1047, 481);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Name:");
		lblNewLabel.setBounds(26, 37, 141, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(148, 42, 159, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Hourly Salary:");
		lblNewLabel_1.setBounds(367, 33, 117, 32);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblNewLabel_1);
		
		textSalary = new JTextField();
		textSalary.setBounds(475, 42, 96, 19);
		frame.getContentPane().add(textSalary);
		textSalary.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("First Week:");
		lblNewLabel_2.setBounds(45, 153, 109, 17);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Second Week:");
		lblNewLabel_3.setBounds(45, 180, 117, 25);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Monday");
		lblNewLabel_4.setBounds(173, 111, 96, 25);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tuesday");
		lblNewLabel_5.setBounds(255, 114, 65, 19);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Wednesday");
		lblNewLabel_6.setBounds(342, 114, 87, 19);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Thursday");
		lblNewLabel_7.setBounds(439, 113, 70, 21);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Friday");
		lblNewLabel_8.setBounds(542, 111, 65, 25);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Saturday");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(633, 107, 87, 32);
		frame.getContentPane().add(lblNewLabel_9);
		
		textFM = new JTextField();
		textFM.setColumns(10);
		textFM.setBounds(164, 154, 65, 19);
		frame.getContentPane().add(textFM);
		
		JLabel lblNewLabel_10 = new JLabel("Sunday");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(740, 115, 65, 17);
		frame.getContentPane().add(lblNewLabel_10);
		
		textFT = new JTextField();
		textFT.setColumns(10);
		textFT.setBounds(255, 154, 65, 19);
		frame.getContentPane().add(textFT);
		
		textFW = new JTextField();
		textFW.setColumns(10);
		textFW.setBounds(342, 154, 65, 19);
		frame.getContentPane().add(textFW);
		
		textFTH = new JTextField();
		textFTH.setColumns(10);
		textFTH.setBounds(439, 154, 65, 19);
		frame.getContentPane().add(textFTH);
		
		textFF = new JTextField();
		textFF.setColumns(10);
		textFF.setBounds(542, 154, 65, 19);
		frame.getContentPane().add(textFF);
		
		textFS = new JTextField();
		textFS.setColumns(10);
		textFS.setBounds(643, 154, 65, 19);
		frame.getContentPane().add(textFS);
		
		textFSU = new JTextField();
		textFSU.setColumns(10);
		textFSU.setBounds(740, 154, 65, 19);
		frame.getContentPane().add(textFSU);
		
		textSM = new JTextField();
		textSM.setColumns(10);
		textSM.setBounds(164, 185, 65, 19);
		frame.getContentPane().add(textSM);
		
		textST = new JTextField();
		textST.setColumns(10);
		textST.setBounds(255, 185, 65, 19);
		frame.getContentPane().add(textST);
		
		textSW = new JTextField();
		textSW.setColumns(10);
		textSW.setBounds(342, 185, 65, 19);
		frame.getContentPane().add(textSW);
		
		textSTH = new JTextField();
		textSTH.setColumns(10);
		textSTH.setBounds(439, 185, 65, 19);
		frame.getContentPane().add(textSTH);
		
		textSF = new JTextField();
		textSF.setColumns(10);
		textSF.setBounds(542, 185, 65, 19);
		frame.getContentPane().add(textSF);
		
		textSS = new JTextField();
		textSS.setColumns(10);
		textSS.setBounds(643, 185, 65, 19);
		frame.getContentPane().add(textSS);
		
		textSSU = new JTextField();
		textSSU.setColumns(10);
		textSSU.setBounds(740, 185, 65, 19);
		frame.getContentPane().add(textSSU);
		
		JLabel lblNewLabel_11 = new JLabel("Hours");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(304, 263, 55, 13);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Amount");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(379, 257, 65, 25);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Regular:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(224, 289, 55, 25);
		frame.getContentPane().add(lblNewLabel_13);
		
		textRH = new JTextField();
		textRH.setColumns(10);
		textRH.setBounds(294, 294, 65, 19);
		frame.getContentPane().add(textRH);
		
		textRA = new JTextField();
		textRA.setColumns(10);
		textRA.setBounds(379, 292, 65, 19);
		frame.getContentPane().add(textRA);
		
		JLabel lblNewLabel_14 = new JLabel("Overtime:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_14.setBounds(224, 324, 83, 25);
		frame.getContentPane().add(lblNewLabel_14);
		
		textOH = new JTextField();
		textOH.setColumns(10);
		textOH.setBounds(294, 323, 65, 19);
		frame.getContentPane().add(textOH);
		
		textOA = new JTextField();
		textOA.setColumns(10);
		textOA.setBounds(379, 321, 65, 19);
		frame.getContentPane().add(textOA);
		
		JButton btnProcessIt = new JButton("Process It");
		btnProcessIt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  try {
				        // First week
				        double FirstweekMonday = Integer.valueOf(textFM.getText());
				        double FirstweekTuesday = Integer.valueOf(textFT.getText());
				        double FirstweekWednesday = Integer.valueOf(textFW.getText());
				        double FirstweekThursday = Integer.valueOf(textFTH.getText());
				        double FirstweekFriday = Integer.valueOf(textFF.getText());
				        double FirstweekSaturday = Integer.valueOf(textFS.getText());
				        double FirstweekSunday = Integer.valueOf(textFSU.getText());

				        // Second week
				        double SecondweekMonday = Integer.valueOf(textSM.getText());
				        double SecondweekTuesday = Integer.valueOf(textST.getText());
				        double SecondweekWednesday = Integer.valueOf(textSW.getText());
				        double SecondweekThursday = Integer.valueOf(textSTH.getText());
				        double SecondweekFriday = Integer.valueOf(textSF.getText());
				        double SecondweekSaturday = Integer.valueOf(textSS.getText());
				        double SecondweekSunday = Integer.valueOf(textSSU.getText());

				        double regularHoursPerDay = 8;
				        double regularHourlyRate = 18.52; // Adjust the hourly rate as needed
				        double overtimeHourlyRate = 27.78 * regularHourlyRate;

				        // Variables to store results
				        int totalRegularHours = 0;
				        int totalOvertimeHours = 0;
				        double totalRegularPay = 0.0;
				        double totalOvertimePay = 0.0;

				        // Calculate for the first week
				        calculateWeek(
				            regularHoursPerDay, regularHourlyRate, overtimeHourlyRate,
				            FirstweekMonday, FirstweekTuesday, FirstweekWednesday, FirstweekThursday,
				            FirstweekFriday, FirstweekSaturday, FirstweekSunday,
				            totalRegularHours, totalOvertimeHours, totalRegularPay, totalOvertimePay
				        );

				        // Calculate for the second week
				        calculateWeek(
				            regularHoursPerDay, regularHourlyRate, overtimeHourlyRate,
				            SecondweekMonday, SecondweekTuesday, SecondweekWednesday, SecondweekThursday,
				            SecondweekFriday, SecondweekSaturday, SecondweekSunday,
				            totalRegularHours, totalOvertimeHours, totalRegularPay, totalOvertimePay
				        );

				        // Calculate total net pay
				        double totalNetPay = totalRegularPay + totalOvertimePay;

				        // Display the results or use them as needed
				        // ...

				    } catch (NumberFormatException ex) {
				        JOptionPane.showMessageDialog(null, "Please enter valid numeric values for hours worked.");
				        ex.printStackTrace(); // Log the exception for debugging purposes
				    }
				}

				private void calculateWeek(
						double regularHoursPerDay, double regularHourlyRate, double overtimeHourlyRate,
						double Monday,double Tuesday,double Wednesday,double Thursday, double Friday,
						double Saturday, double Sunday,
						double totalRegularHours, double totalOvertimeHours, double totalRegularPay,
				        double totalOvertimePay) {

				    // Calculate total hours for the week
					double totalHours = Monday + Tuesday + Wednesday + Thursday + Friday + Saturday + Sunday;

				    // Check for overtime
				    if (totalHours > (regularHoursPerDay * 7)) {
				        totalOvertimeHours = totalHours - (regularHoursPerDay * 7);
				        totalRegularHours = regularHoursPerDay * 7;
				    } else {
				        totalRegularHours = totalHours;
				    }

				    // Calculate regular and overtime pay
				    totalRegularPay = totalRegularHours * regularHourlyRate;
				    totalOvertimePay = totalOvertimeHours * overtimeHourlyRate;

				    // Display the results or use them as needed
				    // ...
				}});
		btnProcessIt.setForeground(new Color(11, 11, 11));
		btnProcessIt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnProcessIt.setBackground(new Color(0, 128, 128));
		btnProcessIt.setBounds(45, 293, 153, 64);
		frame.getContentPane().add(btnProcessIt);
		
		JLabel lblNetPay = new JLabel("Net Pay:");
		lblNetPay.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNetPay.setBounds(496, 289, 87, 25);
		frame.getContentPane().add(lblNetPay);
		
		textNP = new JTextField();
		textNP.setColumns(10);
		textNP.setBounds(593, 294, 65, 19);
		frame.getContentPane().add(textNP);
		
		JButton btnClose = new JButton("Close");
		btnClose.setForeground(new Color(11, 11, 11));
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClose.setBackground(new Color(0, 128, 128));
		btnClose.setBounds(740, 293, 153, 64);
		frame.getContentPane().add(btnClose);
	}
}
