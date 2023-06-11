package jcp17.interfaces;

abstract public class AbstractPrivatePruebas {

	abstract interface Swim {
		default void permform() {
			System.out.println("Hola SWIM");
		}
	}

	interface Dance {
		protected default void permform() {
			System.out.println("Hola DANCE");
		}
		
		int nada ();
	}

	static class Pinguino implements Swim, Dance {

		public void permform () {System.out.println("Hola PINGUINO");}
		
		private void muestra ()
		{
			//super.permform();
			Swim.super.permform();
			Dance.super.permform();
		}
		
		@Override
		public int nada () {return 0;}

		public static void main(String[] args) {
			new AbstractPrivatePruebas.Pinguino().muestra();
		}
	}

}
