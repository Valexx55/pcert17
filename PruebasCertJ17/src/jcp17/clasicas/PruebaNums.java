package jcp17.clasicas;

//esto pinta 6 20
//ojo porque Integer aunque sea una clase
//SE PASA POR VALOR!
public class PruebaNums {
	public static Integer wiggler(Integer x) {
		Integer y = x + 10;
		x++;
		System.out.println(x);
		return y;
	}

	public static void main(String[] args){
	       Integer dataWrapper = new Integer(5);
	       Integer value = wiggler(dataWrapper);
	       System.out.println(dataWrapper+value);
	       
	      
	    }
}
