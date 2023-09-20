package payslip;
import java.util.Scanner;
public class payslip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String EMP_NAME,EMP_NO,DESIGNATION, GEN_DATE;
			int DAYS_WORKED;
			double PAY_RATE,BASIC_PAY,PF,GROSS_INCOME=0,TOTAL_DEDUCT,NET_PAY;
			 final double PROFTAX;
	Scanner input =new Scanner(System.in);	
	
	
	//EMPLOYEE NUMBER
	System.out.println("ENTER YOUR EMPLOYEE NUMBER:");
	EMP_NO=input.nextLine();
	//EMPLOYEE NAME
	System.out.println("ENTER YOUR NAME");
	EMP_NAME=input.nextLine();
	//DESIGNATION
	System.out.println("ENTER YOUR DESIGNATION");
	DESIGNATION=input.nextLine();
	//DAY WORKED
	System.out.println("ENTER THE NUMBER OF DAYS WORKED");
	DAYS_WORKED=input.nextInt();
	//PAY RATE
	System.out.println("ENTER PAY RATE");
	PAY_RATE=input.nextFloat();
	//GEN DATE
	System.out.println("ENTER GEN DATE: 15/9/2013");
	GEN_DATE=input.next();
	input.close();
	
	//COMPUTATION
	BASIC_PAY=DAYS_WORKED*PAY_RATE;
	GROSS_INCOME=BASIC_PAY;
	PF=BASIC_PAY/10;
	PROFTAX=20%BASIC_PAY;
	TOTAL_DEDUCT=PF + (float)PROFTAX;
	NET_PAY=BASIC_PAY-TOTAL_DEDUCT;
	
   
   System.out.println("ENTER THE EMPLOYEE NUMBER TO GENERATE THE PAYSLIP:1\n");
	
	System.out.println("\t\t\t\tSHREE KRISHINA CHEMIST AND DRUGGIST");
	System.out.println("\t\t\t\t\t SALARY MONTH 9 2013");
	
	System.out.println("EMP.NO:"+ EMP_NO+"\t\t\tEMP.NAME:"+ EMP_NAME+"\t\tDESIGNATION:"+DESIGNATION);
	System.out.println("DAYS WORKED"+DAYS_WORKED+ "\t\t\t PAY RATE"+(int)PAY_RATE+"\t\tGEN.DATE:"+GEN_DATE);
	System.out.println("-------------------------------------------------------------------------------");
	System.out.println("EARNINGS\t\t AMOUNTS(RS.)\t\tDEDUCTION\t\tAMOUNT(RS.)");
	System.out.println("-------------------------------------------------------------------------------");
	System.out.println("BASIC PAY\t\t"+BASIC_PAY+"\t\tP.F.\t\t"+PF);
	System.out.println("\t\t\t\t\tPROF.TAX\t" +PROFTAX);
	System.out.println("-------------------------------------------------------------------------------");
	System.out.println("GROSS EARN.\t\t" +(int)GROSS_INCOME+"\t\t\tTOTAL DEDUCT.\t"+(int)TOTAL_DEDUCT);
	System.out.println("\t\t\t\t\t\tNET PAY\t\t "+NET_PAY);
	
	System.out.println("-------------------------------------------------------------------------------");
	
	
	
	
	
	
 
	}

}

