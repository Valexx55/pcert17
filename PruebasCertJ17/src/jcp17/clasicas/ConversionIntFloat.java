package jcp17.clasicas;

public class ConversionIntFloat {

	public static void main(String[] args) {
		int i = 1234567890;
		float f = i;
		System.out.println(i - (int) f);
	}

}
