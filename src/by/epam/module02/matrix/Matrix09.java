package by.epam.module02.matrix;

import java.util.Objects;

/*
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой 
столбец содержит максимальную сумму.
*/

public class Matrix09 {

	public static void main(String[] args) {
		int size;
		int[][] matrix;

		size = 4;

		matrix = getRandomMatrix(size);

		printMatrix(matrix);

		findMaxSumInColumn(matrix);
	}

	public static int[][] getRandomMatrix(int value) {
		if (value < 2) {
			System.out.println("Matrix size cannot be less than 2!");

			return null;
		}

		int[][] matrix;

		matrix = new int[value][value];

		fillMatrixWithPositiveValues(matrix);

		return matrix;
	}

	public static void fillMatrixWithPositiveValues(int[][] matrix) {
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

	public static void findMaxSumInColumn(int[][] matrix) {
		if (Objects.isNull(matrix)) {
			return;
		}

		int sum;
		int sumMax;
		int column;

		sum = getSumInColumn(matrix, 0);
		sumMax = 0;
		column = 1;

		for (int i = 1; i < matrix[0].length; i++) {
			sum = getSumInColumn(matrix, i);

			if (sumMax < sum) {
				sumMax = sum;
				column = i + 1;
			}

			sum = 0;
		}

		System.out.println("MAX SUM = " + sumMax + " IN COLUMN - " + column);
	}

	public static int getSumInColumn(int[][] matrix, int column) {
		if (Objects.isNull(matrix)) {
			return 0;
		}

		int sum;

		sum = 0;

		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][column];
		}

		return sum;
	}
}
