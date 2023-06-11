package jcp17.genericos;

import java.util.ArrayList;
import java.util.List;

public class Bobys {
	
	
	class Booby{ } 
	class Dooby extends Booby{ }
	class Juani extends Booby{ }
	class Tooby extends Dooby{ }  
	
	public static void main(String[] args) {
		
		var bL = new ArrayList<Booby>(); 
		var tL = new ArrayList<Tooby>();  
		
		List<? extends Booby> bV = null;
		bV.add(new Booby(){ });
		
		List<? super Dooby> dV = null;
		dV.add(new Dooby(){ });
		
		
//		List<? extends CharSequence> dS = new ArrayList<String>();
//		dS.add(new Integer());
//		dS.add((String)"HOLA");
//		
//		List<? super Tooby> l =  dameListaPalabras();
//		l.add(0, new Dooby());
//		l.add(0, new Tooby());
//		l.add(0, new Booby());
	}
	
	static List<? super Tooby> dameListaPalabras ()
	{
		return new ArrayList<Dooby>();
	}
	
	

}
