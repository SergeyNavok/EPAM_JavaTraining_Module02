package by.epam.module02.array;

import java.util.Arrays;

/*
Даны действительные числа а1 ,а2 ,..., аn . 
Поменять местами наибольший и наименьший элементы.
*/

public class Array04 {

	public static void main(String[] args) {
		int maxIndex;
		int minIndex;
		double maxNumber;
		double minNumber;
		double[] array = new double[] { 1.1, 2.2, -3.3, 4.4, 5.5, 6.6, -7.7, 8.8, 9.9, 0 };

		maxNumber = array[0];
		maxIndex = 0;
		minNumber = array[0];
		minIndex = 0;

		for (int i = 0; i < array.length; i++) {
			if (maxNumber < array[i]) {
				maxNumber = array[i];
				maxIndex = i;
			}

			if (minNumber > array[i]) {
				minNumber = array[i];
				minIndex = i;
			}
		}

		System.out.println("Old array: " + Arrays.toString(array));

		array[maxIndex] = minNumber;
		array[minIndex] = maxNumber;

		System.out.println("New array: " + Arrays.toString(array));
	}
}
