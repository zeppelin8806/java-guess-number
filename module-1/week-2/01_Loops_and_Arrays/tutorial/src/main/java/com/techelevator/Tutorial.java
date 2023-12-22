package com.techelevator;

public class Tutorial {

    public static void main(String[] args) {
        int i;
        for (i = 0; i<=5; i++){
            System.out.println(i);
        }
        for (i = 10; i>= 0; i--){
            System.out.println(i);
        }
        int[] forcastTemperatures = new int[5];
        forcastTemperatures[0] = 78;
        forcastTemperatures[1] = 72;
        forcastTemperatures[2] = 58;
        forcastTemperatures[3] = 79;
        forcastTemperatures[4] = 74;

        for (i = 0; i < forcastTemperatures.length; i++){
            System.out.println(forcastTemperatures[i]);
        }

        int highestTemperatureValue = forcastTemperatures[0];
        int highestTemperatureIndex = 0;

        for (int j=1; j < forcastTemperatures.length; j++){
            if (forcastTemperatures[j] > highestTemperatureValue){
                highestTemperatureValue = forcastTemperatures[j];
                highestTemperatureIndex = j;
            }
        }
        System.out.println("The highest temperature is " + highestTemperatureValue);
        System.out.println("The highest temperature is in " + (highestTemperatureIndex + 1) + " days");

        // write your code here






    }
}
