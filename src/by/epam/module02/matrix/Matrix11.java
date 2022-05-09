package by.epam.module02.matrix;

import java.util.Objects;

/*
Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в 
которых число 5 встречается три и более раз.
*/

public class Matrix11 {

	public static void main(String[] args) {
		int[][] matrix;

		matrix = getRandomMatrix10x20();

		printMatrix(matrix);

		findLineThatRepeatsANumbers5(matrix);
	}

	public static int[][] getRandomMatrix10x20() {
		int width;
		int height;
		int[][] matrix;

		width = 20;
		height = 10;

		matrix = new int[height][width];

		fillMatrixWithRandomValues(matrix);

		return matrix;
	}

	public static void fillMatrixWithRandomValues(int[][] matrix) {
		if (Objects.isNull(matrix)) {
			return;
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 15);
			}
		}
	}

	public static void printMatrix(int[][] matrix) {
		if (Objects.isNull(matrix)) {
			return;
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%2d ", matrix[i][j]);
			}

			System.out.println();
		}
	}

	public static void findLineThatRepeatsANumbers5(int[][] matrix) {
		if (Objects.isNull(matrix)) {
			return;
		}

		int count;
		int line;

		count = 0;
		line = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				if (matrix[i][j] == 5) {
					count++;
				}
			}

			if (count >= 3) {
				line = i + 1;
				System.out.println("Line #" + line + " matches the condition");
			}

			count = 0;
		}
	}
}
