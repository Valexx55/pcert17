package jcp17.clasicas;

/*
 * 
 * SEGUIMINETO CLÁSICO DE UN WHILE, 
 * sin trampa ni cartón
 * 
 */
public class SimpleLoop {
	public static void main(String[] args) {
		int i = 0, j = 10;
		var count = 0;
		while (i < j) {
			i++;
			j--;
			count++;
		}
		System.out.println(i + " " + j + " " + count);
	}
}