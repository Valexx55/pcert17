package jcp17.interfaces;

abstract public class AbstractPrivatePruebas {

	abstract interface Swim {
		default void permform() {
			System.out.println("Hola SWIM");
		}
	}

	interface Dance {
		default void permform() {
			System.out.println("Hola DANCE");
		}
	}

	static class Pinguino implements Swim, Dance {

		public void permform () {System.out.println("Hola PINGUINO");}
		
		private void muestra ()
		{
			Swim.super.permform();
		}
		

		public static void main(String[] args) {
			new AbstractPrivatePruebas.Pinguino().muestra();
		}
	}

}
