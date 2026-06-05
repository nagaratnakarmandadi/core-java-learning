public class FibonacciRecursion {

	static int recFun(int n) {

		// Base condition
		if (n == 0 || n == 1) {
			return n;
		}

		return recFun(n - 1) + recFun(n - 2);
	}

	public static void main(String[] args) {

		int n = 10;

		for (int i = 0; i < n; i++) {
			System.out.print(recFun(i) + " ");
		}
	}
}