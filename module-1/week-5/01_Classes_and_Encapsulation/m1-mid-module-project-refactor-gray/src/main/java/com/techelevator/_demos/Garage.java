package com.techelevator._demos;

public class Garage {

    public static void main(String[] args) {

        /*
         * Calling the first constructor
         */
        Car corolla = new Car(4, "silver");

        /*
         * Calling the 2nd constructor
         */
        Car jeep = new Car(2, "green", 50.2);
        Car sorrento = new Car(4, "blue", 45.2);

        System.out.println(jeep);
    }
}
