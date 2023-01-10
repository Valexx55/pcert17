package jcp17.clasicas;

public class FloatODobuble {
	
	public static void main(String[] args) {
		   int rate = 10;
		   int t = 5;
		   //float amount = 1000.0f; pq float no vale si no se pone una f
		   double amount = 1000.0;
		   
		   for(int i=0; i<t; i++){
		      amount = amount*(1 - rate/100);
		   }
	}

}
