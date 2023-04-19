import java.util.*;

public class StackWithMathOperations{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the stack: ");
        int length = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter " + length + " elements of the stack: ");
        for (int i = 0; i < length; i++){
            int element = scanner.nextInt();
            stack.push(element);
        }

        int sum = 0;
        int sumOfOddNumbers = 0;

        while (!stack.isEmpty()){
            int element = stack.pop();
            sum += element;
            if (element % 2 != 0){
                sumOfOddNumbers += element;
            }
        }

        System.out.println("The sum of odd numbers is: " + sumOfOddNumbers);
        System.out.println("The sum of all inputted numbers is: " + sum);

        scanner.close();
        System.exit(0);
    }
}
