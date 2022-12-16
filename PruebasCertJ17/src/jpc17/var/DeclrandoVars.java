package jpc17.var;

public class DeclrandoVars {

	public static void main(String[] args) {
		
		//var a = b = c = 100; //MAL
		//var a = 100, b = 10; var a = b;//MAL
		int a, b, c=100;//BIEN
		//int a=100, b, c;//BIEN
		//int a = 100 = b = c;//MAL
		//int a = b = c = 100;//MAL
		//int a, b, c; a = b = c = 100;//BIEN
		
		

		//What will be the result of compiling and running the following code:

float foo = 2, bar = 3, baz = 4;    //1
float mod1 = foo % baz, mod2 = baz % foo;  //2
float val = mod1>mod2? bar : baz; //3
System.out.println(val);

	}
}
