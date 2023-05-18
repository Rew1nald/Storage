package Project;
import java.io.*;
import java.util.*;

class Question{
    String question, answer;

    Question(String question, String answer){
        this.question = question;
        this.answer = answer;
    }
}

class QuizBeeSystem{
    private ArrayList<Question> questions;
    private int score;

    QuizBeeSystem(){
        questions = new ArrayList<>();
        score = 0;
    }

    void addQuestion(String question, String answer){
        questions.add(new Question(question, answer));
    }

    void removeQuestion(int index){
        if(index < questions.size() && index >= 0){
            questions.remove(index);
        }else{
            System.out.println("Invalid index");
        }
    }

    void modifyQuestion(int index, String question, String answer){
        if(index < questions.size() && index >= 0){
            questions.set(index, new Question(question, answer));
        }else{
            System.out.println("Invalid index");
        }
    }

    void displayQuestions(){
        for (int i = 0; i < questions.size(); i++){
            System.out.println((i + 1) + ". " + questions.get(i).question);
        }
    }
    
    void searchQuestions(int index){
        if(index < questions.size() && index >= 0){
            System.out.println((index + 1) + ". " + questions.get(index).question);
        }else{
            System.out.println("No questions found");
        }
    }
    
    void verifyAnswer(int index, String answer){
        if(index < questions.size() && index >= 0){
            if(questions.get(index).answer.equals(answer)){
                score++;
                System.out.println("Correct answer!");
            }else{
                System.out.println("Incorrect answer!");
            }
        }else{
            System.out.println("Invalid index");
        }
    }

    void displayScore(){
        System.out.println("Your current score is: " + score);
    }

    int getQuestionCount(){
        return questions.size();
    }

    String getQuestion(int index){
        if(index < questions.size() && index >= 0){
            return questions.get(index).question;
        }else{
            return "Invalid index";
        }
    }

    void addScore(int addScore){
        this.score += addScore;
        System.out.println("Player's score updated. New score: " + this.score);
    }

    void subtractScore(int subtractScore){
        this.score -= subtractScore;
        System.out.println("Player's score updated. New score: " + this.score);
    }

    void setScore(int newScore){
        this.score = newScore;
        System.out.println("Player's score set. New score: " + this.score);
    }
}

public class QuizBee{
    public static Scanner input = new Scanner(System.in);
    public static String listnames[] = {"admin", "user"};
    public static String genpw[] = {"admin"};
    public static QuizBeeSystem quiz = new QuizBeeSystem();
    public static String playername;
    
    public static void ClearScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    
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
        YesOrNo();
        
