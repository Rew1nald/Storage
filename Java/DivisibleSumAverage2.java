public class DivisibleSumAverage2
{
    public static void main (String[] args)
    {
        int avg = 0;
        int sum = 0;
        
        System.out.println("The first 10 whole numbers divisible by 8 are: ");
        
        System.out.println();
        for(int i = 8; i <= 80; i++){
            if(i % 8 == 0)
            {
                sum+=i;
                System.out.println(i);
            }
        }
        avg=sum/10;

        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+avg);
        System.exit(0);
    }
}
