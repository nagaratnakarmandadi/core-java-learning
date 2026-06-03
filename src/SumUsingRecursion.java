
public class SumUsingRecursion {

	static int recFun(int[] arr, int n) {

		// Base condition
		if (n == 0) {
			return 0;
		}

		// Recursive call
		return arr[n - 1] + recFun(arr, n - 1);
	}

	public static void main(String[] args) {

		int[] list = { 10, 20, 30, 40 };

		int sum = recFun(list, list.length);

		System.out.println("Output: " + sum);
	}
}
