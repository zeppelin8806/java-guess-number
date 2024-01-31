package com.techelevator;

public class HomeworkAssignment {

    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    private String letterGrade;


    public int getPossibleMarks() {
        return possibleMarks;
    }
    public void setEarnedMarks(int earnedMarks){
        this.earnedMarks = earnedMarks;
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }
    public HomeworkAssignment(int possibleMarks, String submitterName){
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;

    }
    public String getLetterGrade(){
        double percent = (double)earnedMarks/possibleMarks;
        if(percent>=.9){
            return"A";
        } else if(percent >= .8){
            return "B";
        } else if(percent >=.7){
            return "C";
        } else if (percent>= .6) {
            return "D";
        } else{
            return "F";
        }

    }
}
