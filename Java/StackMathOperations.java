import java.util.*;

class StackMathOperations{
    int top;
    int maxSize;
    int[] stackArray;

    StackMathOperations(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    void push(int value) {
        if (top < maxSize - 1){
            stackArray[++top] = value;
        }
    }

    public static void main(String[] args){
        StackMathOperations stack = new StackMathOperations(10);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the stack integer elements:");

        for (int i = 0; i < 10; i++){
            stack.push(input.nextInt());
        }

        input.close();

        System.out.println("Inputted stack elements: " + stack);

        int sum = 0;
        int highestValue = Integer.MIN_VALUE;
        int lowestValue = Integer.MAX_VALUE;

        for (int i = 0; i <= stack.top; i++){
            int currentValue = stack.stackArray[i];
            sum += currentValue;
            highestValue = Math.max(highestValue, currentValue);
            lowestValue = Math.min(lowestValue, currentValue);
        }

        double average = (double) sum / (stack.top + 1);

        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
        System.out.println("The highest value is: " + highestValue);
        System.out.println("The lowest value is: " + lowestValue);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= top; i++) {
            sb.append(stackArray[i]);
            if (i != top) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
