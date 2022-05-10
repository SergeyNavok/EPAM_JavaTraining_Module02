package by.epam.module02.array;

/*
Даны действительные числа a1, a2, ..., an.
Найти max(a1 + a2n, a2 + a2n-1, ..., an + an+1).
*/

public class Array07 {

	public static void main(String[] args) {
		double[] array = new double[0];

		printMaxPairInArray(array);

		array = new double[] { 1, 2, 3 };
		printMaxPairInArray(array);

		array = new double[] { 1, 2, 3, 4, 5, 16, 7, 8, 9 };
		printMaxPairInArray(array);

		array = new double[] { 1, 2, 3, 4, 95, 6, 7, 8, 9 };
		printMaxPairInArray(array);
	}

	private static void printMaxPairInArray(double[] array) {
		int index;
		double oddValue;
		double maxValue;

		if (array.length < 4) {
			System.out.println("There are not enough pairs in the array!");
			return;
		}

		index = 0;
		oddValue = array[array.length / 2];
		maxValue = array[0] + array[array.length - 1];

		for (int i = 0; i < array.length / 2; i++) {
			if (maxValue < array[i] + array[array.length - i - 1]) {
				maxValue = array[i] + array[array.length - i - 1];
				index = i;
			}
		}

		if (oddValue > maxValue) {
			System.out.println("Max value - unpaired = " + oddValue);
			return;
		}

		System.out.println("Max value: " + array[index] + " + " + array[array.length - index - 1] + " = " + maxValue);
	}
}
