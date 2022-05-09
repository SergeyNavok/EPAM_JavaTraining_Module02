package by.epam.module02.matrix;

import java.util.Objects;

/*
Магическим квадратом порядка n называется квадратная матрица размера n x n, составленная из чисел 1, 2, 3, 
..., n^2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между 
собой. Построить такой квадрат. Пример магического квадрата порядка 3: 
6 1 8
7 5 3
2 9 4
*/

public class Matrix16 {

	public static void main(String[] args) {
		int size;
		int[][] matrix;

		size = -1;
		matrix = getMagicSquare(size);
		printMatrix(matrix);

		size = 2;
		matrix = getMagicSquare(size);
		printMatrix(matrix);

		size = 3;
		matrix = getMagicSquare(size);
		printMatrix(matrix);

		size = 4;
		matrix = getMagicSquare(size);
		printMatrix(matrix);

		size = 9;
		matrix = getMagicSquare(size);
		printMatrix(matrix);
	}

	public static void printMatrix(int[][] matrix) {
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

	public static int[][] getMagicSquare(int value) {
		if (value < 3) {
			System.out.println("Eincorrect magic square dimension!");

			return null;
		}

		int[][] magicSquare;

		if (value % 2 == 0) {
			magicSquare = magicSquareOfEvenOrder(value);
		} else {
			magicSquare = magicSquareOfOddOrder(value);
		}

		return magicSquare;
	}

	public static int[][] magicSquareOfEvenOrder(int value) {
		int count1;
		int count2;
		int[][] matrix;

		count1 = 1;
		count2 = value * value;
		matrix = new int[value][value];

		for (int i = 0; i < value; i++) {
			for (int j = 0; j < value; j++) {

				if (i % 4 == j % 4 || (i + j) % 4 == 3) {
					matrix[i][j] = count2;
				} else {
					matrix[i][j] = count1;
				}

				count2--;
				count1++;
			}
		}

		return matrix;
	}

	public static int[][] magicSquareOfOddOrder(int value) {
		int i;
		int j;
		int[][] matrix;

		i = 0;
		j = value / 2;
		matrix = new int[value][value];

		for (int count = 1; count <= value * value; count++) {
			matrix[i][j] = count;

			if (count % value == 0) {
				i++;
			} else {
				i--;
				j++;

				if (i < 0) {
					i = value - 1;
				}

				if (j > value - 1) {
					j = 0;
				}
			}
		}

		return matrix;
	}
}
