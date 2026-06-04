
public class MaxDigit {

	static int recFun(int n) {

		if (n < 10) {
			return n;
		}

		int digit = n % 10;

		return Math.max(digit, recFun(n / 10));
	}

	public static void main(String[] args) {

		int num = 58291;

		System.out.println("Maximum Digit = " + recFun(num));
	}
}
