package by.epam.module02.array;

import java.util.Arrays;

/*
Дан  целочисленный  массив  с  количеством  элементов  п.  Сжать  массив,  выбросив  из  него  каждый  второй 
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
*/

public class Array10 {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 1; i < array.length; i += 2) {
			array[i] = 0;
		}

		System.out.println("New array: " + Arrays.toString(array));
	}
}
