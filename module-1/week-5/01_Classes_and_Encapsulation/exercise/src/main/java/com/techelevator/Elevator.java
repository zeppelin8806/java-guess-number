package com.techelevator;

public class Elevator {
    private int currentFloor;
    private int numberOfFloors;
    private boolean doorOpen;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }
    public Elevator(int numberOfLevels){
        getCurrentFloor();
        currentFloor = 1;
        getNumberOfFloors();
        numberOfFloors = numberOfLevels;
    }
    public void openDoor(){
        doorOpen = true;
    }
    public void closeDoor(){
        doorOpen = false;
    }
    public void goUp(int desiredFloor){
        openDoor();
        if(desiredFloor>currentFloor && desiredFloor<=numberOfFloors){
            closeDoor();
            currentFloor=desiredFloor;
        } else if(desiredFloor == currentFloor){
            openDoor();
        }
    }
    public void goDown(int desiredFloor){
        openDoor();
        if(desiredFloor<currentFloor && desiredFloor>0){
            closeDoor();
            currentFloor=desiredFloor;
        } else if(desiredFloor == currentFloor){
            openDoor();
        }
    }
}
