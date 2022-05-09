package by.epam.module02.sorting;

import java.util.Arrays;

import by.epam.module02.decomposition.Fraction;

/*
Даны дроби p1/q1, p2/q2, ..., pn/qn (p, q - натуральные). 
Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
*/

public class Sorting08 {

	public static void main(String[] args) {
		Fraction[] fractions = new Fraction[5];

		fractions[0] = new Fraction(1, 3);
		fractions[1] = new Fraction(2, 6);
		fractions[2] = new Fraction(-6, 2);
		fractions[3] = new Fraction(0, 0);
		fractions[4] = new Fraction();

		System.out.println("Array of fractions before conversion: " + Arrays.toString(fractions));

		bringToCommonDenominator(fractions);

		System.out.println("Array of fractions after reduction to a common denominator: " + Arrays.toString(fractions));

		sortInAscendingOrderConvertedFractions(fractions);

		System.out.println("Array of fractions after sorting: " + Arrays.toString(fractions));
	}

	public static void bringToCommonDenominator(Fraction[] fractions) {
		if (fractions.length < 2) {
			System.out.println("Nothing to bring to a common denominator!");

			return;
		}

		int temp;
		int commonDenominator;

		commonDenominator = fractions[0].getDenominator();

		for (int i = 1; i < fractions.length; i++) {
			commonDenominator = leastCommonDivisor(commonDenominator, fractions[i].getDenominator());
		}

		for (int i = 0; i < fractions.length; i++) {
			temp = fractions[i].getNumerator();
			temp *= commonDenominator;
			fractions[i].setNumerator(temp);

			temp = fractions[i].getDenominator();
			temp *= commonDenominator;
			fractions[i].setDenominator(commonDenominator);
		}
	}

	public static int greatestCommonMultiple(int a, int b) {
		int temp;

		while (b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}

	public static int leastCommonDivisor(int a, int b) {
		int result;

		result = a * b / greatestCommonMultiple(a, b);

		return result;
	}

	public static void sortInAscendingOrderConvertedFractions(Fraction[] fractions) {
		if (fractions.length < 2) {
			System.out.println("Nothing to sort!");

			return;
		}

		Fraction temp;

		for (int i = 0; i < fractions.length; i++) {
			for (int j = 0; j < fractions.length; j++) {
				if (fractions[i].getNumerator() < fractions[j].getNumerator()) {
					temp = fractions[i];
					fractions[i] = fractions[j];
					fractions[j] = temp;
				}
			}
		}
	}
}
