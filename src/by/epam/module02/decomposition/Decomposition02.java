package by.epam.module02.decomposition;

/*
Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
*/

public class Decomposition02 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;

		a = 1;
		b = 2;
		c = 3;
		d = 4;
		leastCommonDivisor(a, b, c, d);

		a = 0;
		b = 2;
		c = 3;
		d = 4;
		leastCommonDivisor(a, b, c, d);

		a = 2;
		b = 2;
		c = 2;
		d = 2;
		leastCommonDivisor(a, b, c, d);
	}

	private static boolean isDifferentNumber(int a, int b, int c, int d) {
		if (a != b || b != c || c != d) {
			return true;
		}

		return false;
	}

	private static boolean isCorrectNumber(int a, int b, int c, int d) {
		if (a == 0 || b == 0 || c == 0 || d == 0) {
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

	private static void leastCommonDivisor(int a, int b, int c, int d) {
		if (!isDifferentNumber(a, b, c, d)) {
			System.out.println("The numbers are the same!");

			return;
		}

		if (!isCorrectNumber(a, b, c, d)) {
			System.out.println("Among the numbers there is 0");

			return;
		}

		int result;
		int temp1;
		int temp2;

		temp1 = a * b / greatestCommonMultiple(a, b);
		temp2 = c * d / greatestCommonMultiple(c, d);
		result = temp1 * temp2 / greatestCommonMultiple(temp1, temp2);

		System.out.println("Least common multiple of number " + a + ", " + b + ", " + c + " and " + d + " = " + result);
	}
}
