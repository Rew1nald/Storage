// Write a Java program to get a number from the user and
// print whether it is positive or negative.

import java.util.*;

public class PositiveNegative
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input number: ");
        int num = input.nextInt();

        if(num > 0)
        {
            System.out.println("Number is positive");
        }
        else if(num < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
        
        input.close();
        System.exit(0);
        
    }
}