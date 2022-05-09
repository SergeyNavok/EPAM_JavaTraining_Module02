package by.epam.module02.decomposition;

/*
Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где  n  -  заданное натуральное число больше 2.  Для 
решения задачи использовать декомпозицию.
*/

public class Decomposition13 {

	public static void main(String[] args) {
		int n;

		n = -2;
		findTwinNumbers(n);

		n = 15;
		findTwinNumbers(n);
	}

	public static void findTwinNumbers(int n) {
		if (n < 1) {
			System.out.println("Numbers are not natural!");
			return;
		}

		int finish;
		int value;

		finish = n * 2;

		System.out.println("In the range from " + n + " to " + finish);

		for (int i = n; i <= finish; i++) {
			value = i + 2;

			if (value <= finish) {
				System.out.println("for number " + i + " twin " + value);
			}
		}
	}
}
