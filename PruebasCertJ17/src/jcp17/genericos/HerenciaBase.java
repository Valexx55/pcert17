package jcp17.genericos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class HerenciaBase extends Base {
	
	public static void main(String[] args) {
		Stream<String> s = null; 
		if ( s instanceof Collection)
		{
			System.out.println("Esl stream esa una colección");
		} else {
			System.out.println("el streamn no es una colección ");
		}
	}

	//1
	 public <T> Collection<T> transform(Collection<T> list) { return new
	 HashSet<T>(); };  
	
	//2//
	//public <T> Collection<T> transform(Stream<T>
	// list) { return new HashSet<T>();};  
	
	//3
	// public <T> List<T>
	// transform(Collection<T> list) { return new ArrayList<T>(); };
	
	//4
	//public <X> Collection<X> transform(Collection<X> list) { return new HashSet<X>();};
 
	
	//5
	//public Collection<CharSequence> transform( Collection<CharSequence>
	// list) { return new HashSet<CharSequence>(); }; 

}
