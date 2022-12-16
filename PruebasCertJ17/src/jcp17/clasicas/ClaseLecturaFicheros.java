package jcp17.clasicas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Cuando leemos un fichero con FileReader (char[])
 * se intentan leer char[].length caracteres 
 * si se leen menos (porque se llega al final)
 * el buffer (char[]) no se vacía o recicla, 
 * por lo que al quedar sucio, las últimas posiciones
 * pueden tener"basura" del resto anterio
 * 
 * de la interfaz Reader, la doc oficial 
 * https://docs.oracle.com/javase/7/docs/api/java/lang/Readable.html#read(java.nio.CharBuffer)
 * 
 * Attempts to read characters into the specified character buffer. The buffer is used as a repository of characters as-is: the only changes made are the results of a put operation. No flipping or rewinding of the buffer is performed.
 */

public class ClaseLecturaFicheros {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		char[] buf = new char[5];
		try (FileReader fr = new FileReader("test1.txt"); FileWriter fw = new FileWriter("test2.txt")) {
			//test1 tiene 01234567 y test2 acaba con 0123456734
			while (fr.read(buf) != -1) {
				fw.write(buf);
			}
			
		}
	}

}
