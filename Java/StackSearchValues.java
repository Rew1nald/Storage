import java.util.*;

public class StackSearchValues{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int positiveCount = 0, negativeCount = 0, oddCount = 0, evenCount = 0, zeroCount = 0;

        System.out.println("Enter values of the stack: ");
        for (int i = 0; i < 10; i++) {
            int value = scanner.nextInt();
            stack.push(value);
        }
        scanner.close();

        System.out.println("Inputted stack elements: " + stack);

        while (!stack.empty()){
            int value = stack.pop();

            if (value == 0){
                zeroCount++;
            }else if (value > 0){
                positiveCount++;
            }else{
                negativeCount++;
            }

            if (value % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of 0s: " + zeroCount);

        System.exit(0);
    }
}
