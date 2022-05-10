package by.epam.module02.array;

/*
Задана  последовательность  N  вещественных  чисел.  
Вычислить  сумму  чисел,  порядковые  номера  которых являются простыми числами.
*/

public class Array06 {

	public static void main(String[] args) {
		double[] array = new double[0];

		printSumPrimeNumber(array);

		array = new double[] { 1.1 };
		printSumPrimeNumber(array);

		array = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		printSumPrimeNumber(array);
	}

	private static void printSumPrimeNumber(double[] array) {
		int elemArray;
		int firstPrimeNumber;
		double sumPrimeNumber;

		firstPrimeNumber = 2;
		sumPrimeNumber = 0;

		for (int i = 1; i < array.length; i++) {
			if (i < firstPrimeNumber) {
				continue;
			}

			elemArray = i + 1;

			if (isPrimeNumber(elemArray)) {
				sumPrimeNumber += array[i];
			}
		}

		System.out.println("The sum of prime numbers of ordinal numbers of elements = " + sumPrimeNumber);
	}

	private static boolean isPrimeNumber(int a) {
		int firstPrimeNumber;

		firstPrimeNumber = 2;

		for (int i = firstPrimeNumber; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}

		return true;
	}
}
