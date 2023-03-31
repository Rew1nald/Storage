// Write a program to print Fibonacci series 
// of n terms where n is input by user.

import java.util.*;

public class LoopingWithPatterns
{
	public static void main(String args[])
    {
		int num;
		int a=0;
		System.out.print("Number of rows: ");
		Scanner rei = new Scanner(System.in);
		num = rei.nextInt();

		System.out.println();
        rei.close();
		System.out.println("I.");
		for(int i = 1; i <= num; i++)
        {
			System.out.println("* * * * * * * * * *");
		}

		System.out.println();
		System.out.println("II.");
		for(int i = 1; i <= num; i++)
        {
			for(int j = 1; j <= i; j++)
            {
				System.out.print("* ");
			}
			System.out.println();
		}
		
        int star3= 1;
		int space3 = num - 1;
		
        System.out.println();
		System.out.println("III.");
		for(int i = 1; i <= num; i++)
        {
			for(int j = 1; j <= space3; j++)
            {
				System.out.print("  ");
			}
			for(int k = 1; k <= star3; k++)
            {
				System.out.print("* ");
			}
			space3--;
			star3++;
			System.out.println();
		}
		
        System.out.println();
		System.out.println("IV.");
		for(int i = 1; i <= num; i++, a = 0)
        {
			for (int j = 1; j <= num - i; j++)
			{
				System.out.print("  ");
			}
			while (a != 2 * i - 1)
			{
			System.out.print("* ");
			++a;
			}
			System.out.println();
		}
		
        System.out.println();
		System.out.println("V.");
		for(int i = 1; i <= num; i++, a = 0)
        {
			for (int j = 1; j <= num - i; j++)
			{
				System.out.print("  ");
			}
			while (a != 2 * i - 1)
			{
			System.out.print(i+" ");
			++a;
			}
			System.out.println();
		}
		
        int z = 0, z1 = 0;
		
        System.out.println();
		System.out.println("VI.");
		for(int i = 1; i <= num; i++, a = 0)
        {
			for (int j = 1; j <= num - i; j++)
            {
				System.out.print("  ");
				++z;
			}
			while (a != 2 * i - 1)
            {
				if (z <= num - 1)
                {
					System.out.print((i - a) + " ");
					z++;
				}
				else
                {
					z1++;
					System.out.print((i - a + 2 * z1) + " ");
				}
				++a;
			}
			z1 = z = a = 0;
			System.out.println();
		}

        System.exit(0);
	}
}
