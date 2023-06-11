package jcp17.colecciones;

import java.util.ArrayList;

public class ListaPrueba {

	public static void main(String[] args) {
		var values = new ArrayList<String>();
		values.sort();

	}

	class Point {
		int x, y;
	}

	class ColoredPoint extends Point {
		int color;
	}

	class DeTest {
		static void test(ColoredPoint p, Point q)
		{
			//(void)->System.out.println("Hola");
			System.out.println("(ColoredPoint, Point)");}
		static void test(Point p, ColoredPoint q)
		{
			System.out.println("(Point, ColoredPoint)");}

		public static void main(String[] args) {
			ColoredPoint cp = new ColoredPoint();
			test(cp, cp);
		}

}
