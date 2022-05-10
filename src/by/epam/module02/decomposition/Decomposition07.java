package by.epam.module02.decomposition;

/*
Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
*/

public class Decomposition07 {

	public static void main(String[] args) {
		long sum;

		sum = 0;

		for (int i = 1; i <= 9; i += 2) {
			sum += getFactorial(i);
		}

		System.out.println("Sum of odd factorials from 1 to 9 = " + sum);
	}

	private static long getFactorial(int a) {
		long result;

		result = 1;

		for (int i = 1; i <= a; i++) {
			result = result * i;
		}

		return result;
	}
}
