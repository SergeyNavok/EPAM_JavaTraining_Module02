package by.epam.module02.matrix;

import java.util.Objects;

/*
Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
*/

public class Matrix13 {

	public static void main(String[] args) {
		int size;
		int[][] matrix;

		size = 7;

		matrix = getRandomMatrix(size);

		printMatrix(matrix);

		System.out.println();
		System.out.println("Sort values in a column in ascending order");
		sortMatrixColumnValuesInAscendingOrder(matrix);
		printMatrix(matrix);

		System.out.println();
		System.out.println("Sort values in a column in descending order");
		sortMatrixColumnValuesInDescendingOrder(matrix);
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

	private static void sortMatrixColumnValuesInAscendingOrder(int[][] matrix) {
		if (Objects.isNull(matrix)) {
			return;
		}

		if (matrix.length < 1 || matrix[0].length < 1) {
			return;
		}

		int temp;

		temp = 0;

		for (int column = 0; column < matrix[0].length; column++) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = i + 1; j < matrix.length; j++) {

					if (matrix[i][column] > matrix[j][column]) {
						temp = matrix[i][column];
						matrix[i][column] = matrix[j][column];
						matrix[j][column] = temp;
					}
				}
			}
		}
	}

	private static void sortMatrixColumnValuesInDescendingOrder(int[][] matrix) {
		if (Objects.isNull(matrix)) {
			return;
		}

		if (matrix.length < 1 || matrix[0].length < 1) {
			return;
		}

		int temp;

		temp = 0;

		for (int column = 0; column < matrix[0].length; column++) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = i + 1; j < matrix.length; j++) {

					if (matrix[i][column] < matrix[j][column]) {
						temp = matrix[i][column];
						matrix[i][column] = matrix[j][column];
						matrix[j][column] = temp;
					}
				}
			}
		}
	}
}
