package by.epam.module02.decomposition;

/*
На плоскости заданы своими координатами  n  точек.  Написать метод(методы), определяющие, между какими 
из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
*/

public class Decomposition04 {

	public static class Point {
		int coordinateX;
		int coordinateY;

		Point(int coordinateX, int coordinateY) {
			this.coordinateX = coordinateX;
			this.coordinateY = coordinateY;
		}
	}

	public static void main(String[] args) {
		Point[] points = new Point[1];

		findGreatestDistance(points);

		points = new Point[5];
		points[0] = new Point(1, 2);
		points[1] = new Point(2, 4);
		points[2] = new Point(-3, -2);
		points[3] = new Point(-10, 5);
		points[4] = new Point(0, 0);

		findGreatestDistance(points);
	}

	private static void findGreatestDistance(Point[] points) {
		if (points.length < 2) {
			System.out.println("Small number of points in the array!");

			return;
		}

		int indexI;
		int indexJ;
		double value1;
		double value2;
		double maxDistance;
		double distance;

		indexI = 0;
		indexJ = 0;
		maxDistance = -1;

		for (int i = 0; i < points.length; i++) {
			for (int j = 1; j < points.length; j++) {
				value1 = points[i].coordinateX - points[j].coordinateX;
				value2 = points[i].coordinateY - points[j].coordinateY;
				value1 = Math.pow(value1, 2);
				value2 = Math.pow(value2, 2);
				distance = Math.sqrt(value1 + value2);

				if (maxDistance < distance) {
					indexI = i;
					indexJ = j;
					maxDistance = distance;
				}
			}
		}

		System.out.printf("Greatest distance between points (%d, %d) and (%d, %d) = %.2f\n", points[indexI].coordinateX,
				points[indexI].coordinateY, points[indexJ].coordinateX, points[indexJ].coordinateY, maxDistance);
	}
}
