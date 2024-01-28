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

    public String getLetterGrade() {
        return letterGrade;
    }

    public String getSubmitterName() {
        return submitterName;
    }
    public HomeworkAssignment(int possibleMarks, String submitterName){
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;

    }
    public String letterGrade(int possibleMarks, int earnedMarks){
        String letterearned = null;
        double percent = new Double (earnedMarks/possibleMarks);
        if(percent>=.9){
            letterearned = "A";
        } else if(percent >= .8){
            letterearned = "B";
        } else if(percent >=.7){
            letterearned = "C";
        } else if (percent>= .6) {
            letterearned = "D";
        } else{
            letterearned = "F";
        }
        return letterearned;
    }
}
