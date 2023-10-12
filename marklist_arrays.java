package bhj;
import java.util.Scanner;
public class Marklist {
	

	//marks list program.
	class Mark
	{
	    static Scanner input;

		static String input(String info)
	    {
	        String data = "null";

	        input=new Scanner(System.in);
	        try
	        {
	            System.out.print(info);
	            data = input.nextLine();
	        }
	        catch(NumberFormatException e)
	        {
	            System.out.println("h");
	        }
	        return data;
	    }


		
	    public static void main(String[] args)
	    {

	    // variables
	        String names[] = new String[4];
	        String roll[] = new String[4];
	        int mark_total[][] = new int[4][4];
	        double Average[] = new double[4];
	        char results[]= new char[4];
	        char grade[] = new char[4];

	        //roll number, the names, calculate the totals, Averages, Results , grade.
	        for(int i=0;i<4;i++)
	        {
	        	System.out.println("\n");
	            roll[i] = input("Enter the Student Roll Number: ");
	            names[i] = input("Enter the Student Name : ");
	            System.out.println("\n");
	            for(int j=0;j<3;j++)
	            {
	            	
	                try
	                {
	                    mark_total[i][j] =Integer.parseInt(input("Enter your mark"+(j+1)+":"));
	                }
	                catch(NumberFormatException e)
	                {
	                    System.out.println("You Enter A Non-Integer Value."); 
	                }
					//sum the user marks.
	                mark_total[i][3] += mark_total[i][j];
	            }
	            System.out.println("The Total is : "+mark_total[i][3]);

	            //Average
	            Average[i] = (mark_total[i][3])/3;

	            // results
	            results[i] = Average[i] > 50?'P':'F';

				//Grading
	            if(Average[i] >= 70 && Average[i] <=100)
	                grade[i] ='A';
	            else if(Average[i] >= 69)
	                grade[i] = 'B';
	            else if(Average[i] >= 0)
	                grade[i] = 'C';
	            else
	                grade[i] = '-';
	        }

			//print the page header.
	        System.out.println("******************************************************************************");
	        System.out.println("\t\t\t\tSTUDENT MARKLIST");
	        System.out.println("******************************************************************************");
	        System.out.println("Roll\tName\tMark1\tMark2\tMark3\tTotal\tResults\tAverage\tGrade");

			//nested loop to print out the data for each user in table like format.
	      	for(int i=0;i<4;i++)
	        {
	            System.out.println(roll[i]+"\t"+names[i]+"\t"+mark_total[i][0]+"\t"+mark_total[i][1]+"\t"+mark_total[i][2]+"\t"+mark_total[i][3]+"\t"+results[i]+"\t"+Average[i]+"\t"+grade[i]);
	        }
	    }
	}
}
