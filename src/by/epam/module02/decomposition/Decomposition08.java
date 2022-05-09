package by.epam.module02.decomposition;

import java.util.Arrays;

/*
Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6].
Пояснение. Составить  метод(методы)  для вычисления суммы трех последовательно расположенных элементов 
массива с номерами от k до m.
*/

public class Decomposition08 {

	public static void main(String[] args) {
		int[] array = new int[0];
		printSumThreeNumbersFromArray(array);

		array = new int[] { 1, 1, 1, 2, 2, 2, 3, 3, 3 };
		printSumThreeNumbersFromArray(array);

		array = new int[] { 1, 1, 1, 2, 2, 2, 3 };
		printSumThreeNumbersFromArray(array);
	}

	public static void printSumThreeNumbersFromArray(int[] array) {
		if (array.length < 2) {
			System.out.println("Array does not match the condition!");
			System.out.println();

			return;
		}

		int sum;
		int counter;

		counter = 0;

		System.out.println(Arrays.toString(array));

		for (int i = 2; i < array.length; i += 3) {
			sum = array[i - 2] + array[i - 1] + array[i];
			counter += 3;

			System.out.printf("%d + %d + %d = %d\n", array[i - 2], array[i - 1], array[i], sum);
		}

		counter = array.length - counter;

		if (counter != 0) {
			System.out.println("The remaining " + counter + " elements of the array do not match the condition");
			System.out.println();
		}

		System.out.println();
	}
}
