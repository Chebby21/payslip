package com.bankTest;
import java.util.Scanner;
class BankAccount{
	int acNo;
	String acName,acPhone,acEmail;
	double AcBal;
	public BankAccount(int acNo,String acPhone,String acName,String acEmail, double AcBal)
	{
		this.acNo=acNo;
		this.acName=acName;
		this.acPhone=acPhone;
		this.acEmail=acEmail;
		this.AcBal=AcBal;
		
	}
	public void accountholder()
	{
		System.out.println("Account Number:" +acNo);
		System.out.println("Account Holder Name:" +acName);
        System.out.println("Account Holder Address:" +acEmail);
        System.out.println("Account Holder phone:" +acPhone);
        System.out.println("Account Holder Balance:" +AcBal);

		
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
		public  savingsAccount(int acNo,String acPhone,String acName,String acEmail, double AcBal)
		{
			super (acNo,acName,acPhone,acEmail,AcBal);
		}
		
	}

 class currentAccount extends BankAccount{
		public  currentAccount(int acNo,String acPhone,String acName,String acEmail, double AcBal)
		{
			super (acNo,acName,acPhone,acEmail,AcBal);
		}
		
	}
public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("SAVINGS ACCOUNT DETAILS");
		savingsAccount sac=new savingsAccount(1001,"Ann Kamau","0755567889","test@gmail.com",1000);
		sac.accountholder();
		sac.deposit(500);
		sac.displayBalance();
		
		System.out.println("current ACCOUNT DETAILS");
		currentAccount sacs=new currentAccount(1001,"Peter Smith","0765326688","admin@gmail.com",0.0);
		sacs.accountholder();
		sacs.deposit(300);
		sacs.displayBalance();

	}

}
