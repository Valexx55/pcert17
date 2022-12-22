package jcp17.lineacomandos;

import java.sql.Timestamp;

class TestClass {
	public static void main(String args[]) {
		int time = 100;
		Timestamp ts = new Timestamp(time);
		java.util.Date d = new java.util.Date();
		ts = new Timestamp(d.getTime());
		System.out.println(ts);
	}
}