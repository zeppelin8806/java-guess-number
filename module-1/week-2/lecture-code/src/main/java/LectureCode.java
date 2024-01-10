import java.util.Scanner;

public class LectureCode {

    public static void main(String[] args) {

//        int[] intArr;
//
//        Scanner scanner = new Scanner(System.in);
//        String userSelection = "";
//        boolean validUserSelection = false;
//
//        do {
//            System.out.println("Please enter 'rock', 'paper', or 'scissors'");
//            userSelection = scanner.nextLine();
//
//            validUserSelection = userSelection.equals("rock") ||
//                    userSelection.equals("paper") || userSelection.equals("scissors");
//
//        } while( ! validUserSelection);
//
//        System.out.println("You entered: " + userSelection);

        getSandwich("breadjambread");

    }

    /*
     * https://codingbat.com/prob/p129952
     *
     * A sandwich is two pieces of bread with something in between.
     * Return the string that is between the first and last appearance
     * of "bread" in the given string, or return the empty string "" if
     * there are not two pieces of bread.
     *
     * getSandwich("breadjambread") → "jam"
     * getSandwich("xxbreadjambreadyy") → "jam"
     * getSandwich("xxbreadyy") → ""
     *
     * SOLVED FOR 2 BREAD substrings
     *     TODO: only 1 bread, no bread, empty string
     */
    public static String getSandwich(String str) {

        String filling = "";

        // 1. Find the "bread" from the start of the String
        //      Get the INDEX of the start of "bread"
        int firstBreadIndex = str.indexOf("bread");

        // 2. Find the "bread" from the end of the String
        //      Get the INDEX of the start of "bread"
        int lastBreadIndex = str.lastIndexOf("bread");

        if(firstBreadIndex == lastBreadIndex){
            return "";
        }
        // b r e a d j a m b r e a d
        // 0 1 2 3 4 5 6
        int breadLength = "bread".length();
        filling = str.substring(firstBreadIndex + breadLength, lastBreadIndex);

        return filling;
    }

    /*
     * https://codingbat.com/prob/p111327
     *
     * Return the sum of the numbers in the array, except ignore sections of
     * numbers starting with a 6 and extending to the next 7 (every 6 will be
     * followed by at least one 7). Return 0 for no numbers.
     *
     * sum67([1, 2, 2]) → 5
     * sum67([1, 2, 2, 6, 99, 99, 7]) → 5
     * sum67([1, 1, 6, 7, 2]) → 4
     */
    public int sum67(int[] nums) {

        int sum = 0;

        if(nums.length == 0){
            return 0;
        }

        // nums array has at least 1 element...
        boolean sixFound = false;

        // 1. Go through all the elements in the array
        for(int i = 0; i < nums.length; i++){

            int firstNumber = nums[i];

            // Check for a 6
            if(firstNumber == 6){
                sixFound = true;
            }
            else if(sixFound && firstNumber == 7){
                sixFound = false;
            }
            else if(!sixFound) {
                sum += nums[i];
            }
        }

        return sum;
    }
}
