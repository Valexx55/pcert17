package edu.val.cle.atsistemas.java9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class TtryConRecurssoMejorado {
	
	public static void main(String[] args) throws IOException {
	      System.out.println(readData("./src/salida.txt"));
	   } 
	   static String readData(String ruta) throws IOException {
	      //Reader inputString = new StringReader(message);
	      BufferedReader br = new BufferedReader(new FileReader(ruta));
	      try (br) {
	         return br.readLine();
	      }
	   }

}
