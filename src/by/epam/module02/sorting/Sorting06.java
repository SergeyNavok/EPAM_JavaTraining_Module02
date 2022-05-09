package by.epam.module02.sorting;

import java.util.Arrays;

/*
Сортировка  Шелла.  Дан  массив  n  действительных  чисел.  Требуется  упорядочить  его  по  возрастанию. 
Делается это следующим образом: сравниваются два соседних элемента ai и a(i + 1). Если ai <= a(i + 1), 
то продвигаются на  один  элемент  вперед.  Если ai > a(i + 1), то  производится  перестановка  и 
сдвигаются  на  один  элемент  назад. Составить алгоритм этой сортировки.
*/

public class Sorting06 {

	public static void main(String[] args) {
		int i;
		double tempValue;
		double[] array = new double[] { 1.4, 1.3, 1.2, 1.1, 1.0, 1.9 };

		i = 0;
		tempValue = 0;

		System.out.println("Array before: " + Arrays.toString(array));

		while (i < array.length - 1) {
			if (array[i] > array[i + 1]) {
				tempValue = array[i + 1];
				array[i + 1] = array[i];
				array[i] = tempValue;

				if (i != 0) {
					i--;
				}
			} else {
				if (i != array.length - 1) {
					i++;
				}
			}
		}

		System.out.println("Array after: " + Arrays.toString(array));
	}
}