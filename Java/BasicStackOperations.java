import java.util.*;

public class BasicStackOperations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(67);
        stack.push(12);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(67);
        stack.push(89);

        System.out.println("Original stack elements: " + stack);

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Stack after pop operations: " + stack);

        int first = stack.peek();
        System.out.println("The top element is: " + first);

        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);

        System.exit(0); 
    }
}
