package jcp17.sealed;

public interface Readable{ 
	
	//hay que hacer que la clase permitida herede! (faltaba extends Document en Book)
} 

sealed class Document implements Readable permits Book{ }  
non-sealed class Book extends Document implements Readable  { }  
final class Journal extends Book{ }
