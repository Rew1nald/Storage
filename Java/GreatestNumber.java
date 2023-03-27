// Take three numbers from the user
// and print the greatest number.

import java.util.*;

public class GreatestNumber 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Input the 2nd number: ");
        int num2 = input.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = input.nextInt();

        if(num1 > num2)
        {
            if(num1 > num3)
            {
                System.out.println("The greatest: " +num1);
            }
            else
            {
                System.out.println("The greatest: " +num3);
            }
        }

        if(num2 > num1)
        {
            if(num2 > num3)
            {
                System.out.println("The greatest: " +num2);
            }
            else
            {
                System.out.println("The greatest: " +num3);
            }
        }

        input.close();
        System.exit(0);
    }
}
