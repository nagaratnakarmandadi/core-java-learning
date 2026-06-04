public class LargestElemen {

	static int recFun(int[] arr, int n) {

		if (n == 1) {
			return arr[0];
		}

		return Math.max(arr[n - 1], recFun(arr, n - 1));
	}

	public static void main(String[] args) {

		int[] arr = { 10, 50, 20, 80, 30 };

		System.out.println("Largest Element = " + recFun(arr, arr.length));
	}
}
