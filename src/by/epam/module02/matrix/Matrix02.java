package by.epam.module02.matrix;

import java.util.Objects;

/*
Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
*/

public class Matrix02 {

	public static void main(String[] args) {
		int width;
		int height;
		int[][] matrix;

		width = 7;
		height = 6;
		matrix = new int[height][width];

		fillWithRandomPositiveValues(matrix);

		printMatrix(matrix);

		System.out.println();

		printDiagonalElements(matrix);
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
				System.out.printf(matrix[i][j] + " ");
			}

			System.out.println();
		}
	}

	public static void printDiagonalElements(int[][] matrix) {
		if (Objects.isNull(matrix)) {
			return;
		}

		int line;
		int column;
		int count;

		line = matrix.length;
		column = matrix[0].length;

		if (!isSquareMatrix(matrix)) {
			System.out.println("Print will be made with an equal aspect ratio.");

			line = line > column ? column : line;
			column = line < column ? line : column;
		}

		count = line - 1;

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < column; j++) {
				if (j == i || j == count) {
					System.out.print(matrix[i][j] + " ");
				} else {
					System.out.print("- ");
				}
			}

			count--;
			System.out.println();
		}
	}

	public static boolean isSquareMatrix(int[][] matrix) {
		if (Objects.isNull(matrix)) {
			return false;
		}

		int line;
		int column;

		line = matrix.length;
		column = matrix[0].length;

		if (line == column) {
			return true;
		}

		return false;
	}
}
