package by.epam.module02.array;

import java.util.Arrays;

/*
В массиве целых чисел с количеством элементов  n  найти наиболее часто встречающееся число. 
Если таких чисел несколько, то определить наименьшее из них.
*/

public class Array09 {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		findRepaetNumberInArray(array);

		array = new int[] { 1, 2, 3, 4, 5, 6, 7, 2 };
		findRepaetNumberInArray(array);

		array = new int[] { 1, 2, 3, 4, 5, 5, 6, 6 };
		findRepaetNumberInArray(array);

		array = new int[] { 1, 1, 1, 1, 1, 5, 5, 5, 5 };
		findRepaetNumberInArray(array);
	}

	public static void findRepaetNumberInArray(int[] array) {
		int index1;
		int index2;
		int value1;
		int value2;
		int[] arrayOfRepeated = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			index1 = 0;

			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					index1++;
					arrayOfRepeated[i] = index1;
				}
			}
		}

		index1 = -1;
		index2 = -1;
		value1 = 0;
		value2 = 0;

		for (int i = 0; i < arrayOfRepeated.length; i++) {
			if (value1 < arrayOfRepeated[i]) {
				value1 = arrayOfRepeated[i];
				index1 = i;
				continue;
			}

			if (value1 != 0 && value1 == arrayOfRepeated[i]) {
				value2 = arrayOfRepeated[i];
				index2 = i;
			}
		}

		if (index1 < 0) {
			System.out.println("All numbers are unique in array: " + Arrays.toString(array));
			System.out.println();
			return;
		}

		if (index2 < 0) {
			System.out.println("In array: " + Arrays.toString(array));
			System.out.println("Max repeats for a number - " + array[index1]);
			System.out.println();
			return;
		}

		System.out.println("In array: " + Arrays.toString(array));
		System.out.printf("Numbers: %d, %d have the same number of repetitions\n", array[index1], array[index2]);

		if (arrayOfRepeated[value1] < arrayOfRepeated[value2]) {
			System.out.println("The least of them - " + array[index1]);
		} else {
			System.out.println("The least of them - " + array[index2]);
		}

		System.out.println();
	}
}
