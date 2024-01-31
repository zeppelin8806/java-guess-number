package com.techelevator;

public class FruitTree {

    String typeOfFruit;
    int piecesOfFruitLeft;
    int startingPiecesOfFruit;


    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }
    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public FruitTree(String typeOfFruit, int startingPiecesOfFruit){
        this.typeOfFruit = typeOfFruit;
        this.startingPiecesOfFruit = startingPiecesOfFruit;
    }

    public boolean pickFruit(int numberOfPiecesToRemove){
        if(startingPiecesOfFruit>numberOfPiecesToRemove){
            piecesOfFruitLeft = startingPiecesOfFruit-numberOfPiecesToRemove;
            return true;
        }
        return false;
    }



}
