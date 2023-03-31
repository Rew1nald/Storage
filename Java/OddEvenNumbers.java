public class OddEvenNumbers
{
    public static void main (String[] args)
    {
        int sum = 0;
        
        System.out.println("The first 15 even numbers are: ");
        for(int i = 1; i <= 30; i++)
        {
            if(i % 2 == 1)
            {
                sum+=i;
                continue;
            }
            else
            {
                System.out.println(i);
            }
        }
        
        System.out.println("The sum of the first 15 odd numbers is: " +sum);
        System.exit(0);
    }
}