        System.exit(0);
    }

    public static void WelcomeMessage(){
        System.out.println("Welcome to Quiz Bee!");
        System.out.print("Press Enter to Continue...");
        WaitForEnter();
        ClearScreen();
    }

    public static void YesOrNo(){
        char ans, lans;

        do{
            System.out.print("Login (Y/N)? ");
            ans = input.next().charAt(0);
        
            lans = Character.toLowerCase(ans);
            switch(lans){
                case 'y':
                    ClearScreen();
                    LoginPanel();
                    break;
                case 'n':
                    ClearScreen();
                    System.out.println("The program is now exiting");
                    System.exit(0);
                default:
                    System.out.println("Wrong input! Press Enter to try again");
                    ClearScreen();
                    break;
            }
        }while(lans != 'n');
    }
    
    public static void LoginPanel(){
        String username, password;
        
        System.out.print("Enter username: ");
        username = input.next();
        String lu = username.toLowerCase();
        
        if(lu.contains(listnames[0])){
            System.out.print("Password: ");
            password = input.next();
            if(password.contains(genpw[0])){
                System.out.print("You signed in as: " +lu);
                WaitForEnter();
                ClearScreen();
                AdminPanel();
            }else{
                System.out.println("Wrong password!");
                WaitForEnter();
                ClearScreen();
            }
        }else if(lu.contains(listnames[1])){
            EnterName();
            ClearScreen();
            UserPanel();
        }else{
            System.out.println("Wrong input!");
        }
    }

    public static void AdminPanel(){
        int choice;
        do{
            System.out.println("Welcome admin to the Quiz Bee System!");
            System.out.println("What would you like to do?");
            System.out.println("1 - Add a question & answer");
            System.out.println("2 - Search for the question");
            System.out.println("3 - Display all of the questions");
            System.out.println("4 - Remove a question");
            System.out.println("5 - Modify a question");
            System.out.println("6 - Add player's score");
            System.out.println("7 - Subtract player's score");
            System.out.println("8 - Set player's score");
            System.out.println("0 - Back to Login Screen");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch(choice){
                case 0:
                    ClearScreen();
                    break;
                case 1:
                    // Add Question
                    ClearScreen();
                    System.out.print("Enter the question: ");
                    input.nextLine();
                    String question = input.nextLine();
                    System.out.print("Enter the answer: ");
                    String answer = input.next();
                    quiz.addQuestion(question, answer);
                    ClearScreen();
                    break;
                case 2:
                    // Search Question
                    ClearScreen();
                    System.out.print("Number of the question: ");
                    int search = input.nextInt();
                    quiz.searchQuestions(search - 1);
                    WaitForEnter();
                    ClearScreen();
                    break;
                case 3:
                    // Display Question
                    ClearScreen();
                    quiz.displayQuestions();
                    System.out.print("Press Enter to go back to main menu");
                    WaitForEnter();
                    ClearScreen();
                    break;
                case 4:
                    // Remove Question;
                    ClearScreen();
                    System.out.print("Enter the number of question to remove: ");
                    int number = input.nextInt();
                    quiz.removeQuestion(number - 1);
                    ClearScreen();
                    break;
                case 5:
                    // Modify Question
                    ClearScreen();
                    System.out.print("Enter the index of question to modify: ");
                    int modIndex = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter the new question: ");
                    String modQuestion = input.nextLine();
                    System.out.print("Enter the new answer: ");
                    String modAnswer = input.nextLine();
                    quiz.modifyQuestion(modIndex - 1, modQuestion, modAnswer);
                    ClearScreen();
                    break;
                case 6:
                    // Add Player's score
                    ClearScreen();
                    System.out.print("Enter the amount to add to player's score: ");
                    int addScore = input.nextInt();
                    quiz.addScore(addScore);
                    ClearScreen();
                    break;
                case 7:
                    // Subtract Player's score
                    ClearScreen();
                    System.out.print("Enter the amount to subtract from player's score: ");
                    int subtractScore = input.nextInt();
                    quiz.subtractScore(subtractScore);
                    ClearScreen();
                    break;
                case 8:
                    // Set Player's score
                    ClearScreen();
                    System.out.print("Enter the new score for the player: ");
                    int newScore = input.nextInt();
                    quiz.setScore(newScore);
                    ClearScreen();
                    break;
                default:
                    System.out.print("Wrong option!");
                    WaitForEnter();
                    ClearScreen();
                    break;
            }
        }while(choice != 0);
    }

    public static void EnterName(){
        ClearScreen();
        System.out.print("Enter your desired nickname: ");
        input.nextLine();
        playername = input.nextLine();
        ClearScreen();

        System.out.println("-REMINDER: YOU CANNOT CHANGE YOUR USERNAME AFTER THIS OPTION-");
        System.out.print(playername + ", is it correct? (Y/N) ");
        char ans = input.next().charAt(0);
        char lans = Character.toLowerCase(ans);

        if(lans == 'y'){
            System.out.print("Press enter to continue...");
            WaitForEnter();
        }else if(lans == 'n'){
            ClearScreen();
            System.out.println("-REMINDER: YOU CANNOT CHANGE YOUR USERNAME AFTER MODIFICATION-");
            System.out.print("Enter your modified desired nickname: ");
            input.nextLine();
            String mplayername = input.nextLine();
            playername = mplayername;
            System.out.print(playername + ", Press enter to continue...");
            WaitForEnter();
        }else{
            System.out.println("I assume you are fine with " +playername);
            System.out.print("Press enter to continue...");
            WaitForEnter();
        }
    }

    public static void UserPanel(){
        int choice;

        do{
            System.out.println("Welcome "+playername+" to the Quiz Bee!");
            System.out.println("What would you like to do?");
            System.out.println("1 - Start the Quiz Bee");
            System.out.println("0 - Return to Login Screen");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch(choice){
                case 1:
                    StartQuizBee();
                    break;
                case 0:
                    WaitForEnter();
                    ClearScreen();
                    break;
                default:
                    System.out.print("Wrong option!");
                    WaitForEnter();
                    ClearScreen();
                    break;
            }
        }while(choice != 0);
    }

    public static void StartQuizBee(){
        for (int i = 0; i < quiz.getQuestionCount(); i++){
            ClearScreen();
            System.out.println((i + 1) + ". " + quiz.getQuestion(i));
            System.out.print("Enter your answer: ");
            String userAnswer = input.next();
            quiz.verifyAnswer(i, userAnswer);
            quiz.displayScore();
            WaitForEnter();
        }
    ClearScreen();
    }
}