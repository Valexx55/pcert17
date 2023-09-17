package edu.val.cle.atsistemas.java14;

import java.util.Random;


public class NotasSwitch {
	
	public static void main(String[] args) {
		int notanum = new Random().nextInt(10);
		
		String notanom = switch (notanum) {
	    case 0, 1, 2, 3, 4  -> "SUSPENSO";
	    case 5 -> "APROBADO";
	    case 6 -> "BIEN";
	    case 7, 8	-> {
	    	yield "NOTABLE";
	    }
	    default      -> {
	        
	        yield "SOBRESALIENTE";
	    }
	};
	
	System.out.println(notanom + " " + notanum);
		
	}

}
