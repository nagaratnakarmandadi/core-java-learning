
public class ProductUsingRecursion {

	static int recFun(int[] arr, int n) {

		// Base condition
		if (n == 0) {
			return 1;
		}

		// Recursive call
		return arr[n - 1] * recFun(arr, n - 1);
	}

	public static void main(String[] args) {

		int[] list = { 2, 3, 4 };

		int product = recFun(list, list.length);

		System.out.println("Output: " + product);
	}
}
