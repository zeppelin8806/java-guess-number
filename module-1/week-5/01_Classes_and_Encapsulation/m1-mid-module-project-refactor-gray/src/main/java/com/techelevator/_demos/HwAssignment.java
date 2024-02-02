package com.techelevator._demos;

public class HwAssignment {

    int possibleMarks;
    int earnedMarks;

    /*
     * Create a constructor to set up a rule that the total
     * possible marks must be known to use this class correctly
     */
    public HwAssignment(int possibleMarks){
        this.possibleMarks = possibleMarks;
    }

    public void setEarnedMarks(int earnedMarks){
        this.earnedMarks = earnedMarks;
    }
}
