package by.epam.module02.decomposition;

import java.util.Arrays;

/*
Даны  натуральные числа К  и  N.  Написать метод(методы)  формирования массива  А, элементами  которого 
являются числа, сумма цифр которых равна К и которые не большее N.
*/

public class Decomposition12 {

	public static void main(String[] args) {
		int k;
		int n;

		k = 13;
		n = 5;
		generateArray(k, n);

		k = 10;
		n = 0;
		generateArray(k, n);

		k = 100;
		n = 17;
		generateArray(k, n);

		k = 100;
		n = 200;
		generateArray(k, n);
	}

	private static void generateArray(int k, int n) {
		int size;
		int value;
		int[] array;

		if (k < 1 || n < 1) {
			System.out.println("Numbers are not natural!");
			return;
		}

		if (n >= k) {
			array = new int[] { k };
			System.out.println("Array: " + Arrays.toString(array) + ", k = " + k + ", n = " + n);
			return;
		}

		value = k;
		size = getSize(value, n);
		array = new int[size];

		for (int i = 0; i < array.length; i++) {
			if (value > n) {
				value -= n;
				array[i] = n;
			} else {
				array[i] = value;
			}
		}

		System.out.println("Array: " + Arrays.toString(array) + ", k = " + k + ", n = " + n);
	}

	private static int getSize(int k, int n) {
		int size;

		size = k / n;

		if (k % n != 0) {
			size++;
			return size;
		}

		return size;
	}
}
