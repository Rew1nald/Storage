public class SumAverage
{
    public static void main(String[] args)
    {
        int size = 15, sum = 0, avg = 0;

        System.out.println("The first 15 natural numbers are: ");
        for(int i = 1; i <= size; i++)
        {
            System.out.println(i);
            sum += i;
        }

        avg = sum / size;

        System.out.println();
        System.out.println("The sum is: " +sum);
        System.out.println("The average is: " +avg);
        System.exit(0);
    }
}
