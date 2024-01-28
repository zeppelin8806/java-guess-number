package com.techelevator;

public class FruitTree {

    private String typeOfFruit;
    private int startingPiecesOfFruit;
    private int piecesOfFruitLeft;


    public int getPiecesOfFruitLeft() {
        return startingPiecesOfFruit;
    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public boolean pickFruit(int numberOfPiecesToRemove){
        int x = startingPiecesOfFruit-numberOfPiecesToRemove;
        piecesOfFruitLeft = x;
        if(piecesOfFruitLeft>0){
            return true;
        }
        return false;
    }

    public FruitTree(String typeOfFruit, int startingPiecesOfFruit){
        this.typeOfFruit = typeOfFruit;
        this.startingPiecesOfFruit = startingPiecesOfFruit;
    }

}
