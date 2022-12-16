package jcp17.seccionesdecodigo;

public class EtiquetasSecciones {

	public static void main(String[] args) {
		new EtiquetasSecciones().crazyLoop();
	}

	void crazyLoop() {
		var c = 0;
		JACK: while (c < 8) {
			JILL: System.out.println(c);
			if (c > 3)
				break JILL; //NO COMPILA_ Etiquetas / LABEL CÓDIGO JAVA -- SÓLO PUEDES REFERENCIAR A ESA ETIQUETA FUERA DE ESA SECCIÓN / o dentro de otra
			else
				c++;
		}
	}

}
