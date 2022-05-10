package by.epam.module02.decomposition;

/*
Из заданного числа вычли сумму его  цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких 
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
*/

public class Decomposition17 {

	public static void main(String[] args) {
		int number;

		number = 153;
		subtractSumOfNumbers(number);

		number = -13;
		subtractSumOfNumbers(number);
	}

	private static void subtractSumOfNumbers(int number) {
		int counter;
		int value;
		int sumOfDigits;

		counter = 0;
		value = Math.abs(number);
		sumOfDigits = getSumOfDigitsOfNumber(value);

		while (value > 0) {
			value -= sumOfDigits;
			counter++;
		}

		System.out.println("From the number " + number + " it is necessary to subtract the sum of its numbers "
				+ sumOfDigits + " until you get '0' - " + counter + " times");
	}

	private static int getSumOfDigitsOfNumber(int number) {
		int result;

		result = 0;

		while (number != 0) {
			result += number % 10;
			number /= 10;
		}

		return result;
	}
}
