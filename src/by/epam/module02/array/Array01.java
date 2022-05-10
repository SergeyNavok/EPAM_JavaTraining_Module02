package by.epam.module02.array;

/*
В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
*/

public class Array01 {

	public static void main(String[] args) {
		int number;
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		number = 3;
		findSum(array, number);

		number = 0;
		findSum(array, number);

		number = -5;
		findSum(array, number);
	}

	private static void findSum(int[] array, int number) {
		int sum;

		sum = 0;

		if (number <= 0) {
			System.out.println("In the array only natural numbers!");

			return;
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] % number == 0) {
				sum += array[i];
			}
		}

		System.out.println("Sum of elements that are multiples of " + number + " = " + sum);
	}
}
