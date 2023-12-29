package com.techelevator;

import java.util.Scanner;

public class Tutorial {

    public static void main(String[] args) {

        // ***********  Step 1: Use the *new* operator to create Strings on the Heap  *************
// Create a new string from an array of characters
        char[] helloChars = new char[] {'h', 'e', 'l', 'l', 'o', '!'};
        String greeting = new String(helloChars);
        System.out.println("Greeting: " + greeting);

// You can also create a string by passing in a literal value, in double-quotes
        String salutation = new String("Welcome my friend");
        System.out.println("Salutation: " + salutation);

// Java allows you to skip the *new* operator when creating a new String
        String toast = "May the compiler rise up to meet you.";
        System.out.println("Toast: " + toast);
        // ***********  Step 2: Try out some String methods  *************





        // ***********  Step 3: Compare Strings  *************





    }
}
