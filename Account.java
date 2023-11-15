package com.bankTest;
import java.util.Scanner;
class BankAccount{
	int acNo;
	String password;
	String acName,acPhone,acEmail ,userName;
	double AcBal;
	public BankAccount(int acNo,String acPhone,String acName,String acEmail, double AcBal ,String userName, String password)
	{
		this.acNo=acNo;
		this.acName=acName;
		this.acPhone=acPhone;
		this.acEmail=acEmail;
		this.AcBal=AcBal;
		this.userName=userName;
		this.password=password;
		
	}
	public void accountholder()
	{
		System.out.println("Account Number:" +acNo);
		System.out.println("Account Holder Name:" +acName);
        System.out.println("Account Holder Address:" +acEmail);
        System.out.println("Account Holder phone:" +acPhone);
        System.out.println("Account Holder Balance:" +AcBal);
       
       

		
	}
	public void password() {
		 System.out.println("Account Holder password:" +password);
	}
	public void userName() {
		 System.out.println("Account Holder username:" +userName);
	}
	public void deposit(double amount) {
		AcBal+=amount;
		System.out.println("Deposited:$" +amount);

	}
	public void displayBalance() {
		System.out.println("Account Number:" +acNo + "\tBalance: $"+AcBal);

	}
}
 class savingsAccount extends BankAccount{
		public  savingsAccount(int acNo,String acPhone,String acName,String acEmail, double AcBal,String userName,String password)
		{
			super (acNo,acName,acPhone,acEmail,AcBal,userName,password);
		}
		public void deposit(double amount) {
			AcBal+=amount;
			double bonus=0.02*amount;
			AcBal+=bonus;
			System.out.println("Deposited:$" +amount);
			System.out.println("Bonus:$" +bonus);
		}
		public void transfer(double amount, currentAccount currentAccount) {
			
		
	        if (amount <= this.AcBal) {
	            this.AcBal -= amount;
	            currentAccount.AcBal += amount;
	       	 double transferRate = amount * 0.025;
	       	 AcBal+=transferRate;
	       	System.out.println("transferRate:$" +transferRate);
		       
	            System.out.println("Transferred: $" + amount + " from Savings Account to Current Account.");
	        } else {
	            System.out.println("Insufficient balance in Savings Account.");
	        }
	    }
		
	}

 class currentAccount extends BankAccount{
		public  currentAccount(int acNo,String acPhone,String acName,String acEmail, double AcBal, String userName,String password)
		{
			super (acNo,acName,acPhone,acEmail,AcBal,userName,password);
		}
		public void transfer(double amount, savingsAccount savingsAccount) {
	        double transferAmountWithRate = amount *0.04;
	        if (transferAmountWithRate <= this.AcBal) {
	            this.AcBal -= transferAmountWithRate;
	            savingsAccount.AcBal += amount;
	            double transferRateAmount = amount * 0.04;
	            savingsAccount.AcBal += transferRateAmount;
	            System.out.println("Transferred: $" + amount + " from Current Account to Savings Account ");
	        } else {
	            System.out.println("Insufficient balance in Current Account.");
	        }
	    }
	}
public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		
		String userName;
		String password;
		System.out.println("ENTER USER NAME");
		userName=in.nextLine();
		System.out.println("ENTER PASSWORD");
		password=in.nextLine();
		  double transferAmountFromSavings;
	        double transferAmountFromCurrent;
	        System.out.println("Enter the amount to transfer from the savings account to the current account: ");
	        transferAmountFromSavings = in.nextDouble();
	        in.nextLine(); 

	        System.out.println("Enter the amount to transfer from the current account to the savings account: ");
	        transferAmountFromCurrent = in.nextDouble();
	        in.nextLine(); 

		
		savingsAccount sac=new savingsAccount(1001, "Ann Kamau", "0755567889", "admin@gmail.com", 1000, "Ann Bank", "2345");
		currentAccount sacs=new currentAccount(1001,"Ann Kamau","0765326688","admin@gmail.com",0.0,"Ann Bank","2345");
		
		if (userName.equals(sac.userName) && password.equals(sac.password)) {
		    System.out.println("WELCOME TO YOUR BANK ACCOUNT.");
		    // Perform any actions needed for valid credentials
		} else {
		    System.out.println("Invalid username or password. Please try again.");
		    // Perform any actions needed for invalid credentials
		}
      in.close();
      System.out.println("******************************************************************************************************");
		System.out.println("SAVINGS ACCOUNT DETAILS");
		//savingsAccount sac=new savingsAccount(1001, "Ann Kamau", "0755567889", "admin@gmail.com", 1000, "Ann Bank", 2345);
		sac.accountholder();
		sac.deposit(500);
		sac.displayBalance();
		sac.userName();
		sac.password();
		sac.transfer(transferAmountFromSavings, sacs);

		
	      System.out.println("******************************************************************************************************");

		System.out.println("\n");
		
		System.out.println("current ACCOUNT DETAILS");
		//currentAccount sacs=new currentAccount(1001,"Peter Smith","0765326688","admin@gmail.com",0.0,"peter",5678);
		sacs.accountholder();
		sacs.deposit(300);
		sacs.displayBalance();
		sacs.userName();
		sacs.password();
		 sacs.transfer(transferAmountFromCurrent, sac);
	
	
	}

}
