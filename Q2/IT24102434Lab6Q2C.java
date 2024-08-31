import java.util.Scanner;
public class  IT24102434Lab6Q2C{
public static void main (String [] args)
{
	int number,i,sum = 0;
	String totalnum = "";
	Double Avg;
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter 10 numbers:");
	
	for(i = 1;i<=10;i++)
	{
		System.out.print("Enter number "  + i + ": ");
		number = input.nextInt();
		totalnum = totalnum + number + " "; 
		sum = sum + number;
	
	}	
	{
		System.out.println("");
		
		System.out.println("The numbers you entered are:");
		
		System.out.println(totalnum);
		
	}
	   Avg = sum/10.0;
	{
		System.out.println("");
		System.out.println("Sum of the numbers: " + sum);
		System.out.println("Average of the numbers: " + Avg);
	}	
	
	
}
}
	