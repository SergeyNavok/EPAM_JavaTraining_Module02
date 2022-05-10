package by.epam.module02.sorting;

import java.util.Arrays;

/*
Сортировка вставками. Дана последовательность чисел a1, a2, ..., an. 
Требуется переставить числа в порядке возрастания. Делается  это  следующим  образом. 
Пусть a1, a2, ..., ai -  упорядоченная  последовательность, т. е. a1 <= a2 <= ... <= ai.  
Берется  следующее  число a(i + 1) и  вставляется  в  последовательность  так,  
чтобы  новая последовательность была тоже возрастающей. 
Процесс производится до тех пор, пока все элементы от i + 1 до n не будут перебраны. 
Примечание. Место помещения очередного элемента в отсортированную часть производить 
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
*/

public class Sorting05 {

	public static void main(String[] args) {
		int[] array = new int[0];
		sortingArray(array);

		array = new int[] { 1, 3, 5, 7, 9, 2, 8, 6, 4 };
		sortingArray(array);

		array = new int[] { 1, 2 };
		sortingArray(array);

		array = new int[] { 2, 1 };
		sortingArray(array);

		array = new int[] { 2, 2, 2, 1, 2, 2 };
		sortingArray(array);

		array = new int[] { 9, 8, 7, 6, 5, 2 };
		sortingArray(array);
	}

	private static void sortingArray(int[] array) {
		int indexToInsert;

		indexToInsert = 0;

		System.out.println("Array before: " + Arrays.toString(array));

		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] > array[i]) {
				indexToInsert = binarySearch(array, i);
				moveValueInArrayByIndex(array, i, indexToInsert);
			}
		}

		System.out.println("Array before: " + Arrays.toString(array));
		System.out.println();
	}

	private static int binarySearch(int[] array, int indexElement) {
		if (array[indexElement] < array[0]) {
			return 0;
		}

		int firstSearchIndex;
		int lastSearchIndex;
		int middleIndex;

		firstSearchIndex = 0;
		lastSearchIndex = indexElement;
		middleIndex = (firstSearchIndex + lastSearchIndex) / 2;

		while (lastSearchIndex - firstSearchIndex > 1) {
			middleIndex = (firstSearchIndex + lastSearchIndex) / 2;

			if (array[indexElement] > array[middleIndex]) {
				firstSearchIndex = middleIndex;
			} else {
				lastSearchIndex = middleIndex;
			}
		}

		return middleIndex;
	}

	private static void moveValueInArrayByIndex(int[] array, int indexElement, int indexToInsert) {
		int tempValue;

		tempValue = array[indexElement];

		for (int i = indexElement; i > indexToInsert; i--) {
			array[i] = array[i - 1];
		}

		array[indexToInsert] = tempValue;
	}
}
