package results;

import java.util.Scanner;
public class results {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,roll_no,recommendations = null,unit_name1,unit_name2,unit_name3,unit_name4,reg_no,semester,unit_code1,unit_code2,unit_code3,unit_code4;
		int score1,score2,score3,score4,total;
		float average;
		char grade;
		
		
		Scanner input =new Scanner(System.in);
		
		// NAME
		System.out.println("ENTER YOUR NAME:");
		name=input.nextLine();
		
		//ROLL NO
		System.out.println("ENTER YOUR ROLL NO:");
		roll_no=input.nextLine();
		//semester
				
		System.out.println("ENTER YOUR SEMESTER:");
		semester=input.nextLine();
				
		//REG NUMBER
		System.out.println("ENTER YOUR REG NUMBER:");
		reg_no=input.nextLine();
		
		//UNIT CODE
		System.out.println("ENTER YOUR UNIT CODE1:");
		unit_code1=input.nextLine();
		
		System.out.println("ENTER YOUR UNIT CODE2:");
		unit_code2=input.nextLine();
		
		System.out.println("ENTER YOUR UNIT CODE3:");
		unit_code3=input.nextLine();
		
		System.out.println("ENTER YOUR UNIT CODE4:");
		unit_code4=input.nextLine();
	
		//UNIT NAME
		System.out.println("ENTER YOUR UNIT NAME1:");
		unit_name1=input.nextLine();
		
		System.out.println("ENTER YOUR UNIT NAME2:");
		unit_name2=input.nextLine();
		
		System.out.println("ENTER YOUR UNIT NAME3:");
		unit_name3=input.nextLine();
		
		System.out.println("ENTER YOUR UNIT NAME4:");
		unit_name4=input.nextLine();
		
		//SCORE
		System.out.println("ENTER YOUR SCORE1:");
		score1=input.nextInt();
		
		System.out.println("ENTER YOUR SCORE2:");
		score2=input.nextInt();
		
		System.out.println("ENTER YOUR SCORE3:");
		score3=input.nextInt();
		
		System.out.println("ENTER YOUR SCORE4:");
		score4=input.nextInt();
		input.close();
		
		//CALCULATIONS
		total= score1+score2+score3+score4;
		average= total/4;
		grade='d';
		if(
				(average<=100)&&(average>=70)
				) {grade='A';}
		else if(
				(average<=70)&&(average>=60)
				) {grade='B';}
		else if(
				(average<=60)&&(average>=50)
				) {grade='c';}
		else if(
				(average<=50)&&(average>=40)
				) {grade='D';}
		else if(
				(average<40)
				) {grade='F';}
		
		  System.out.println("\t\t\t Department of Computer Science");
		  System.out.println("\t\t\t\tEnd Semester Results");
	
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("|Name:"+ name+"\t\t\t|Roll_No:"+ roll_no+"\t|Semster:"+semester);
			System.out.println("__________________________________________________________________________________");
			
			System.out.println("|Unit Code\t\t \t\t|Unit Name:\t\t\t|Score");
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("|"+unit_code1+ "\t\t\t\t |"+unit_name1+"\t\t\t|"+score1);
			System.out.println("|"+unit_code2+ "\t\t\t\t |"+unit_name2+"\t\t\t|"+score2);
			System.out.println("|"+unit_code3+ "\t\t\t\t |"+unit_name3+"\t\t\t|"+score3);
			System.out.println("|"+unit_code4+ "\t\t\t\t |"+unit_name4+"\t\t\t|"+score4);
			System.out.println("-----------------------------------------------------------------------------------");
			
		
			System.out.println("TOTAL\t\t\t\t\t\t\t\t\t|"+total);
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("Average\t\t\t\t\t\t\t\t\t|" +average);
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("Grade\t\t\t\t\t\t\t\t\t|" +grade);
			System.out.println("-----------------------------------------------------------------------------------");
			
			System.out.println("\t\t\t\t\t\t\tRecommendation |"+recommendations);
			
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("Grading Criteria\t\t overall grade(A-D)\t\tRecommend pass");
			System.out.println("70-100     A");
			System.out.println("60-70      B");
			System.out.println("50-60      C");
			System.out.println("40-50      D");
			System.out.println("Below 40    F");
			System.out.println("------------------------------------------------------------------------------------");

	}

}
