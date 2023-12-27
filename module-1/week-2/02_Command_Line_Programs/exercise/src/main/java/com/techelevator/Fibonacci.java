package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		String value = input.nextLine();
		int number = Integer.parseInt(value);

		int n1 = 0;
		int n2 = 1;
		int n3 = 2;
		String fib = "0,1";

		if(number <= 0 ){
			System.out.println("0,1");
		} else if(number == 1){
			System.out.println("0,1,1");
		} else{
			for (int i = 2; n3 < number; i++) {
				n3 = n1 + n2;
				if (number < n3){
					break;
				};
				fib = fib + "," + Integer.toString(n3);
				n1 = n2;
				n2 = n3;
			}
		}
		System.out.println(fib);
	}

}
