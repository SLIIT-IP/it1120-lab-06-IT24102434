import java.util.Scanner;
public class  IT24102434Lab6Q2B{
public static void main (String [] args)
{
	int number,i;
	String totalnum = "";
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter 10 numbers:");
	
	for(i = 1;i<=10;i++)
	{
		System.out.print("Enter number "  + i + ": ");
		number = input.nextInt();
		totalnum = totalnum + number + " "; 
	}	
	{
		System.out.println("");
		
		System.out.println("The numbers you entered are:");
		
		System.out.print(totalnum);
		
	}	
	
	
}
}
	
	
	