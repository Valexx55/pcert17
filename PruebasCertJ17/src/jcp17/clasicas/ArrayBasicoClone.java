package jcp17.clasicas;

import java.util.Arrays;

public class ArrayBasicoClone {

	public static void main(String[] args) {

		int[][] orig = { { 1, 2, 3 }, { 4, 5, 6, 7 } };
		int[][] dup = orig.clone();
		int[] copy = dup[0].clone();
		System.out.println(orig == dup);
		System.out.println(orig.equals(dup));
		System.out.println(orig[0] == dup[0]);
		System.out.println(dup[0] == copy);
		System.out.println(dup[0].equals(copy));
		System.out.println(Arrays.equals(dup, orig));
	}

}
