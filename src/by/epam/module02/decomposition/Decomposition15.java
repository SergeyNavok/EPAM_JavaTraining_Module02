package by.epam.module02.decomposition;

/*
Найти  все  натуральные  n-значные  числа,  цифры  в  которых  образуют  строго  возрастающую 
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
*/

public class Decomposition15 {

	public static void main(String[] args) {
		int n;

		n = 0;
		findIncreasingSequence(n);

		n = 1;
		findIncreasingSequence(n);

		n = 3;
		findIncreasingSequence(n);
	}

	public static void findIncreasingSequence(int degree) {
		int start;
		int finish;

		if (degree < 1) {
			System.out.println("Wrong number!");
			return;
		}

		start = 1;

		for (int i = 1; i < degree; i++) {
			start *= 10;
		}

		finish = start * 10;

		for (int i = start; i < finish; i++) {
			printNumbersWithIncreasingDigits(i);
		}
	}

	public static void printNumbersWithIncreasingDigits(int number) {
		int temp1;
		int temp2;
		int value;

		temp1 = number % 10;
		value = number / 10;

		while (value != 0) {
			temp2 = value % 10;

			if (temp2 >= temp1) {
				return;
			}

			temp1 = temp2;
			value /= 10;
		}

		System.out.println(number);
	}
}
