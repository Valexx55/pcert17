package jcp17.excepciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Retorno {

	/*
	 * public static void main(String[] args) {
	 * System.out.println(parseFloat("c0.0")); }
	 */

	/*
	 * public static void main(String[] args) throws Exception { try (var bfr = new
	 * BufferedReader(new InputStreamReader(System.in))) {
	 * System.out.println("Enter Number:"); var s = bfr.readLine();
	 * System.out.println("Your Number is : " + s); } catch (Exception e) {
	 * e.printStackTrace(); } }
	 */

	public static void m(int a) {
		System.out.println("In int ");
	}

	public static void m(char c) {
		System.out.println("In char ");
	}

	public static void main(String[] args) {
		String s = "25";
		Integer i = Integer.parseInt(s);
		Integer j = i;
		i--;
		i++;
		System.out.println((i == j));
		int a = 'a';
		char c = 6;
		m(a);
		m(c);
		String q = new String("25");//.intern();
		String jota="25";
		System.out.println(jota==q);
	}

	public static float parseFloat(String s) {
		float f = 0.0f;
		try {
			f = Float.valueOf(s).floatValue();
			return f;
		} catch (NumberFormatException nfe) {
			f = Float.NaN;
			return f;
		} finally {
			f = 10.0f;
			return f;
		}
	}

}
