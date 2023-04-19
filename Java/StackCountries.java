import java.util.Stack;

public class StackCountries{

    public static void main(String[] args){
        Stack<String> countries = new Stack<>();

        countries.push("South Korea");
        countries.push("USA");
        countries.push("Mauritius");
        countries.push("Japan");
        countries.push("China");
        countries.push("Taiwan");
        countries.push("Canada");
        countries.push("UK");
        countries.push("Thailand");
        countries.push("Germany");

        System.out.println("Stack elements are:");
        System.out.println(countries);

        System.out.println("Topmost element is: " + countries.firstElement());

        while (countries.size() > 5) {
            countries.pop();
        }

        System.out.println("Updated stack elements:");
        System.out.println(countries);

        System.exit(0);
    }
}
