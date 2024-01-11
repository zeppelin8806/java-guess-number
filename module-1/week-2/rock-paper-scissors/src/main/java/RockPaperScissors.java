import java.util.Random;
import java.util.Scanner;

/*
The classic game of rock, paper, scissors.
2 players can throw either rock, paper, or scissors.
The rules below determine who wins:

   rock beats scissors
   rock loses to scissors

   paper beats rock
   paper loses to scissors

   paper beats rock
   paper loses to scissors

   if both players throw the same thing it's a draw.

Create a best-of-3 game of rock, paper, scissors where the user
plays against the computer.

Use the getRandomNumber method to get a random integer of 0, 1, 2
Hint: Use an if statement and correlate 0 with rock, 1 with paper, 2 with scissors
*/
public class RockPaperScissors {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numTimesPlayerHasWon = 0;
        int numTimesComputerHasWon = 0;

        // 4. Repeat for as many rounds as needed
        //          best of 3 is the same as first to 2 wins
        while( numTimesPlayerHasWon < 2 && numTimesComputerHasWon < 2 ){

            // 1. Get what the user will throw (r,p,s)
            //          *check validity of user input
            System.out.print("Please enter rock, paper, or scissors: ");
            String userSelection = input.nextLine();

            // 2. Get a random item to throw from the computer
            //                                    0        1         2
            String[] throwItems = new String[]{ "rock", "paper", "scissors" };
            int randomIndex = getRandomNumber();

            String computerSelection = throwItems[randomIndex];

            /*
             * Checkpoint: make sure everything is good from here.
             */
            System.out.println("The user selected ..: " + userSelection);
            System.out.println("The computer selected: " + computerSelection);

            boolean hasPlayerWon = (userSelection.equals("rock") && computerSelection.equals("scissors")) ||
                    (userSelection.equals("paper") && computerSelection.equals("rock")) ||
                    (userSelection.equals("scissors") && computerSelection.equals("paper"));

            // 3. Check who won
            //      check for ties first. accounts for 3 of the 9 possibilites
            if(userSelection.equalsIgnoreCase(computerSelection)){
                System.out.println("It's a draw!!!");
            } else if(hasPlayerWon){
                System.out.println("Hurray, you've won!!!!");
                numTimesPlayerHasWon++;
            } else {
                System.out.println("Umph, you've list :````(");
                numTimesComputerHasWon++;
            }
        }






    }






    /**
     * Gets a random number, either a 0, 1, or 2
     * @return
     */
    public static int getRandomNumber(){
        return new Random().nextInt(3);
    }
}
