package by.epam.module02.decomposition;

import java.util.Arrays;

/*
Дано  натуральное  число  N.  Написать  метод(методы)  для  формирования  массива,  элементами  которого 
являются цифры числа N.
*/

public class Decomposition10 {

	public static void main(String[] args) {
		int size;
		int value;

		size = -1;
		value = 1;
		createNewArray(size, value);

		size = 0;
		value = 1;
		createNewArray(size, value);

		size = 5;
		value = 1;
		createNewArray(size, value);
	}

	private static void createNewArray(int size, int value) {
		if (size < 1) {
			System.out.println("Wrong array size!");

			return;
		}

		int[] array = new int[size];

		for (int i = 0; i < array.length; i++) {
			array[i] = value;
		}

		System.out.println("Size = " + size + ", value = " + value + ", array: " + Arrays.toString(array));
	}
}
