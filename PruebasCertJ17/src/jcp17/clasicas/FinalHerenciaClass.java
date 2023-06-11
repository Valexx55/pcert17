package jcp17.clasicas;

public final class FinalHerenciaClass {
	
	public static void main(String[] args) {
		 var c = new FinalHerenciaClass();
		 var h = new FinalHerenciaClass() {};//
		 //h representa a una clase anónima.
		 //Las clases anónimas implementan a una interfaz
		 //o heredan de una clase abstracta
		 //Por tanto, no puedo hacer que esto pase
		 //si FinalHerenciaClass es final.
	}

}
