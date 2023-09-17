package jcp17.ficheros;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermissions;

public class ModificaAttr {
	
	public static void main(String[] args) {
		
		
		try {
			Path file = Path.of("muestra.pdf");
			BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
			System.out.println(attr.creationTime());
			System.out.println(attr.lastAccessTime());
			System.out.println(attr.lastModifiedTime());
			
			Files.copy(file, new FileOutputStream(new File("copiamuestra.pdf")));
			
			
			DosFileAttributes attr2 =
			        Files.readAttributes(file, DosFileAttributes.class);
			    System.out.println("isReadOnly is " + attr2.isReadOnly());
			    System.out.println("isHidden is " + attr2.isHidden());
			    System.out.println("isArchive is " + attr2.isArchive());
			    System.out.println("isSystem is " + attr2.isSystem());
			    
			//attr2.    
			   
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
