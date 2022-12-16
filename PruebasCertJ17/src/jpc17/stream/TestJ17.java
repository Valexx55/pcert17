package jpc17.stream;

import java.util.stream.IntStream;

/*
 *NO DEVUEVEL NADA Y NO SABEMOS PORQUÉ
 *
 *HAY QUE ESTYUDIr el takwWile de IntStream
 */
public class TestJ17 {

	// var students = new ArrayList<Student>(); //1

	public static void main(String[] args) {

		IntStream is = IntStream.range(1, 6);
		IntStream is2 = is.takeWhile(x -> x % 2 == 0);
		is2.forEach(System.out::print);
	}

}
//Which lines will cause compilation error?
