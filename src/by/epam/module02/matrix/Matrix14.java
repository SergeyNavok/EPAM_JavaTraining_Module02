package by.epam.module02.matrix;

/*
Сформировать случайную матрицу m  x  n, состоящую из нулей и единиц, причем в каждом столбце число 
единиц равно номеру столбца.
*/

public class Matrix14 {

	public static void main(String[] args) {
		int[][] matrix;

		matrix = getRandomMatrix();

		printMatrix(matrix);
	}

	public static int[][] getRandomMatrix() {
		int height;
		int width;
		int[][] matrix;

		width = (int) ((Math.random() * 7) + 2);
		height = (int) ((Math.random() * 7) + width);

		matrix = new int[height][width];

		fillMatrixWithRandomValues(matrix);

		return matrix;
	}

	public static void fillMatrixWithRandomValues(int[][] matrix) {
		if (matrix.length < matrix[0].length) {
			System.out.println("Matrix does not match the condition!");

			return;
		}

		int column;
		int index;

		for (int i = 0; i < matrix[0].length; i++) {
			column = i + 1;

			while (getSumValuesInColumn(matrix, i) != column) {
				index = (int) (Math.random() * matrix.length);
				matrix[index][i] = 1;
			}
		}
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}
	}

	public static int getSumValuesInColumn(int[][] matrix, int column) {
		int sum;

		sum = 0;

		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][column];
		}

		return sum;
	}
}
