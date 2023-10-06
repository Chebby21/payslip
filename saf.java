package okoa;
import java.util.Scanner;
public class saf {
	public static void main(String[] args) {
		int option=0;
		//output
		int num=2;
		int num1=2;
		int num2=2;
		int num3=1;
		int num4=1;
		int num5=1;
		int num6=1;
		do {
		int number=0;
		
		Scanner input = new Scanner(System.in);	
		System.out.println( "0:Sh20(30mins,3hrs)");
		System.out.println("1:Okoa Easy Sh50(50Mins,midnight)");
		System.out.println("2:Okoa 100");
		System.out.println("3:Okoa 50");
		System.out.println("4:Okoa 20(or KSh50,Midnight)");
		System.out.println("5:Okoa 10");
		System.out.println("6:Okoa 5");
		System.out.println("7:Okoa Internet");
		System.out.println("98:More");
		System.out.println("90. Exit");
		//System.out.println("00: Home");
		
		System.out.print("____________________________________________");
		number=input.nextInt();
		
	
		
		switch(number) {
		case 0:
		System.out.println( "Existing Unpaid Okoa:0");
		System.out.println( "New Okoa request:20");
		System.out.println( "TOTAL DEBT will be:20");
		System.out.println( "1:Accept");
		System.out.println( "2:Decline");
		System.out.println( "0:BACK 00:HOME");
	
		System.out.print("____________________________________________");
		num=input.nextInt();
		
		if(num==1) {
			System.out.println( "You have succesfully subscribed to okoa 20");	
			break;
		}
		else if(num==2) {
			System.out.println( "You have Declined");
			break;
		}
		else if(num==0) {
			continue;
		}
		else {
			System.out.println( "invalid option");
			break;
		}
		
	
		case 1:
		System.out.println( "Existing Unpaid Okoa:0");
		System.out.println( "New Okoa request:50");
		
		System.out.println( "TOTAL DEBT will be:50");
		System.out.println( "1:Accept");
		System.out.println( "2:Decline");
		System.out.println( "0:BACK 00:HOME");
		
		System.out.print("____________________________________________");
		num1=input.nextInt();

		if(num1==1) {
			System.out.println( "You have succesfully subscribed to okoa 50");	
			break;
		}
		else if(num1==2) {
			System.out.println( "You have Declined");
			break;
		}
		else if(num1==0) {
			continue;
		}
		else {
			System.out.println( "invalid option");
			break;
		}

			
		
		
		case 2:
		System.out.println( "Existing Unpaid Okoa:0");
		System.out.println( "New Okoa request:100");
			
		System.out.println( "TOTAL DEBT will be:100");
		System.out.println( "1:Accept");
		System.out.println( "2:Or GET EXTRA(CONVERT to 170 bob Kredo for Calls & SMS valid midnight");
		System.out.println( "0:BACK 00:HOME");
		
		System.out.print("____________________________________________");
		num2=input.nextInt();

		if(num2==1) {
			System.out.println( "You have succesfully subscribed to okoa 100");	
			break;
		}
		else if(num2==2) {
			System.out.println( "You have 170 kredo for Calls &SMS");
			break;
		}
		else if(num2==0) {
			continue;
		}
		else {
			System.out.println( "invalid option");
			break;
		}

			
		
		case 3:
		System.out.println( "Existing Unpaid Okoa:0");
		System.out.println( "New Okoa request:50");
		
		System.out.println( "TOTAL DEBT will be:50");
		System.out.println( "1:Accept");
		System.out.println( "2:Or GET EXTRA (CONVERT to 150 bob Kredo for Calls & SMS valid midnight");
		System.out.println( "0:BACK 00:HOME");
		
		System.out.print("____________________________________________");
		num3=input.nextInt();

		if(num3==1) {
			System.out.println( "You have succesfully subscribed to okoa 50");	
			break;
		}
		else if(num3==2) {
			System.out.println( "You have 150 bob kredo for Calls & SMS");
			break;
		}
		else if(num3==0) {
			continue;
		}
		else {
			System.out.println( "invalid option");
			break;
		}

		
		case 4:
		System.out.println( "Existing Unpaid Okoa:0");
		System.out.println( "New Okoa request:20");
			
		System.out.println( "TOTAL DEBT will be:20");
		System.out.println( "1:Accept");
		System.out.println( "2:Or GET EXTRA (CONVERT to 50 bob Kredo for Calls & SMS valid midnight");
		System.out.println( "0:BACK 00:HOME");
		
		System.out.print("____________________________________________");
		num4=input.nextInt();

		if(num4==1) {
			System.out.println( "You have succesfully subscribed to okoa 20");	
			break;
		}
		else if(num4==2) {
			System.out.println( "You have 50 bob kredo for Calls & SMS");
			break;
		}
		else if(num4==0) {
			continue;
		}
		else {
			System.out.println( "invalid option");
			break;
		}

	
		case 5:
		System.out.println( "Existing Unpaid Okoa:0");
		System.out.println( "New Okoa request:10");
			
		System.out.println( "TOTAL DEBT will be:10");
		System.out.println( "1:Accept");
		System.out.println( "2:Or GET EXTRA (CONVERT to 17 bob Kredo for Calls & SMS valid midnight");
		System.out.println( "0:BACK 00:HOME");
		
		System.out.print("____________________________________________");
		num5=input.nextInt();

		if(num5==1) {
			System.out.println( "You have succesfully subscribed to okoa 10");	
			break;
		}
		else if(num5==2) {
			System.out.println( "You have 17 bob kredo for Calls & SMS");
			break;
		}
		else if(num5==0) {
			continue;
		}
		else {
			System.out.println( "invalid option");
			break;
		}

		
		case 6:
		System.out.println( "Existing Unpaid Okoa:0");
		System.out.println( "New Okoa request:5");
			
		System.out.println( "TOTAL DEBT will be:5");
		System.out.println( "1:Accept");
		System.out.println( "2:cancel");
		System.out.println( "0:BACK 00:HOME");
		
		System.out.print("____________________________________________");
		num6=input.nextInt();

		if(num6==1) {
			System.out.println( "You have succesfully subscribed to okoa 5");	
			break;
		}
		else if(num6==2) {
			System.out.println( "You have Declined");
			break;
		}
		else if(num6==0) {
			continue;
		}
		else {
			System.out.println( "invalid option");
			break;
		}

		case 7:
		System.out.println( "Okoa bundles");
		System.out.println( "1:Sh20(900MB,1hr)");
		System.out.println( "2:Sh50(1400MB,3hrs)");
		System.out.println( "3:Sh99(675MB,24hrs)");
		System.out.println( "4:Sh50(270MB,24hrs)");
		System.out.println( "5:Sh20(90MB,24hrs)");
		System.out.println( "6:Sh10(30MB,24hrs)");
		System.out.println( "98:More 00:BACK");
		
		System.out.print("____________________________________________");
		num=input.nextInt();
			

		if(num==1) {
			System.out.println( "1:Sh20(900MB,1hr)");	
			break;
		}
		else if(num==2) {
			System.out.println("2:Sh50(1400MB,3hrs)");
			break;
		}
		else if(num==3) {
			System.out.println("3:Sh99(675MB,24hrs)");
		}
		else if(num==2) {
			System.out.println( "4:Sh50(270MB,24hrs)");
			break;
		}
		else if(num==2) {
			System.out.println("5:Sh20(90MB,24hrs)");
			break;
		}
		else if(num==2) {
			System.out.println("6:Sh10(30MB,24hrs)");
			continue;
		}
		else {
			System.out.println( "invalid option");
			break;
		}

		
		case 98:
		System.out.println( "8:Okoa Minutes");
		System.out.println( "9:Okoa SMS");
		System.out.println( "10:Lipa Okoa");
		System.out.println( "#Check Balance");
		System.out.println( "0:BACK");
		
		System.out.print("____________________________________________");
		number=input.nextInt();
		break;
		//case 00:
		
		
		case 90:
			return;
			
			
		default:
		System.out.println("Invalid choice.Try again.");
		System.out.println( "0:Sh20(30mins,3hrs)");
		System.out.println("1:Okoa Easy Sh50(50Mins,midnight)");
		System.out.println("2:Okoa 100");
		System.out.println("3:Okoa 50");
		System.out.println("4:Okoa 20(or KSh50,Midnight)");
		System.out.println("5:Okoa 10");
		System.out.println("98:More");
		
		System.out.print("____________________________________________");
		number=input.nextInt();
			
		
		
			
		}	
			
		
			

			
		}while(num==0 ||num1==0 ||num2==0 ||num3==0 ||num4==0 ||num5==0 ||num6==0 );	
		}
			
			
			
			
	
}


