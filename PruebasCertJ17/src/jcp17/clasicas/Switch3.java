package jcp17.clasicas;

import java.util.List;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class Switch3 {
	//public class TestClass{
		   public static void main(String[] args)  {     calculate(5);    }
		   public static void calculate(int x){
		      String val;
		      switch(x){
		         case 2:
		        default:
		         val = "def";
		      }
		     // System.out.println(val);
		     // IntFunction<IntUnaryOperator> fo = (a)->(b->a-b);
		      byte c = '1';
		      
		      int[] orig = { 4, 5, 6, 7}; 
		      int[] dup = orig.clone();
		      
		      System.out.println(orig==dup);
		      System.out.println(orig==dup);
		      
		   }
//		}
		   
		   class A {
			      public int getCode(){ return 2;}
			}

			class AA extends A { 
			  public void doStuff() {
				  
				   A a = null;
				   AA aa = null;
				   
				   aa = (AA)aa;
			  } 
			}
}
