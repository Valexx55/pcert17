package jpc17.textblocks;

public class TextBlockJ15 {

	/*
	 * \ al final de un text block evita el salto de línea
	 * 
	 * \s mete 2 espacios
	 * 
	 * \t tal cual, literal, el caracter tab (longuitud 1)
	 * 
	 * hay espacios indicentales y esenciales. Los espacios al final de la línea
	 * son ignorados en un textblock. No si están al inicio (esenciales)
	 * 
	 * las comillas de cierre """ implican un intro final si están declaradas
	 * en una nueva línea
	 *
	 * \" sería ignorado y supundría el literal " --> en los textBlocks no hace falta escapar las comillas
	 * 
	 * El caracter más a la izquierda define el margen izquierdo, conviertiendo
	 * en espacios esenciales a las líneas que se metan a la derecha respecto de él
	 * 
	 * El efecto alineador/margen izquiero lo tiene también los caracteres de cierre """
	 * no así los de apertura
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
