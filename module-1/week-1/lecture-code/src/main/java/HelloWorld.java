public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello Gray class!!!");
        System.out.println("This is the second line of code");

        /*
         * VARIABLES
         */
        // Store the value of 5 into a variable named
        // 'myVariable'
        int score = 0;
        double myDecimalVariable = 5.5;
        boolean isMonday = false;
        char letterOfFirstName = 'd';

        // 'f' suffix needed for float literals
        // 'L' suffix needed for long literals
        float myFloatVariable = 5.5f;
        long myLongVariable = 12398398547L;

        // double --> int, requires cast and decimal values dropped
        score = (int)myDecimalVariable;

        // Strings plus other expressions
        //                                    0 -> "0"
        System.out.println("My score is: " + (score + 1));

        // Increase the value of score by 1
        score += 1;     // score = score + 1;

        //         (10)      /  (10)
        score = (score * 10) / (2 * 5);

        // DO NOT do this
        score = score * 10 / 2 * 5;
        System.out.println(score);

        // double --> int cast always rounds down
        System.out.println("Casted value is: " + ( (int)42.999999));


        /*
         * BRANCHING
         */
        int highScore = 42;

        // boolean expression
        if( score == 0 ){
            System.out.println("SORRy, you lose :(");
        }
        else if( score > highScore ){
            System.out.println("CONGRATS on setting a new record!!!");
            highScore = score;
        } else {
            System.out.println("KEEP PRACTICING...");
        }

        System.out.println("AFTER MY IF statements");


        boolean isFriday = false;
        int numberOfFriendsThatWantToGoToChicFilet = 2;

        if(isFriday && (numberOfFriendsThatWantToGoToChicFilet >= 2) ){
            System.out.println("PARTY TIME!!");
        }

        if(!isFriday){
            System.out.println("THIS IS NOT FRIDAY");
        }

        String name = "Finn";

        if(name.equalsIgnoreCase("finn")){
            System.out.println("You're FINN!");
        }

        /*
         * METHOD CALLS & DEFINITION
         */

        sayGreeting(name, 12.30);
        sayGreeting("Raina", 9.15);
        sayGreeting("Bobby", 8.05);
    }

    static void sayGreeting(String nameOfPersonToGreet, double timeOfDay){
        System.out.println("Hello " + nameOfPersonToGreet);
        System.out.println("It's really nice to meet you");
        System.out.println("How're you");

        // Need this line if return type is 'int'
        //return 0;

        // Void methods do not need a return type
    }
}
