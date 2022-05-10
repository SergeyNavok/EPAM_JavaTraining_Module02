package by.epam.module02.decomposition;

/*
Вычислить  площадь  правильного  шестиугольника  со  стороной  а,  используя  метод  вычисления  площади 
треугольника.
*/

public class Decomposition03 {

	public static void main(String[] args) {
		int a;

		a = 5;
		printHexagonArea(a);

		a = -10;
		printHexagonArea(a);
	}

	private static void printHexagonArea(int a) {
		if (a <= 0) {
			System.out.println("Invalid value!");

			return;
		}

		double result;

		result = 3 * Math.sqrt(3) / 2 * (a * a);

		System.out.println("Area of a regular hexagon with side " + a + " = " + result);
	}
}
