package Project;
import java.io.*;
import java.util.*;

public class QuizBee{
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<String> player = new ArrayList<String>();

    public static void WaitForEnter(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            br.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        WelcomeMessage();

        System.out.println("What would you like to do?");
        DisplayChoices();

        System.exit(0);
    }

    public static void WelcomeMessage(){
        System.out.println("Welcome to the Quiz Bee!");
        System.out.println("Press Enter to Continue...");
        WaitForEnter();
    }

    public static void DisplayChoices(){
        char choice;
        do{
            System.out.println("A = Add player");
            System.out.println("D = Display current players");
            System.out.println("M = Modify player's name");
            System.out.println("R = Remove player");
            System.out.println("S = Start the Quiz Bee");
            System.out.println("X = Exit the program");
            System.out.print("Enter your choice: ");
            choice = input.next().charAt(0);

            System.out.println();
            switch(choice){
                case 'A':
                    AddPlayer();
                    break;
                case 'D':
                    DisplayPlayer();
                    break;
                case 'M':
                    ModifyPlayerName();
                    break;
                case 'R':
                    break;
                case 'S':
                    break;
                case 'X':
                    System.out.println("Thank you for using the program!");
                    System.exit(0);
                default:
                    System.out.println("Wrong option! Try again");
                    System.out.println("What would you like to do?");
            }
        }while(choice != 'X');
    }

    public static void AddPlayer(){
        System.out.println("You want to add players. How many players do you want to add? ");
        int size = input.nextInt();
        
        for(int i = 0; i < size; i++){
            System.out.print("Enter player "+ (i+1) +": ");
            String playername = input.next();
            player.add(playername);
        }

        System.out.println("Press Enter to go back to the Main Menu");
        WaitForEnter();
        DisplayChoices();
    }

    public static void DisplayPlayer(){
        System.out.println("You want to display registered players.");
        System.out.println("Here are the list of the registered players: ");
        for(String display : player){
            System.out.println(display);
        }

        System.out.println("Press Enter to go back to the Main Menu");
        WaitForEnter();
        DisplayChoices();
    }

    public static void ModifyPlayerName(){
        String search;
        System.out.println("You want to modify a player's name.");

        do{
        System.out.print("Enter the name of the player: ");
        search = input.next();

            if(player.contains(search)){
                int index = player.indexOf(search);
                System.out.println("Name found!");
                System.out.println("Enter a new name to replace: ");
                String replace = input.next();
                player.set(index, replace);
                System.out.println("The names have been updated to: ");
                for(String update : player){
                    System.out.println(update);
                }
                break;
            }else{
                System.out.println("Name not found! Please try again");
            }
        }while(!player.contains(search));
        
        System.out.println("Press Enter to go back to the Main Menu");
        WaitForEnter();
        DisplayChoices();
    }
}