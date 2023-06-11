package jcp17.clasicas;

public class PruebaString {
	
	public static void main(String[] args) {
		var s1 = "Java";
		var s2 = "Java";
		var s3 = s1.indent(1).strip();
		var s4 = s3.intern();
		var sb1 = new StringBuilder();
		sb1.append("Ja").append("va");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(sb1.toString() == s1);
		System.out.println(sb1.toString().equals(s1));
	}

}
