package by.epam.module02.matrix;

import java.util.Objects;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
[  1 ,  1 ,  1 , ...,  1 ,  1 ,  1 ]
[  2 ,  2 ,  2 , ...,  2 ,  2 ,  0 ]
[  3 ,  3 ,  3 , ...,  3 ,  0 ,  0 ]
[ ..., ..., ..., ..., ..., ..., ...]
[ n-1, n-1,  0 , ...,  0 ,  0 ,  0 ]
[  n ,  0 ,  0 , ...,  0 ,  0 ,  0 ]
*/

public class Matrix05 {

	public static void main(String[] args) {
		int n;
		int[][] matrix;

		n = 0;
		matrix = getSquareMatrix(n);
		printMatrix(matrix);

		n = 6;
		matrix = getSquareMatrix(n);
		printMatrix(matrix);
	}

	public static int[][] getSquareMatrix(int value) {
		if (value < 2 || value % 2 != 0) {
			System.out.println("Value does not match the condition!");

			return null;
		}

		int[][] matrix;

		matrix = new int[value][value];

		fillMatrixAccordingToCondition(matrix, value);

		return matrix;
	}

	public static void fillMatrixAccordingToCondition(int[][] matrix, int value) {
		int count;

		count = matrix[0].length;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (j < count) {
					matrix[i][j] = i + 1;
				}
			}

			count--;
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
}
