package jcp17.clasicas;

public class HowMany {
	public static int count(int a) {
		var b = 0;
		if (a != 3) {
			 b = 1;
		} else {
			 b = 2;
		}
		return a++ + b;
	}

	public static void main(String[] args) {
		System.out.println(count(3));
		System.out.println(count(9));
		byte b = 4;
		float f3 = 3;
		f3 = b;
		b = (byte)f3;
	}
}
