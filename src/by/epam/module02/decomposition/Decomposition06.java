package by.epam.module02.decomposition;

/*
Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
*/

public class Decomposition06 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;

		a = 2;
		b = 3;
		c = 5;
		checkNumbers(a, b, c);

		a = 0;
		b = 2;
		c = 5;
		checkNumbers(a, b, c);

		a = 2;
		b = 2;
		c = 2;
		checkNumbers(a, b, c);
	}

	private static void checkNumbers(int a, int b, int c) {
		if (!isDifferentNumbers(a, b, c)) {
			System.out.println("All numbers (" + a + ", " + b + ", " + c + ") are the same!");

			return;
		}

		double value1;
		double value2;

		value1 = greatestCommonMultiple(a, b);
		value2 = greatestCommonMultiple(b, c);

		if (value1 == 1 && value2 == 1) {
			System.out.println("All three numbers (" + a + ", " + b + ", " + c + ") are coprime.");
		} else {
			System.out.println("Numbers (" + a + ", " + b + ", " + c + ") are not coprime.");
		}
	}

	private static boolean isDifferentNumbers(int a, int b, int c) {
		if (a != b && b != c) {
			return true;
		}

		return false;
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
}
