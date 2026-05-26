
public class DescendingOrder {

	public static void main(String[] args) {
		int[] num = { 10, 50, 20, 40, 30 };
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			int max = i;
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] > num[max]) {
					max = j;
				}
			}
			temp = num[max];
			num[max] = num[i];
			num[i] = temp;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "  ");
		}

	}

}
