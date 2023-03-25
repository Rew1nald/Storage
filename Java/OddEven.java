// Write a Java program to get a number from the user
// and print whether it is odd or even.

import java.util.*;

public class OddEven 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Input number: ");
        int num = input.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }

        input.close();
        System.exit(0);
        
    }
}
