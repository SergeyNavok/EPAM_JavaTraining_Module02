package by.epam.module02.matrix;

import java.util.Objects;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
[  1 ,  1 ,  1 , ...,  1 ,  1 ,  1  ]
[  0 ,  1 ,  1 , ...,  1 ,  1 ,  0  ]
[  0 ,  0 ,  1 , ...,  1 ,  0 ,  0  ]
[ ..., ..., ..., ..., ..., ..., ... ]
[  0 ,  1 ,  1 , ...,  1 ,  1 ,  0  ]
[  1 ,  1 ,  1 , ...,  1 ,  1 ,  1  ]
*/
public class Matrix06 {

	public static void main(String[] args) {
		int n;
		int[][] matrix;

		n = 0;
		matrix = getSquareMatrix(n);
		printMatrix(matrix);

		n = 8;
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
		int firstValue;
		int lastValue;

		firstValue = 0;
		lastValue = matrix[0].length;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = firstValue; j < lastValue; j++) {
				matrix[i][j] = 1;
			}

			// При четном n не получается использовать if/else, потому что при
			// i == matrix[0].length, надо оставить неизменными firstValue и lastValue
			if (i < matrix[0].length / 2 - 1) {
				firstValue++;
				lastValue--;
			}

			if (i > matrix[0].length / 2 - 1) {
				firstValue--;
				lastValue++;
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
