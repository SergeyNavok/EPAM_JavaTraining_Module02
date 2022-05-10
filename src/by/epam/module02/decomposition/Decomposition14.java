package by.epam.module02.decomposition;

/*
Натуральное  число,  в  записи  которого  n  цифр,  называется  числом  Армстронга,  если  сумма  его  цифр, 
возведенная  в  степень  n,  равна  самому  числу.  Найти  все  числа  Армстронга  от  1  до  k.  Для  решения  задачи 
использовать декомпозицию.
*/

public class Decomposition14 {

	public static void main(String[] args) {
		int k;

		k = 5000;
		findArmstrongNumber(k);
	}

	private static void findArmstrongNumber(int k) {
		if (k < 1) {
			System.out.println("Wrong number!");
			return;
		}

		System.out.println("In the range from 1 to " + k);

		for (int i = 1; i < k; i++) {
			printArmstrongNumber(i);
		}
	}

	private static void printArmstrongNumber(int k) {
		int digit;
		int degree;
		int result;
		int value;

		degree = 0;
		result = 0;
		value = k;

		while (value != 0) {
			value /= 10;
			degree++;
		}

		value = k;

		while (value != 0) {
			digit = value % 10;
			result += Math.pow(digit, degree);
			value /= 10;
		}

		if (result == k) {
			System.out.println("Armstrong number - " + k);
		}
	}
}
