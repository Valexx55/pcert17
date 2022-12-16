package jcp17.enumerados;

import java.util.TreeSet;

public class ClaseTestEnum {

	public static void main(String[] args) {
		var ts = new TreeSet<Title>();
		ts.add(Title.MS2);
		ts.add(Title.MR);
		ts.add(Title.MS1);
		for (Title t : ts) {
			System.out.println(t);
		}
	}
//IMPIRME MR, MS1, MS2 EN ORDEN ALFABÉTICO DEL ELNUMERADO POR SER UN TREESET
}
