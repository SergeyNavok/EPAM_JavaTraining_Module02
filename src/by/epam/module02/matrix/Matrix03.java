package by.epam.module02.matrix;

import java.util.Objects;

/*
Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
*/

public class Matrix03 {

	public static void main(String[] args) {
		int line;
		int column;
		int width;
		int height;
		int[][] matrix;

		width = 5;
		height = 4;
		matrix = new int[height][width];

		fillWithRandomPositiveValues(matrix);

		printMatrix(matrix);

		System.out.println();

		line = 0;
		printLine(matrix, line);

		column = -1;
		printColumn(matrix, column);

		line = 2;
		printLine(matrix, line);

		column = 2;
		printColumn(matrix, column);
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

	public static void printLine(int[][] matrix, int value) {
		if (Objects.isNull(matrix)) {
			return;
		}

		int line;

		line = value - 1;

		if (line < 0 || line > matrix.length) {
			System.out.println("Line " + value + " is not in the matrix!");
			System.out.println();

			return;
		}

		for (int i = 0; i < matrix[0].length; i++) {
			System.out.print(matrix[line][i] + " ");
		}

		System.out.println();
		System.out.println();
	}

	public static void printColumn(int[][] matrix, int value) {
		if (Objects.isNull(matrix)) {
			return;
		}

		int column;

		column = value - 1;

		if (column < 0 || column > matrix[0].length) {
			System.out.println("Column " + value + " is not in the matrix!");
			System.out.println();

			return;
		}

		for (int i = 0; i < matrix.length; i++) {
			System.out.println(matrix[i][column]);
		}
	}
}
