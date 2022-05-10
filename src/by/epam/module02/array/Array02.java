package by.epam.module02.array;

import java.util.Arrays;

/*
Дана последовательность действительных чисел  а1 ,а2 ,..., аn.  
Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
*/

public class Array02 {

	public static void main(String[] args) {
		double number;
		double[] array = new double[] { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9 };

		number = 6.0;
		replaceNumberInArray(array, number);

		number = 100.0;
		replaceNumberInArray(array, number);
	}

	private static void replaceNumberInArray(double[] array, double number) {
		int counter;
		double[] arrayCopy;

		counter = 0;
		arrayCopy = array.clone();

		for (int i = 0; i < arrayCopy.length; i++) {
			if (arrayCopy[i] > number) {
				arrayCopy[i] = number;
				counter++;
			}
		}

		System.out.println("Old array: " + Arrays.toString(array));
		System.out.println("New array: " + Arrays.toString(arrayCopy));
		System.out.println("Number of substitutions = " + counter);
		System.out.println();
	}
}
