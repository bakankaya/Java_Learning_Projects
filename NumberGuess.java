import java.util.Scanner;

public class NumberGuess {

    public static int takeInput(){
        Scanner scan = new Scanner(System.in);

        while(!scan.hasNextInt()){
            String invalidInput = scan.next(); // Read and discard the invalid input
            System.out.println("Please enter an integer.");
            System.out.print("Enter a number: ");
        }
            return scan.nextInt();
        //    scan.close();
    }


    public static void main(String[] args) {

// Create a random number between 0-100 and a counter
        int randomNum = (int)(Math.random() * 101);
        int counter = 0;
        int guess;

// Take a number from user
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("Find the Number between 0-100;");
        System.out.println("Enter a number: ");
        guess = takeInput();

// compare and give hint
// and stop the game at finding the number
        while(randomNum != guess){
            if (randomNum > guess){
                counter ++;
                System.out.println("Guess higher:");
                guess = takeInput();
            } else if (randomNum < guess){
                counter ++;
                System.out.println("Guess lower:");
                guess = takeInput();
            }
        }
        System.out.println("You have found the number, Congratulations!");
        System.out.println("It took you " + counter + " times to find it.");
    }
}



// add and escape command to finish without finding

