package by.epam.module02.sorting;

import java.util.Arrays;

/*
Сортировка выбором. Дана последовательность чисел a1 < a2 < ... < an. 
Требуется переставить элементы так, чтобы они были расположены по убыванию. 
Для этого в массиве, начиная с первого, выбирается наибольший элемент и 
ставится на первое место, а первый - на место наибольшего. 
Затем, начиная со второго, эта процедура повторяется. 
Написать алгоритм сортировки выбором.
*/

public class Sorting03 {

	public static void main(String[] args) {
		int valueMax;
		int valueTemp;
		int index;
		int[] array = new int[] { 2, 1, 9, 3, 8, 4, 5, 6, 7 };

		index = 0;

		System.out.println("Arrays before: " + Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			valueMax = array[i];

			for (int j = i + 1; j < array.length; j++) {
				if (valueMax < array[j]) {
					valueMax = array[j];
					index = j;
				}
			}

			if (valueMax != array[i]) {
				valueTemp = array[i];
				array[i] = valueMax;
				array[index] = valueTemp;
			}
		}

		System.out.println("Arrays after: " + Arrays.toString(array));
	}
}