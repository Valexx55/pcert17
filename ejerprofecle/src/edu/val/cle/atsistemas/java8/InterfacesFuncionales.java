package edu.val.cle.atsistemas.java8;

public class InterfacesFuncionales {
	
	public interface Transport {
		public int go();
		public boolean equals (Object o);
	}
	
	public abstract class Car {
		public abstract Object arranca (int duracion);
	}
	
	public interface Train extends Transport {}

	public interface Locomotive extends Train {
		public int getSpeed();
	}	

	public interface Spaceship extends Transport {
		default int maxPasajeros() { return 10;}
	}
	
	public interface Boat {
		int hashCode();
		int hashCode(String input);
	}
}
/**
 * Qué interfaces son funcionales? 
 * a) Boat x b) Car c) Locomotive d) SpaceShip x e) Transport x 
 * f)Train x g) Ninguna*/
