package by.epam.module02.array;

/*
Дан  массив  действительных  чисел,  размерность  которого  N.  
Подсчитать,  сколько  в  нем  отрицательных, положительных и нулевых элементов.
*/

public class Array03 {

	public static void main(String[] args) {
		int positiveNumber;
		int negativeNumber;
		int zeroNumber;
		double[] array = new double[] { 1.1, 2.2, -3.3, 4.4, 5.5, 6.6, -7.7, 8.8, 9.9, 0 };

		positiveNumber = 0;
		negativeNumber = 0;
		zeroNumber = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				positiveNumber++;
			}

			if (array[i] < 0) {
				negativeNumber++;
			}

			if (array[i] == 0) {
				zeroNumber++;
			}
		}

		System.out.println("Positive numbers in an array = " + positiveNumber);
		System.out.println("Negative numbers in an array = " + negativeNumber);
		System.out.println("Zero numbers in an array = " + zeroNumber);
	}
}
