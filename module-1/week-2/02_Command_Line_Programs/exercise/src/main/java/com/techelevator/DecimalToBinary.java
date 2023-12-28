package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String value = input.nextLine();
		String[] set = value.split(" ");
		int[] setNumbers = new int[set.length];

		for(int i = 0; i < setNumbers.length; i++){
			setNumbers[i] = Integer.parseInt(set[i]);

			int remain = 0;
			int valueNew = setNumbers[i] / 2;
			String binaryString = String.valueOf(setNumbers[i] % 2);

			while(valueNew > 0){
				remain = valueNew % 2;
				valueNew = valueNew / 2;
				binaryString = String.valueOf(remain) + binaryString;
			}
			System.out.println(setNumbers[i] + " in binary is " + binaryString);
		}



	}

}