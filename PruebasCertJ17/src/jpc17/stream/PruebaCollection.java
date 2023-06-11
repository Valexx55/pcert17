package jpc17.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PruebaCollection {

	
	public static void main(String[] args) {
		   List<Integer> names = Arrays.asList(1, 2, 3);  
		   //How many of the following lines will print exactly 6?  1. 
		   System.out.println(names.stream().mapToInt(x->x).sum());  //. 
		  // System.out.println(names.stream().forEach((sum, x)->sum = sum + x));  //3. 
		   System.out.println(names.stream().reduce(0, (a, b)->a+b));  //4. 
		   System.out.println(names.stream().collect(Collectors.mapping(x->x, Collectors.summarizingInt(x->x))).getSum()); // 5. 
		   System.out.println(names.stream().collect(Collectors.summarizingInt(x->x)).getSum());
	}
}
