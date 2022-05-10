package by.epam.module02.decomposition;

/*
Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
*/

public class Decomposition11 {

	public static void main(String[] args) {
		double value1;
		double value2;

		value1 = 123;
		value2 = 123;
		comparewNmbers(value1, value2);

		value1 = 1.23;
		value2 = 12.3;
		comparewNmbers(value1, value2);

		value1 = 12345;
		value2 = 123;
		comparewNmbers(value1, value2);

		value1 = -123;
		value2 = 123.000;
		comparewNmbers(value1, value2);

	}

	private static void comparewNmbers(double value1, double value2) {
		int size1;
		int size2;

		size1 = countTheNumberOfDigits(value1);
		size2 = countTheNumberOfDigits(value2);

		if (size1 == size2) {
			System.out.println("Value1=" + value1 + ", value2=" + value2 + ", the same number of digits - " + size1);

			return;
		}

		if (size1 > size2) {
			System.out.println("Value1=" + value1 + ", value2=" + value2 + ", in value1 - " + size1 + " digits.");
		} else {
			System.out.println("Value1=" + value1 + ", value2=" + value2 + ", in value2 - " + size2 + " digits.");
		}
	}

	private static int countTheNumberOfDigits(double value) {
		int size;
		int temp;

		while (value % 1 != 0) {
			value *= 10;
		}

		size = 0;
		temp = (int) value;

		while (temp > 0) {
			temp /= 10;
			size++;
		}

		return size;
	}
}
