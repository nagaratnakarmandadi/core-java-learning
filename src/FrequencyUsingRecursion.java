
public class FrequencyUsingRecursion {

	static int recFun(int[] arr, int n, int key) {

		// Base condition
		if (n == 0) {
			return 0;
		}

		// Check current element
		if (arr[n - 1] == key) {
			return 1 + recFun(arr, n - 1, key);
		}

		// Recursive call
		return recFun(arr, n - 1, key);
	}

	public static void main(String[] args) {

		int[] list = { 10, 20, 10, 30, 10 };

		int key = 10;

		int frequency = recFun(list, list.length, key);

		System.out.println("Output: " + frequency);
	}
}
