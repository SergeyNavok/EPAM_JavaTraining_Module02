package by.epam.module02.decomposition;

/*
Написать  программу,  определяющую  сумму  n  -  значных  чисел,  содержащих  только  нечетные  цифры. 
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
*/

public class Decomposition16 {

	public static void main(String[] args) {
		int n;

		n = 0;
		printSumOfNumber(n);

		n = -15;
		printSumOfNumber(n);

		n = 123456;
		printSumOfNumber(n);
	}

	public static void printSumOfNumber(int number) {
		int sumOfOdd;
		int numberOfEven;

		sumOfOdd = getSumOfOddDigitsInNumber(number);
		numberOfEven = getNumberOfEvenNumbers(sumOfOdd);

		System.out.println("The sum of the odd digits in " + number + " is " + sumOfOdd
				+ ", of which are even numbers - " + numberOfEven);
	}

	public static int getSumOfOddDigitsInNumber(int number) {
		int digit;
		int sum;

		sum = 0;
		number = Math.abs(number);

		while (number != 0) {
			digit = number % 10;

			if (digit % 2 != 0) {
				sum += digit;
			}

			number /= 10;
		}

		return sum;
	}

	public static int getNumberOfEvenNumbers(int number) {
		int digit;
		int result;

		result = 0;

		while (number != 0) {
			digit = number % 10;

			if (digit % 2 != 0) {
				return 0;
			}

			result++;
			number /= 10;
		}

		return result;
	}
}
