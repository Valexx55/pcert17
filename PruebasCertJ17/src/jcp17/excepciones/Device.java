package jcp17.excepciones;

import java.io.IOException;

//try con recursos...si una clase implementa Autocloseable hace el m�todo close
//que se va a ejecutar siempre despu�s del intentar el bloque try haya habido o no excepci�n
//por tanto este c�digo tira una RuntimeException rte pero ENVUELTA en una Execption que se salta primero
//en la l�nea 31, por tanto , tira una Exception y dentro de ella delcara la Runtime tb

public class Device implements AutoCloseable {
	String header = null;

	public void open() throws IOException {
		header = "OPENED";
		System.out.println("Device Opened");
		throw new IOException("Unknown");
	}

	public String read() throws IOException {
		return "";
	}

	public void close() {
		System.out.println("Closing device");
		header = null;
		throw new RuntimeException("rte");
	}

	public static void main(String[] args) throws Exception {
		try (Device d = new Device()) {
			throw new Exception("test");
		}
	}
}
