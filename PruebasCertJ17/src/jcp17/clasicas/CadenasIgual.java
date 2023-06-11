package jcp17.clasicas;

public class CadenasIgual {

	public static void main(String[] args) {

		String uno = "DOS";
		String dos = new String("DOS");

		if (uno == dos) {
			System.out.println("SON IGUALES");
		} else {
			System.out.println("SON DISTINTOS");
		}

		String myStr = "good";
		char[] myCharArr = { 'g', 'o', 'o', 'd' };
		String newStr = "";
		for (char ch : myCharArr) {
			newStr = newStr + ch;
		}
		boolean b1 = newStr == myStr;
		boolean b2 = newStr.equals(myStr);
		System.out.println(b1 + " " + b2);
		System.out.println(newStr + " " + myStr);
		
		//System.out.println(null+true);

	}

}
