package by.epam.module02.matrix;

import java.util.Objects;

/*
Сформировать квадратную матрицу порядка N по правилу: 
A[i, j] = sin(i^2 - j^2 / n), 
и подсчитать количество положительных элементов в ней.
*/

public class Matrix07 {

	public static void main(String[] args) {
		int n;
		double[][] matrix;

		n = 5;

		matrix = getSquareMatrix(n);

		printMatrix(matrix);

		countPositiveElements(matrix);
	}

	private static double[][] getSquareMatrix(int n) {
		if (n < 2) {
			System.out.println("n - does not match the condition");

			return null;
		}

		double value;
		double[][] matrix;

		matrix = new double[n][n];

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				value = (Math.pow(i, 2) - Math.pow(j, 2)) / n;
				matrix[i][j] = Math.sin(value);
			}
		}

		return matrix;
	}

	private static void printMatrix(double[][] matrix) {
		if (Objects.isNull(matrix)) {
			return;
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%5.2f ", matrix[i][j]);
			}

			System.out.println();
		}
	}

	private static void countPositiveElements(double[][] matrix) {
		if (Objects.isNull(matrix)) {
			return;
		}

		int count;

		count = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > 0) {
					count++;
				}
			}
		}

		System.out.println("Number of positive elements = " + count);
	}
}
