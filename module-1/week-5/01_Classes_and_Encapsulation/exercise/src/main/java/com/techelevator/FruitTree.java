package com.techelevator;

public class FruitTree {

    String typeOfFruit;
    int piecesOfFruitLeft;



    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }
    public String getTypeOfFruit() {
        return typeOfFruit;
    }


    public FruitTree(String typeOfFruit, int startingPiecesOfFruit){
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;
    }

    public boolean pickFruit(int numberOfPiecesToRemove){
        if(piecesOfFruitLeft>=numberOfPiecesToRemove){
            piecesOfFruitLeft = piecesOfFruitLeft-numberOfPiecesToRemove;
            return true;
        }
        return false;
    }



}
