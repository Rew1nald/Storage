// Write a program in Java to display the first 10 whole numbers 
// divisible by 4 and then display the sum and average.

public class DivisibleSumAverage 
{
    public static void main (String[] args)
    {
        int sum = 0, avg = 0, count = 0, size = 40;

        System.out.println("The first 10 whole numbers divisible by 4 are: ");
        System.out.println();

        for(int i = 1; i <= size; i++)
        {
            if(i % 4 == 0)
            {
                sum += i;
                count++;
                System.out.println(i);
            }
        }

        avg = sum / count;

        System.out.println();
        System.out.println("The sum is: " +sum);
        System.out.println("The average is: " +avg);
        System.exit(0);
    }
}
