package by.epam.module02.array;

/*
Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
*/

public class Array05 {

	public static void main(String[] args) {
		int[] array = new int[] { 4, 3, 2, 1, 0, 6, 8, 9 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] > i) {
				System.out.println("array[i]=" + array[i] + " > i=" + i);
			}
		}
	}
}
