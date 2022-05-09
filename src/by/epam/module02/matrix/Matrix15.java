package by.epam.module02.matrix;

import java.util.Objects;

/*
Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
*/

public class Matrix15 {

	public static void main(String[] args) {
		int size;
		int[][] matrix;

		size = 7;

		matrix = getRandomMatrix(size);

		printMatrix(matrix);

		replaceOddValues​WithLargestValue(matrix);

		printMatrix(matrix);
	}

	public static int[][] getRandomMatrix(int value) {
		if (value < 2) {
			System.out.println("Matrix size cannot be less than 2!");

			return null;
		}

		int[][] matrix;

		matrix = new int[value][value];

		fillMatrixWithRandomValues(matrix);

		return matrix;
	}

	public static void fillMatrixWithRandomValues(int[][] matrix) {
		if (Objects.isNull(matrix)) {
			return;
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 9);
			}
		}
	}

	public static void printMatrix(int[][] matrix) {
		if (Objects.isNull(matrix)) {
			return;
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}

		System.out.println();
	}

	public static void replaceOddValues​WithLargestValue(int[][] matrix) {
		if (Objects.isNull(matrix)) {
			return;
		}

		int value;

		value = findMaxValue(matrix);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				if (matrix[i][j] % 2 != 0) {
					matrix[i][j] = value;
				}
			}
		}
	}

	public static int findMaxValue(int[][] matrix) {
		if (Objects.isNull(matrix)) {
			return 0;
		}

		int maxValue;

		maxValue = matrix[0][0];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				if (maxValue < matrix[i][j]) {
					maxValue = matrix[i][j];
				}
			}
		}

		return maxValue;
	}
}
