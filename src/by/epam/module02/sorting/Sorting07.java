package by.epam.module02.sorting;

import java.util.Arrays;

/*
Пусть  даны  две  неубывающие  последовательности  действительных  чисел a1 <= a2 <= ... <= an и 
b1 <= b2 <= ... <= bn. Требуется указать те места, на которые нужно вставлять элементы последовательности 
b1 <= b2 <= ... <= bn в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
*/

public class Sorting07 {

	public static void main(String[] args) {
		int[] array1 = new int[0];
		int[] array2 = new int[0];
		specifyIndexesToMerge(array1, array2);

		array1 = new int[] { 1, 2, 5, 7, 9, 0 };
		array2 = new int[0];
		specifyIndexesToMerge(array1, array2);

		array1 = new int[] { 1, 2, 5, 7, 9, 0 };
		array2 = new int[] { 1, 2, 5, 7, 9, 0 };
		specifyIndexesToMerge(array1, array2);

		array1 = new int[] { 1, 2, 5, 7, 9, 10 };
		array2 = new int[] { 3, 4, 5, 6 };
		specifyIndexesToMerge(array1, array2);

		array1 = new int[] { 1, 2 };
		array2 = new int[] { 3, 4, 5, 6, 9, 10 };
		specifyIndexesToMerge(array1, array2);

		array1 = new int[] { 5 };
		array2 = new int[] { 3, 4, 5, 6, 9, 10 };
		specifyIndexesToMerge(array1, array2);
	}

	public static void specifyIndexesToMerge(int[] array1, int[] array2) {
		if (!isCorrectSequences(array1) && !isCorrectSequences(array2)) {
			System.out.println("Sequence does not match!\n");
			return;
		}

		System.out.println("Array 1: " + Arrays.toString(array1));
		System.out.println("Array 2: " + Arrays.toString(array2));

		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				if (array2[i] < array1[j]) {
					System.out.println("The value " + array2[i] + " of the array2 must be put at the index " + j
							+ " of the array1");
					break;
				}
			}
		}

		if (array1.length - 1 < 1) {
			System.out.println("The remaining values ​​of the array2 must be placed at the end of the array1");
		}

		System.out.println();
	}

	public static boolean isCorrectSequences(int[] array) {
		if (array.length == 0) {
			return false;
		}

		if (array.length == 1) {
			return true;
		}

		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] > array[i]) {
				return false;
			}
		}

		return true;
	}
}
