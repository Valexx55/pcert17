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
		
		List<? extends Booby> bV = new ArrayList<Booby>();
		
		//var b = new Booby();
		//Booby x = bV.get(0);
		
		/*bV.add((Booby)x);
		
		bV.add(new Bobys().new Booby());
		bV.add(new Dooby(){ });
		bV.add(b);*/
		
		List<? super Dooby> dV = new ArrayList<>();
		//dV.add(new Dooby(){ });
		//dV.add(new Tooby(){ });
		//Dooby d = dV.get(0);
		
		Booby bb = new Bobys().new Juani();
		
		dV.add((Dooby)bb);
		
		
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
	
	public void <V extends Number> bar(V obj) {
		   // method body...
		}

}
