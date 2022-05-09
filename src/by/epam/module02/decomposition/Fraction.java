package by.epam.module02.decomposition;

public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction() {
		this.numerator = 0;
		this.denominator = 1;
	}

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		setDenominator(denominator);
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator == 0 ? 1 : denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	@Override
	public String toString() {
		String result;

		result = numerator + "/" + denominator;

		return result;
	}
}
