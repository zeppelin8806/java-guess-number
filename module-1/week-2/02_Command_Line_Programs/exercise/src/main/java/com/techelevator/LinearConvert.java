package com.techelevator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the length: ");
		String value = input.nextLine();
		int length = Integer.parseInt(value);

		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		value = input.nextLine();
		String unit = value;

		if(unit.equals("m")){
			int metersToFeet = (int)(length * 3.2808399);
			System.out.println(length + "m is approximately" + metersToFeet + "f");
		} else if (unit.equals("f")){
			int feetToMeters = (int)(length * 0.3048 );
			System.out.println(length + "f is approximately " + feetToMeters + "m");
		}

	}
}
