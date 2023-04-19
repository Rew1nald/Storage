import java.util.*;

public class DynamicStackOperations{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the size of the stack? ");
        int size = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter the values of the stack:");
        for (int i = 0; i < size; i++){
            int element = scanner.nextInt();
            stack.push(element);
        }

        char option = ' ';
            System.out.println("Press the letter for specific operation.");
            System.out.println("A - Adding element to stack / Add element");
            System.out.println("C - Changing elements / Set element of stack");
            System.out.println("R - Removing elements / Delete element");
            System.out.println("I - Iterating elements");
            System.out.println("G - Get elements");
            System.out.println("S - Sorting elements");
            System.out.println("Z - Stack size");
            System.out.println("T - Top element");

            option = scanner.next().charAt(0);

            switch (option){
                case 'A':
                    System.out.println("You want to add a new element.");
                    System.out.print("Enter the element you want to add: ");
                    int newElement = scanner.nextInt();
                    stack.push(newElement);
                    System.out.println("The stack elements now are: ");
                    System.out.println(stack);
                    break;
                case 'C':
                    System.out.println("You want to change an element.");
                    System.out.print("Enter the index of the element you want to change: ");
                    int index = scanner.nextInt();
                    System.out.print("Enter the new value: ");
                    int value = scanner.nextInt();
                    stack.set(index, value);
                    System.out.println("The stack elements now are: ");
                    System.out.println(stack);
                    break;
                case 'R':
                    System.out.println("You want to remove an element.");
                    System.out.print("Enter the index of the element you want to delete: ");
                    int deleteIndex = scanner.nextInt();
                    stack.remove(deleteIndex);
                    System.out.println("The stack elements now are: ");
                    System.out.println(stack);
                    break;
                case 'I':
                    System.out.println("You want to iterate the stack elements.");
                    System.out.println("The stack List elements are: ");
                    for (Integer element : stack){
                        System.out.print(element + " ");
                    }
                    System.out.println();
                    break;
                case 'G':
                    System.out.println("You want to get the stack elements.");
                    System.out.println("The stack elements are: ");
                    System.out.println(stack);
                    break;
                case 'S':
                    System.out.println("You want to sort the elements of the stack.");
                    System.out.println("The original arrangements: " + stack);
                    stack.sort(null);
                    System.out.println("Sorted stack elements: " + stack);
                    break;
                case 'Z':
                    System.out.println("You want to know the size of the stack.");
                    System.out.println("The stack size is: " + stack.size());
                    break;
                case 'T':
                    System.out.println("You want to get the top element of the stack.");
                    if (stack.isEmpty()){
                        System.out.println("Stack is empty.");
                    }else{
                        System.out.println("The top element is: " + stack.peek());
                    }
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        
        scanner.close();
        System.exit(0);
    }
}
