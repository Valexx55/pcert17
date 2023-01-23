package jcp17.herencia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

 class  Base {
	
	/*String saluda (String idioma)
	{
		return "HOLA";
	}*/
	
	<U extends Number> Integer corre (Set<U> cjto)
	{
		return 1;
	}
	
	public <T extends CharSequence> Collection<String> transform(Collection<T> list) {
		System.out.println("EN BASE");
		return new ArrayList<String>();
	}
}

public class Sobreescribiendo extends Base {
	
	
	protected <T extends CharSequence> Collection<String> transform(Collection<T> list) {
		System.out.println("EN SOBRE");
		return new HashSet<String>();// ASÍ SOBREESCRIBES
	};
	
	/*public  Collection<String> transform(Collection<String> list) 
	{         
		return new HashSet<String>();//AL QUITAR EL GENÉRICO cd compila quita el <> no sabe distinguir entre el padre y el hijo 
	};*/
	
	<U extends Number> Integer corre (HashSet<Integer> cjto)
	{
		return 0; //sobrecarga
	}
	
	/*String saluda (String idioma)
	{
		return "HOLA";
	}
	
	char saluda (String idioma)
	{
		return 3;
	}*/
	
	/*static CharSequence saluda (String idioma)
	{
		return "HOLA";
	} // NO FUNCIONA PQ NO ADMITE EL MISMO TIPO*/
	 
	
	/*public  Collection<String> transform(Collection<String> list) 
	{         
		return new HashSet<String>();//AL QUITAR EL GENÉRICO cd compila quita el <> no sabe distinguir entre el padre y el hijo 
	};*/

	public Collection<String> transform(List<String> list) {
		return new HashSet<String>(); //ASÍ SOBRECARGAS
	};
	
	
	//public Collection<String> transform(List<String> list) {
		//	return new HashSet<String>(); //ASÍ SOBRECARGAS
		//};
	
	// public <T extends String> Collection<T> transform(Collection<T> list) {
	// return new HashSet<T>();}; //ASÍ NI SOBRESCRIBES NI SOBRECARGAS
	// public <T extends CharSequence> List<T> transform(Collection<T> list) {
	// return new ArrayList<T>(); }; //3
	// public <T extends CharSequence> Collection<T> transform(List<T> list) {
	// return new HashSet<T>(); }; //4
	
	 //public <T super String> Collection<T> transform(List<String> list) {
	 //return new HashSet<T>(); };//5 NO COMPILA PQ NO PUEDE USARSE SUPER
	// public Collection<CharSequence> transform(Collection<CharSequence> list) {
	// return new HashSet<CharSequence>();}; //6

	public static void main(String[] args) {
			Base b = new Base();
			b.transform(null);
			b = new Sobreescribiendo();
			b.transform(null);
			Sobreescribiendo s = new Sobreescribiendo();
			s.transform(null);
			System.out.println(s.corre(Set.of(1, 11, 111)));
			//s.corre(Set.of(1, 11, 111));
			
			
			
			
		}

	
	class A{   
		public List<? extends Number> getList(){       
			return null;   
			}; 
		} 
	class B extends A{ 
		
		/*@Override
		public List<Number> getList() {
			// TODO Auto-generated method stub
			return super.getList();
		}*/
		
		/*@Override
		public ArrayList<Number> getList() {
			// TODO Auto-generated method stub
			return null;
		}*/
		
		@Override
		public ArrayList<Integer> getList() {
			// TODO Auto-generated method stub
			return null;
		}
		
		} 
		
	

}
