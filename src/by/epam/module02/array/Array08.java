package by.epam.module02.array;

import java.util.Arrays;

/*
Дана  последовательность  целых  чисел a1, a2, ..., an. 
Образовать  новую  последовательность,  выбросив  из исходной те члены, которые равны
min(a1, a2, ..., an).
*/

public class Array08 {

	public static void main(String[] args) {
		int[] array = new int[1];

		getNewArray(array);

		array = new int[1];
		getNewArray(array);

		array = new int[2];
		getNewArray(array);

		array = new int[] { 1, 1 };
		getNewArray(array);

		array = new int[] { 1, 2 };
		getNewArray(array);

		array = new int[] { 1, 2, 1, 3, 1, 1, 1, 1, 4, 1, 5, 1, 6, 1, 7, 1 };
		getNewArray(array);
	}

	private static void getNewArray(int[] array) {
		int minValue;
		int index;

		if (array.length < 2) {
			System.out.println("Wrong array!");
			System.out.println();

			return;
		}

		index = 0;
		minValue = array[0];

		for (int i = 1; i < array.length; i++) {
			if (minValue > array[i]) {
				minValue = array[i];
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] == minValue) {
				index++;
			}
		}

		int[] arrayCopy = new int[array.length - index];
		index = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != minValue) {
				arrayCopy[index] = array[i];
				index++;
			}
		}

		System.out.println("Default Array: " + Arrays.toString(array));
		System.out.println("New array: " + Arrays.toString(arrayCopy));
		System.out.println();
	}
}
