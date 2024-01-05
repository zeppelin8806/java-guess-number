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


        int answer = 0;
        for(int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                answer = answer + i;
            }
        }
        System.out.println(answer);

    }


    static void sayGreeting(String nameOfPersonToGreet, double timeOfDay){
        System.out.println("Hello " + nameOfPersonToGreet);
        System.out.println("It's really nice to meet you");
        System.out.println("How're you");


        // Need this line if return type is 'int'
        //return 0;

        // Void methods do not need a return type
    }
    public int sumOddsBetweenValues(int start, int end){
        int diff = end - start;
        if(diff == 0){
            return 0;
        }
        int[] arr = new int[diff+1];
        arr[0] = start;
        arr[arr.length-1] = end;
        int n = arr[0];
        for (int i = 1; i <arr.length; i++){
            arr[i] = (start +1);
            if(arr[i]%2==1){
                n = n+arr[i];
            }
        }
        return n;
    }
    public int blackjack(int a, int b){
        int blackjack = 21;

        if(a == blackjack){
            return a;
        } else if (b == blackjack){
            return b;
        } else if (b > 21 && a < 21){
            return a;
        } else if (a > 21 && b < 21){
            return b;
        } return 0;
    }
    (blackjack(19,20));


}
