package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the temperature: ");
		String value = input.nextLine();
		int temperature = Integer.parseInt(value);

		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit?");
		value = input.nextLine();
		String unit = value;

		if (unit.equals("C")) {
			double temperatureFarenheit = (temperature * 1.8) + 32;
			System.out.println(temperature + unit + "is " + temperatureFarenheit + "F");
		} else if (unit.equals("F")) {
			int temperatureCelsius = (int)((temperature - 32) / 1.8);
			System.out.println(temperature + unit + "is " + temperatureCelsius + "C");
		}
	}
}