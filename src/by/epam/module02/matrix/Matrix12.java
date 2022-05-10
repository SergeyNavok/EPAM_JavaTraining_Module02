package by.epam.module02.matrix;

import java.util.Objects;

/*
Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
*/

public class Matrix12 {

	public static void main(String[] args) {
		int size;
		int[][] matrix;

		size = 7;

		matrix = getRandomMatrix(size);

		System.out.println("Default matrix:");
		printMatrix(matrix);

		System.out.println();
		System.out.println("Sort values in a rows in ascending order:");
		sortMatrixRowValuesInAscendingOrder(matrix);
		printMatrix(matrix);

		System.out.println();
		System.out.println("Sort values in a rows in descending order:");
		sortMatrixRowValuesInDescendingOrder(matrix);
		printMatrix(matrix);
	}

	private static int[][] getRandomMatrix(int value) {
		if (value < 2) {
			System.out.println("Matrix size cannot be less than 2!");

			return null;
		}

		int[][] matrix;

		matrix = new int[value][value];

		fillMatrixWithRandomValues(matrix);

		return matrix;
	}

	private static void fillMatrixWithRandomValues(int[][] matrix) {
		if (Objects.isNull(matrix)) {
			return;
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 9);
			}
		}
	}

	private static void printMatrix(int[][] matrix) {
		if (Objects.isNull(matrix)) {
			return;
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}
	}

	private static void sortMatrixRowValuesInAscendingOrder(int[][] matrix) {
		if (Objects.isNull(matrix)) {
			return;
		}

		if (matrix.length < 1 || matrix[0].length < 1) {
			return;
		}

		int temp;

		temp = 0;

		for (int line = 0; line < matrix.length; line++) {
			for (int i = 0; i < matrix[line].length; i++) {
				for (int j = 0; j < matrix[line].length - 1; j++) {

					if (matrix[i][j] > matrix[i][j + 1]) {
						temp = matrix[i][j];
						matrix[i][j] = matrix[i][j + 1];
						matrix[i][j + 1] = temp;
					}
				}
			}
		}
	}

	private static void sortMatrixRowValuesInDescendingOrder(int[][] matrix) {
		if (Objects.isNull(matrix)) {
			return;
		}

		if (matrix.length < 1 || matrix[0].length < 1) {
			return;
		}

		int temp;

		temp = 0;

		for (int line = 0; line < matrix.length; line++) {
			for (int i = 0; i < matrix[line].length; i++) {
				for (int j = 0; j < matrix[line].length - 1; j++) {

					if (matrix[i][j] < matrix[i][j + 1]) {
						temp = matrix[i][j];
						matrix[i][j] = matrix[i][j + 1];
						matrix[i][j + 1] = temp;
					}
				}
			}
		}
	}
}
