// Write a program to print Fibonacci series 
// of n terms where n is input by user.

import java.util.*;

public class FibonacciSequence
{
	public static void main(String args[])
	{
		int num,x,number1=0,number2=1;
		int nextnumber = 0;
		
        System.out.print("Enter a number to create a Fibonacci sequence: ");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
        System.out.println("The Fibonacci sequence is: ");
        input.close();
		for(x = 1; x <= num; x++)
		{
			System.out.print(nextnumber+" ");
			number1 = number2;
			number2 = nextnumber;
			nextnumber = number1 + number2;
		}
		
        System.exit(0);
	}
}
