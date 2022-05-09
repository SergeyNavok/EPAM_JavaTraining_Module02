package by.epam.module02.decomposition;

/*
Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, 
если угол между сторонами длиной X и Y — прямой.
*/

public class Decomposition09 {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		int t;

		x = 5;
		y = 4;
		z = 3;
		t = 6;
		calculateArea(x, y, z, t);

		x = 0;
		y = 2;
		z = 0;
		t = 4;
		calculateArea(x, y, z, t);
	}

	public static void calculateArea(int x, int y, int z, int t) {
		if (!isCorrectValue(x, y, z, t)) {
			System.out.println("Wrong sides!");
			System.out.println();

			return;
		}

		double semiPerimeter;
		double temp;
		double area;

		semiPerimeter = (x + y + z + t) / 2.0;
		temp = (semiPerimeter - x) * (semiPerimeter - y) * (semiPerimeter - z) * (semiPerimeter - t);
		area = Math.sqrt(temp);

		System.out.println("Area of quadrilateral = " + area);
		System.out.println();
	}

	public static boolean isCorrectValue(int x, int y, int z, int t) {
		if (x > 0 && y > 0 && z > 0 && t > 0) {
			return true;
		}

		return false;
	}
}
