package by.epam.module02.matrix;

import java.util.Objects;

/*
Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
*/

public class Matrix01 {

	public static void main(String[] args) {
		int width;
		int height;
		int[][] matrix;

		width = 7;
		height = 5;
		matrix = new int[height][width];

		fillWithRandomPositiveValues(matrix);

		printMatrix(matrix);

		System.out.println();

		printColumnsMatchingCondition(matrix);
	}

	public static void fillWithRandomPositiveValues(int[][] matrix) {
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
	}

	public static void printColumnsMatchingCondition(int[][] matrix) {
		if (Objects.isNull(matrix)) {
			return;
		}

		int firstIndex;
		int lastIndex;

		firstIndex = 0;
		lastIndex = matrix.length - 1;

		for (int i = 0; i < matrix[0].length; i += 2) {
			if (matrix[firstIndex][i] > matrix[lastIndex][i]) {
				printColumn(matrix, i);
			}
		}
	}

	public static void printColumn(int[][] matrix, int column) {
		if (Objects.isNull(matrix)) {
			return;
		}

		for (int i = 0; i < matrix.length; i++) {
			System.out.println(matrix[i][column]);
		}
		System.out.println();
	}
}
