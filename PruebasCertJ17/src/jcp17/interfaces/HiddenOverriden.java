package jcp17.interfaces;

public class HiddenOverriden {
	
	
	interface Flyable {
	//interface Flyable extends Bird {
	    public default void fly() {    
	        System.out.print("Default fly");
	    };
	}

	abstract class Bird implements Flyable {
	//abstract class Bird  {
	    //public abstract void fly();
	    public void fly()
	    {
	    	System.out.print("Pajaros vuelan");
	    }
	}

	class Chicken extends Bird implements Flyable {  
	    public void fly() {    
	        System.out.print("Cannot fly");
	    };
	}

	//static class BirdsFarm {
		public static void main(String[] args)  {
	        Bird b = new HiddenOverriden().new Chicken();
	        Flyable f = b;
	        f.fly();  
	        b.fly();
	    }
	//}

}
