package com.techelevator._demos;

public class Car {
    int numDoors = 4;
    String color = "Silver";
    double engineSize;

    // First constructor
    public Car(int numDoors, String color){
        this.numDoors = numDoors;
        this.color = color;
    }

    // Second constructor
    public Car(int numDoors, String color, double engineSize){
        this.numDoors = numDoors;
        this.color = color;
        this.engineSize = engineSize;
    }

    @Override
    public String toString(){
        return "This is a " + color + " car with " + numDoors + " doors";
    }
}
