package jcp17.interfaces;

import java.io.*;
import java.sql.*;

interface I7 {
	void m1() throws IOException;
}

interface I8 {
	void m1() throws SQLException;
}

public class TestI implements I7/*, I8*/ {
	/*public static void main(String args[]) /*throws Exception*/ //{
		//TestI tc = new TestI();
		//I7 i1 = (I7) tc; // This is valid.
		//i1.m1();

		/*I8 i2 = (I8) tc; // This is valid too.
		i2.m1();*/

	//}*/

	public void m1() {
		System.out.println("Hi there");
	}
	
	public static void main(String[] args){  new TestI().sayHello(); }   //1
	   public static void sayHello(){ System.out.println("Static Hello World"); }  //2
	   public void sayHello() { System.out.println("Hello World "); }  //3
}