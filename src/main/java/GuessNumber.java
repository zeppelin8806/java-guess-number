import java.util.Scanner;
import java.lang.Math;
public class GuessNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please guess a number between 1 & 100: ");
        String guessString = input.nextLine();
        int guess = Integer.parseInt(guessString);

        double answer =  Math.random();
        answer = (int)(answer *100);


        while(guess!=answer) {
            if (guess > answer) {
                System.out.print("Your number is too high. Guess again:");
            } else if (guess < answer) {
                System.out.print("Your number is too low. Guess again:");
            }
            guessString = input.nextLine();
            guess = Integer.parseInt(guessString);
        }
        if(guess == answer){
            System.out.print("Correct!! You guess the correct number!");
        }
    }

}
