package by.epam.module02.matrix;

import java.util.Objects;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
[  1 ,  2 ,  3 , ...,  n  ]
[  n , n-1, n-2, ...,  1  ]
[  1 ,  2 ,  3 , ...,  n  ]
[  n , n-1, n-2, ...,  1  ]
[ ..., ..., ..., ..., ... ]
[  n , n-1, n-2, ...,  1  ]
*/

public class Matrix04 {

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

	private static int[][] getSquareMatrix(int value) {
		if (value < 2 || value % 2 != 0) {
			System.out.println("Value does not match the condition!");
			System.out.println();

			return null;
		}

		int[][] matrix;

		matrix = new int[value][value];

		fillMatrixAccordingToCondition(matrix, value);

		return matrix;
	}

	private static void fillMatrixAccordingToCondition(int[][] matrix, int value) {
		if (Objects.isNull(matrix)) {
			return;
		}

		int firstValue;
		int lastValue;

		for (int i = 0; i < matrix.length; i++) {
			firstValue = 1;
			lastValue = value;

			for (int j = 0; j < matrix[i].length; j++) {
				if (i % 2 == 0) {
					matrix[i][j] = firstValue;
					firstValue++;
				} else {
					matrix[i][j] = lastValue;
					lastValue--;
				}
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
}
