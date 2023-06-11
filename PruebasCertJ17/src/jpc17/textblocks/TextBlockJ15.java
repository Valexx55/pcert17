package jpc17.textblocks;

public class TextBlockJ15 {

	/*
	 * \ al final de un text block evita el salto de l�nea
	 * 
	 * \s mete 2 espacios
	 * 
	 * \t tal cual, literal, el caracter tab (longuitud 1)
	 * 
	 * hay espacios indicentales y esenciales. Los espacios al final de la l�nea
	 * son ignorados en un textblock. No si est�n al inicio (esenciales)
	 * 
	 * las comillas de cierre """ implican un intro final si est�n declaradas
	 * en una nueva l�nea
	 *
	 * \" ser�a ignorado y supundr�a el literal " --> en los textBlocks no hace falta escapar las comillas
	 * 
	 * El caracter m�s a la izquierda define el margen izquierdo, conviertiendo
	 * en espacios esenciales a las l�neas que se metan a la derecha respecto de �l
	 * 
	 * El efecto alineador/margen izquiero lo tiene tambi�n los caracteres de cierre """
	 * no as� los de apertura
	 */
	
	public static void main(String[] args) {
		String s1 = 
		""" 
			a \
			b \t
			c \s
				""";
				
				
		System.out.println(s1.length()+" "+s1.split("\\n").length);
		System.out.println(s1);
	}
	
	
}
