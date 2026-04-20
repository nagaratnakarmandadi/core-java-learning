package DataTypes;

public class Varibles {
	int a = 212;
	String name = "ravi";
	static int b = 32;
	static String name2 = "kiran";

	public static void main(String[] args) {
		int a = 23;
		String name = "ravi";
		System.out.println(a);
		System.out.println(name);
		Varibles v = new Varibles();
		System.out.println(v.a);
		System.out.println(Varibles.b);

	}

}
