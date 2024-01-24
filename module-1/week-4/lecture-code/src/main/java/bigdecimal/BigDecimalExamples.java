package bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
 * double float imprecision
 * https://0.30000000000000004.com/
 */
public class BigDecimalExamples {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String decimalNumber = input.nextLine();

        /*
         * Initializing a big decimal object from a string
         */
        BigDecimal num1 = new BigDecimal(decimalNumber);
        System.out.println(num1);

        /*
         * .compareTo
         * -1  first num is less than num2
         * 0   first num is equal to num2
         * 1   first num is greater than num2
         */
        BigDecimal num2 = new BigDecimal("5");
        boolean isLessThanOrEqualTo = num1.compareTo(num2) <= 0;
        if(isLessThanOrEqualTo){
            // Code if num1 is smaller than OR EQUAL to num2
        }

        /*
         * String alphabetical comparisons
         */
        "a".compareTo("b");

        /*
         * Creating BigDecimal values
         */
        BigDecimal zero = BigDecimal.ZERO;
        BigDecimal one = BigDecimal.ONE;

        // DO NOT use the double constructor, new BigDecimal(0.1)
        BigDecimal value1 = new BigDecimal("0.1");
        BigDecimal value2 = new BigDecimal("0.2");

        BigDecimal five = new BigDecimal("5");
        BigDecimal two = new BigDecimal("2");

        /*
         * Math operators
         */
        System.out.println(value1 + " + " + value2 + " = " + value1.add(value2));
        System.out.println(value1 + " - " + value2 + " = " + value1.subtract(value2));
        System.out.println(value1 + " * " + value2 + " = " + value1.multiply(value2));
        System.out.println(five  + " / " + two    + " = " + five.divide(two));
        System.out.println(five  + " % " + two    + " = " + five.remainder(two));

        /*
         * Setting the number of digits after the decimal point
         */
        BigDecimal three = new BigDecimal("3");
        BigDecimal quotient = two.divide(three, 5, RoundingMode.HALF_UP);
        System.out.println();
        System.out.println("Scale 5 digits after decimal point. Round half up");
        System.out.println(two + " / " + three + " = " + quotient);

        System.out.println();
        System.out.println("Scale 8 digits after decimal point. Round half up");
        System.out.println(value1 + " * " + value2 + " = " + value1.multiply(value2).setScale(8, RoundingMode.HALF_UP));

        System.out.println();

        /*
         * Comparing BigDecimal objects
         */
        System.out.println(value1 + " compareTo " + value2 + " => " + value1.compareTo(value2));
        System.out.println(value2 + " compareTo " + value1 + " => " + value2.compareTo(value1));
        System.out.println(value1 + " compareTo " + value1 + " => " + value1.compareTo(value1));
    }
}
