
public class GCDRecursion {

	static int recFun(int a, int b) {

		// Base condition
		if (b == 0) {
			return a;
		}

		return recFun(b, a % b);
	}

	public static void main(String[] args) {

		int a = 48;
		int b = 18;

		System.out.println("GCD = " + recFun(a, b));
	}
}