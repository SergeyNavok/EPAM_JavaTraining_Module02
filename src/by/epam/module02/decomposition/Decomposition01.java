package by.epam.module02.decomposition;

/*
Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух 
натуральных чисел:
НОК (А, В) = А * В / НОД (А, В).
*/

public class Decomposition01 {

	public static void main(String[] args) {
		int a;
		int b;

		a = 1;
		b = 5;
		leastCommonDivisor(a, b);

		a = 9;
		b = 17;
		leastCommonDivisor(a, b);

		a = 0;
		b = 100;
		leastCommonDivisor(a, b);

		a = 2;
		b = 2;
		leastCommonDivisor(a, b);
	}

	private static boolean isDifferentNumber(int a, int b) {
		if (a != b) {
			return true;
		}

		return false;
	}

	private static boolean isCorrectNumber(int a, int b) {
		if (a == 0 || b == 0) {
			return false;
		}

		return true;
	}

	private static int greatestCommonMultiple(int a, int b) {
		int temp;

		while (b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}

	private static void leastCommonDivisor(int a, int b) {
		if (!isDifferentNumber(a, b)) {
			System.out.println("The numbers are the same!");

			return;
		}

		if (!isCorrectNumber(a, b)) {
			System.out.println("Among the numbers there is 0");

			return;
		}

		int result;

		result = a * b / greatestCommonMultiple(a, b);

		System.out.println("Least common multiple of number " + a + " and " + b + " = " + result);
	}
}
