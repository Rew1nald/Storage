import java.util.*;

public class StackMathOperationss{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter the stack integer elements: ");
        for (int i = 0; i < 10; i++) {
            int element = input.nextInt();
            stack.push(element);
        }
        input.close();

        System.out.println("Inputted stack elements: " + stack);

        int sum = 0;
        for (int element : stack){
            sum += element;
        }
        double average = (double) sum / stack.size();

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        for (int element : stack){
            if (element > highest){
                highest = element;
            }
            if (element < lowest){
                lowest = element;
            }
        }

        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
        System.out.println("The highest value is: " + highest);
        System.out.println("The lowest value is: " + lowest);
    }
}
