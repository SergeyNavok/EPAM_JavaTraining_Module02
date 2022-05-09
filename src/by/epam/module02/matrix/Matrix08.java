package by.epam.module02.matrix;

import java.util.Objects;
import java.util.Scanner;

/*
В числовой матрице поменять местами два столбца  любых столбца, т. е. все элементы одного столбца поставить 
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит 
пользователь с клавиатуры.
*/

public class Matrix08 {

	public static void main(String[] args) {
		int size;
		int[][] matrix;

		String message = "Enter matrix size: ";

		size = getPositiveIntUserInput(message);

		matrix = new int[size][size];

		fillWithRandomPositiveValues(matrix);

		printMatrix(matrix);

		swapColumnsInMatrix(matrix);

		printMatrix(matrix);
	}

	public static int getPositiveIntUserInput(String message) {
		int value;

		value = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (value < 1) {
			System.out.println(message);

			if (sc.hasNextInt()) {
				value = sc.nextInt();
			} else {
				sc.next();
			}
		}

		return value;
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

	public static void swapColumnsInMatrix(int[][] matrix) {
		int columnA;
		int columnB;
		int temp;

		columnA = matrix.length;
		columnB = matrix.length;

		String messageA = "Enter column number A to replace: ";
		String messageB = "Enter column number B to replace: ";

		while (columnA >= matrix.length) {
			columnA = getPositiveIntUserInput(messageA);
			columnA--;
		}

		while (columnB >= matrix.length) {
			columnB = getPositiveIntUserInput(messageB);
			columnB--;
		}

		for (int i = 0; i < matrix[0].length; i++) {
			temp = matrix[i][columnA];
			matrix[i][columnA] = matrix[i][columnB];
			matrix[i][columnB] = temp;
		}
	}
}
