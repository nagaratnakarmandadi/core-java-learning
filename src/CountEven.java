
public class CountEven {

	static int recFun(int[] arr, int n) {

		if (n == 0) {
			return 0;
		}

		if (arr[n - 1] % 2 == 0) {
			return 1 + recFun(arr, n - 1);
		}

		return recFun(arr, n - 1);
	}

	public static void main(String[] args) {

		int[] arr = { 2, 5, 8, 9, 10, 12 };

		System.out.println("Even Count = " + recFun(arr, arr.length));
	}
}
