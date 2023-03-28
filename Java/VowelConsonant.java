// Write a Java program that takes the user 
// to provide a single character from the alphabet.
// Print Vowel or Consonant, depending on the user input.

import java.util.*;

public class VowelConsonant
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        char letter = input.next().charAt(0);

        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'
        || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
        {
            System.out.println("Input letter is Vowel");
        }
        else
        {
            System.out.println("Input letter is Consonant");
        }
        
        input.close();
        System.exit(0);
    }
}