package jcp17.clasicas;

public class ParamTest
{      
	public static void printSum(double a, double b)
	{
	  System.out.println("In double "+(a+b));  
	}   

	public static void printSum(float a, float b)
	{       
		System.out.println("In float "+(a+b));   
	}     
 	public static void main(String[] args) 
 	{       
 		printSum(1.0, 2.0);  //In double 3.0 es imprimido
 		printSum(1, 2);  //In float 3.0 es imprimido
 		 
 	} 
 }