package jcp17.clasicas;

public class Ambito {
	   public static int count(int a) {
		   var b=0;
	      if (a != 3) {       
	         b = 1;
	      } else {
	         b = 2;
	      }
	      return a++ + b;
	   }
	   public static void main(String[] args) {
	      System.out.print(count(3));
	      System.out.print(count(9));
	   }}
