package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String value = input.nextLine();
		int decimal = Integer.parseInt(value);

		int remain = 0;

		for(int i = 0; i<10; i++){
			int valueNew;
			valueNew = decimal / 2;
			if(decimal%2 == remain)
		}



	}

}