package DataTypes;

public class DataTypes {
	byte b1 = 127;
	byte b2 = (byte) 167;
	short s1 = 2356;
	short s2 = (short) 2345679;
	int i1 = 345678900;
	int i2 = (int) 234567890;
	long l1 = 1234567890987609999l;
	float f1 = 1234587678;
	double d1 = 98765433.9876544567865445676547865434567876543567654;
	char c1 = 'a';
	boolean bo= false;

	public static void main(String[] args) {
		DataTypes t = new DataTypes();
		System.out.println(t.b1);
		System.out.println(t.b2);
		System.out.println(t.s1);
		System.out.println(t.s2);
		System.out.println(t.i1);
		System.out.println(t.i2);
		System.out.println(t.f1);
		System.out.println(t.d1);
		System.out.println(t.bo);
		DataTypes t1 = new DataTypes();
		System.out.println(t1.f1 +(t1.d1));
		System.out.println();

	}

}
