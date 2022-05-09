package by.epam.module02.sorting;

import java.util.Arrays;

/*
Даны две последовательности a1 < a2 < ... < an и b1 < b2 < ... bm.
Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей. 
Примечание. Дополнительный массив не использовать.
*/

public class Sorting02 {

	public static void main(String[] args) {
		int[] array1 = new int[] { 1, 3, 4, 6, 8 };
		int[] array2 = new int[] { 2, 5, 7, 9 };
		concatenateSortedArrays(array1, array2);

		array1 = new int[] { 1, 3 };
		array2 = new int[] { 4, 5 };
		concatenateSortedArrays(array1, array2);

		array1 = new int[] { 3, 3 };
		array2 = new int[] { 4, 5 };
		concatenateSortedArrays(array1, array2);

		array1 = new int[] { 1 };
		array2 = new int[] { 4, 5 };
		concatenateSortedArrays(array1, array2);

		array1 = new int[] { 1, 3 };
		array2 = new int[] { 1, 3 };
		concatenateSortedArrays(array1, array2);

		array1 = new int[] { 8, 3 };
		array2 = new int[] { 6, 5 };
		concatenateSortedArrays(array1, array2);

		array1 = new int[1];
		array2 = new int[1];
		concatenateSortedArrays(array1, array2);

		array1 = new int[0];
		array2 = new int[0];
		concatenateSortedArrays(array1, array2);
	}

	public static void concatenateSortedArrays(int[] array1, int[] array2) {
		if (!isSortedArray(array1) || !isSortedArray(array2)) {
			System.out.println("Array does not match the condition!");
			System.out.println();
			return;
		}

		int index1;
		int index2;

		index1 = array1.length + array2.length;

		int[] resultArray = new int[index1];

		index1 = 0;
		index2 = 0;

		for (int i = 0; i < resultArray.length; i++) {
			if (index1 >= array1.length) {
				resultArray[i] = array2[index2];
				index2++;
				continue;
			}

			if (index2 >= array2.length) {
				resultArray[i] = array1[index1];
				index1++;
				continue;
			}

			if (array1[index1] < array2[index2]) {
				resultArray[i] = array1[index1];
				index1++;
			} else {
				resultArray[i] = array2[index2];
				index2++;
			}
		}

		System.out.println("Array1: " + Arrays.toString(array1));
		System.out.println("Array2: " + Arrays.toString(array2));
		System.out.println("Result array: " + Arrays.toString(resultArray));
		System.out.println();
	}

	public static boolean isSortedArray(int[] array) {
		if (array.length < 1) {
			return false;
		}

		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] > array[i]) {
				return false;
			}
		}

		return true;
	}
}
