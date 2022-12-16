package jcp17.ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FicherosFilesNio {
	

//Given that c:\temp\pathtest is a directory that contains several directories. Each sub directory contains several files but there is exactly one regular file named test.txt within the whole directory structure.
//Which of the given options can be inserted in the code below so that it will print complete path of test.txt?

	public static void main(String[] args) {
		
		try{
		    //Stream<Path> s = null;
			Stream<Path> s = null;
		    //INSERT CODE HERE
			s = Files.list(Paths.get("c:\\temp\\pathtest\\**\\test.txt"));

		    s.forEach(System.out::println);
		}catch(IOException ioe){
		    ioe.printStackTrace();
		}
	}


}
