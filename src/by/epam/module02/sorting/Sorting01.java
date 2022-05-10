package by.epam.module02.sorting;

import java.util.Arrays;

/*
Заданы два одномерных массива с различным количеством элементов и натуральное число k. 
Объединить их в один  массив,  включив  второй  массив  между  k-м  и  (k+1)-м  элементами  первого,  
при  этом  не  используя дополнительный массив.
*/

public class Sorting01 {

	public static void main(String[] args) {
		int indexToReplace;
		int[] array1 = new int[1];
		int[] array2 = new int[1];

		indexToReplace = 3;
		concatenateArraysAtIndex(indexToReplace, array1, array2);

		indexToReplace = 1;
		array1 = new int[] { 1, 1 };
		array2 = new int[] { 2, 2 };
		concatenateArraysAtIndex(indexToReplace, array1, array2);

		indexToReplace = 3;
		array1 = new int[] { 1, 1, 1, 1, 1, 1, 1 };
		array2 = new int[] { 2, 2, 2, 2, 2, 2, 2 };
		concatenateArraysAtIndex(indexToReplace, array1, array2);
	}

	private static void concatenateArraysAtIndex(int indexToReplace, int[] array1, int[] array2) {
		if (array1.length < indexToReplace) {
			System.out.println("The first array has less than " + indexToReplace + " elements!\n");
			return;
		}

		int indexResultArray;

		indexResultArray = array1.length + array2.length;

		int[] resultArray = new int[indexResultArray];

		indexResultArray = 0;

		for (int i = 0; i < array1.length; i++) {
			if (indexResultArray != indexToReplace) {
				resultArray[indexResultArray] = array1[i];
				indexResultArray++;
				continue;
			}

			for (int j = 0; j < array2.length; j++) {
				resultArray[indexResultArray] = array2[j];
				indexResultArray++;
			}

			i--;
		}

		System.out.println("Array1: " + Arrays.toString(array1));
		System.out.println("Array2: " + Arrays.toString(array2));
		System.out.println("Result array: " + Arrays.toString(resultArray));
		System.out.println();
	}
}
