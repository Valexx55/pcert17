package jcp17.clasicas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test {
	record Loc(int id, String... points){
	    static int pr;
	    public int getPr(){
	        return pr;
	    }
	}


	  
	    public static void main(String[] args) {
	        Loc l = new Loc(234, new String[]{"x", "y"});
	        System.out.println(l);
	    }
	

	
	public static void copy(String fileName1, String fileName2) throws Exception{
	    try (
	            InputStream is = new FileInputStream(fileName1);
	            OutputStream os = new FileOutputStream(fileName2);  ) {
	        byte[] buffer = new byte[5];
	        int bytesRead = 0;
	        while ((bytesRead = is.read(buffer)) != -1) {
	            os.write(buffer, 0, bytesRead);
	            System.out.println("Read and written bytes " + bytesRead);
	        }
	    }
	}   
	public static float parseFloat( String s ){
		   try{
		      return Float.valueOf( s ).floatValue();
		   }
		   catch(NumberFormatException nfe){
		      return Float.NaN ;
		   }
		   finally{
		      return 10.0f;
		   }
		}
}

class A {
	void a() {
		System.out.println("a");
	}
}

class B extends A {
	void b() {
		System.out.println("b");
	}
}

class C extends B {
	void c() {
		System.out.println("c");
	}
}

class D extends C {
	void d() {
		System.out.println("d");
	}
}