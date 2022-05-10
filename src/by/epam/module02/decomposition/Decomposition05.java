package by.epam.module02.decomposition;

import java.util.Arrays;

/*
Составить программу, которая в массиве  A[N] находит второе по величине число (вывести на печать число, 
которое меньше максимального элемента массива, но больше всех других элементов)
*/

public class Decomposition05 {

	public static void main(String[] args) {
		int[] array = new int[0];

		printSecondLargestValueInArray(array);

		array = new int[] { 1 };
		printSecondLargestValueInArray(array);

		array = new int[] { 1, 1, 1 };
		printSecondLargestValueInArray(array);

		array = new int[] { 1, 2 };
		printSecondLargestValueInArray(array);

		array = new int[] { 1, 2, 3, 4, 5 };
		printSecondLargestValueInArray(array);

		array = new int[] { 5, 4, 3, 2, 1 };
		printSecondLargestValueInArray(array);

		array = new int[] { 5, 4 };
		printSecondLargestValueInArray(array);
	}

	private static void printSecondLargestValueInArray(int[] array) {
		if (array.length < 2) {
			System.out.println("There are not enough numbers in the array: " + Arrays.toString(array));

			return;
		}

		if (!isDifferentMeanings(array)) {
			System.out.println("The array: " + Arrays.toString(array) + " contains only the same numbers!");

			return;
		}

		int maxValue;
		int secondMaxValue;

		maxValue = array[0];
		secondMaxValue = getSecondMaxValue(array, maxValue);

		if (maxValue == secondMaxValue) {
			maxValue = array[1];
			secondMaxValue = getSecondMaxValue(array, maxValue);
		}

		System.out.println("Second largest value in array: " + Arrays.toString(array) + " = " + secondMaxValue);
	}

	private static int getSecondMaxValue(int[] array, int maxValue) {
		int secondMaxValue;

		secondMaxValue = maxValue;

		for (int value : array) {
			if (value > maxValue) {
				secondMaxValue = maxValue;
				maxValue = value;
			}
		}

		return secondMaxValue;
	}

	private static boolean isDifferentMeanings(int[] array) {
		for (int i = 1; i < array.length; i++) {
			if (array[i] != array[i - 1]) {
				return true;
			}
		}

		return false;
	}
}
