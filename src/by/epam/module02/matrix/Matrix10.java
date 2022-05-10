package by.epam.module02.matrix;

import java.util.Objects;

/*
Найти положительные элементы главной диагонали квадратной матрицы.
*/

public class Matrix10 {

	public static void main(String[] args) {
		int size;
		int[][] matrix;

		size = 7;

		matrix = getRandomMatrix(size);

		printMatrix(matrix);

		findPositiveDiagonalElements(matrix);
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

		int min;
		int max;

		min = -9;
		max = 9;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = min + (int) (Math.random() * ((max - min) + 1));
			}
		}
	}

	private static void printMatrix(int[][] matrix) {
		if (Objects.isNull(matrix)) {
			return;
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%3d ", matrix[i][j]);
			}

			System.out.println();
		}

		System.out.println();
	}

	private static void findPositiveDiagonalElements(int[][] matrix) {
		if (!isSquareMatrix(matrix)) {
			System.out.println("Matrix is not square!");

			return;
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				if (i == j && matrix[i][j] > 0) {
					System.out.print(matrix[i][j] + " ");
				} else {
					System.out.print("- ");
				}
			}

			System.out.println();
		}
	}

	private static boolean isSquareMatrix(int[][] matrix) {
		if (Objects.isNull(matrix)) {
			return false;
		}

		for (int i = 0; i < matrix.length; i++) {
			if (matrix.length != matrix[i].length) {
				return false;
			}
		}

		return true;
	}
}
