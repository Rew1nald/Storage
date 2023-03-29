// Write a program in Java to display the first 10 even numbers.

public class EvenNumbers 
{
    public static void main (String[] args)
    {
        int size = 20;

        System.out.println("The first 10 even numbers are: ");
        System.out.println();
        for(int i = 1; i <= size; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
            else
            {
                continue;
            }
        }

        System.exit(0);
    }
}
