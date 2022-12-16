package jpc17.enumerados;

public class EnumJ17 {

	/*
	
	Al hacer String.valueOf (ENUMERADO) sale el string que asocias al declarar ese enumerado
	ENUMERADO("Valor String asociado");
	 */

	enum Coffee {
		ESPRESSO("Very Strong"), MOCHA("Bold"), LATTE("Mild");

		public String strength;

		Coffee(String strength) {
			this.strength = strength;
		}
		
		public String toString(){
			//return "Very Strong"; 
			return String.valueOf(strength); 
		}
	}

//What can be done so that the above statement will print Very Strong?

	public static void main(String[] args) {
		System.out.println(Coffee.ESPRESSO);
	}

}
