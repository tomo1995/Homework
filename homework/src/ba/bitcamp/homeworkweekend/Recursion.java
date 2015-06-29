package ba.bitcamp.homeworkweekend;




public class Recursion {
	/**
	 * This method returns second number as first number exponent.
	 * @param a The first number.
	 * @param b	The second number.
	 */
	public static double getPower(double a, double b) {
		if (b % 1 != 0)
			return Math.pow(a, b);
		if (b > 0) {
			return getPower(a, b, true);
		} else {
			return 1 / getPower(a, b * -1, false);
		}
	}

	private static double getPower(double a, double b, boolean isPositive) {
		if (b == 0)
			return 1;
		return a * getPower(a, b - 1);
	}

	public static void main(String[] args) {
		System.out.println(getPower(2, 5));
		System.out.println(getPower(-2, 4));
		System.out.println(getPower(-2, -2));

	}

}