
public class Duplicate {

	public static void main(String[] args) {
		int[] num = { 50, 50, 40, 40, 30, 10, 10, 10, 20, 20, 5, 5 };
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] < num[i]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("Ascending ORDER");
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] != num[i + 1])
				System.out.print(num[i] + " ");

		}
		System.out.println(num[num.length - 1]);

	}

}
