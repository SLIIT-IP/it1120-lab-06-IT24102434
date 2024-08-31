import java.util.Scanner;
public class  IT24102434Lab6Q3{
public static void main (String [] args)
{
	double sqrsum = 0,num = 0,count = 0;
	double rootMeanSq;
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter positive integers (terminate input with -99):");
	System.out.print("Enter a number: ");
	
	num = input.nextInt();
	
	while (num != -99)
	{
		if (num>0)
		{
			sqrsum = sqrsum+num*num;
			count = count+1;
		}
		else 
		{
			System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
		}
		    System.out.print("Enter a number: ");
			num = input.nextInt();
	}
	rootMeanSq = Math.sqrt(sqrsum/count);
	System.out.println("");
	System.out.println("The Root Mean Square (RMS) is: " + rootMeanSq);
}
}