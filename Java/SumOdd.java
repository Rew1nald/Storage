public class SumOdd
{
    public static void main(String[] args)
    {
        int size = 10, sum = 0;
        
        System.out.println("The first 10 natural numbers are: ");
        for(int i = 1; i <= size; i++)
        {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Odd numbers are: ");
        for (int i = 1; i <= size; i++)
        {
            if(i % 2 == 1)
            {
                System.out.println(i);
                sum += i;
            }
        }

        System.out.println("The sum of the odd numbers is: " +sum);
        System.exit(0);
    }
}
