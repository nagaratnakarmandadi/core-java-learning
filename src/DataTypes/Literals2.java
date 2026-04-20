package DataTypes;

public class Literals2 {

	public static void main(String[] args) {

		float f = 123; // int → float
		float f1 = 123.5f; // float literal
		float f2 = 0123; // octal → decimal 83
		// float f3 = 0123.5f; ❌ invalid (removed)
		float f4 = 1230.5f; // corrected
		float f5 = 123.50f;
		float f6 = 0x123; // hex → decimal 291
		float f7 = 0xdad; // hex → decimal 3501
		// float f8 = 0xSAI; ❌ invalid (removed)

		System.out.println(f);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);
		System.out.println(f7);

	}

}
