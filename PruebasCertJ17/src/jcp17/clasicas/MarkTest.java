package jcp17.clasicas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

//el método marKsupported devuelve un boolean si el fichero/flujo permite poner en él una marca
//en caso de que sí pueda, no se sabe mb por qué en el caso de un fichero de texto se puede ?¿
//se hace una marca en el fichero, con mark() se puede volver a ese punto mediante reset ()
//
//en Este ejemplo, se recorrer las últimas líneas de un fichero a través de este mecanismo
//--mark/reset

//ampliamos: parece que para que markSuppoorted devuelva true, el subtipo concreto de Reader
//debe sobrrescribir mark y marksupoorted. Las clases de lectura por bloque o buffer o bytearray
//parece que sí lo implementan (acceso direceto)
//mientras que las clases de lectura secuencial (fileInputStream, FilReader, etc9 NO

public class MarkTest {
	public static void main(String[] args) {
		try (Reader r = new BufferedReader(new FileReader("test3.txt"))) {
			if (r.markSupported()) {
				BufferedReader in = (BufferedReader) r;
				System.out.print(in.readLine());
				in.mark(100);
				System.out.print(in.readLine());
				System.out.print(in.readLine());
				in.reset();
				System.out.print(in.readLine());
				in.reset();
				System.out.println(in.readLine());
			} else {
				System.out.println("Mark Not Supported");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}