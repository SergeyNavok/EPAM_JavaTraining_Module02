package by.epam.module02.sorting;

import java.util.Arrays;

/*
Сортировка  обменами. Дана последовательность чисел a1 < a2 < ... < an. 
Требуется  переставить  числа  в порядке  возрастания.  
Для  этого  сравниваются  два  соседних  числа ai + a(i + 1). Если ai > a(i + 1), 
то делается перестановка. Так продолжается до тех пор, пока все элементы не станут 
расположены в порядке возрастания. 
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
*/

public class Sorting04 {

	public static void main(String[] args) {
		int value;
		int counter;
		int[] array = new int[] { 2, 1, 9, 3, 6, 4 };

		counter = 0;

		System.out.println("Array before: " + Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					value = array[i];
					array[i] = array[j];
					array[j] = value;
					counter++;
				}
			}
		}

		System.out.println("Array after: " + Arrays.toString(array));
		System.out.println("Number of permutations: " + counter);
	}
}
