package jcp17.clasicas;

//FLIPANTE. hay una secci�n de Instance InitializeR
//que se ejecuta al invocar al constructor - ANTES DE �L, en realidad-
// la secci�n estatic se ejecuta antes de todas
//luego -adem�s de compilar -la ejecuci�n de esto produce
//6  40   0  30  5
// Static antes q Instance antes q Constructor
public class DeStatic {
	   public static void main(String args[ ] ){
		   DeStatic obj = new DeStatic(5);
	   }
	   int m;
	   static int i1 = 5;
	   static int i2 ;
	   int  j = 100;
	   int x;
	   public DeStatic(int m){
	      System.out.println(i1 + "  " + i2 + "   " + x + "  " + j + "  " + m);
	   }
	  { j = 30; i2 = 40; }  // Instance Initializer
	   static { i1++; }      // Static Initializer
	}