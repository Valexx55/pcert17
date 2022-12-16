package jpc17.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

//existe un método llamado thenComparing que declarado en un Comparator
//es al que se recurre para desempatar si compare da cero (0)
//el tema es que aquí, el código es trampa porque el operador sorted es intermedio
//y no final, por lo que el flujo de datos ordenados se pierde y se conserva
//el valor de la lista original, según el orden de inserción
//dentro de los métodos intermedios de stream los hay stateful y stateless
//los segundos permiten operar cada elemento de forma independiente
//minestras que los primeros sí tienen el cuenta el estado de la estructura/otros elementos
//al ejecutarse

public class Book {
	private String title;
	private String genre;

	public Book(String title, String genre) {
		this.title = title;
		this.genre = genre;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", genre=" + genre + "]";
	}

	public static void main(String[] args) {

		List<Book> books = Arrays.asList(new Book("c", "0adios"), new Book("b", "1adios"), new Book("a", "1adios"));
		Comparator<Book> c1 = (b1, b2) -> b1.getGenre().compareTo(b2.getGenre()); // 1
		books.stream().sorted(c1.thenComparing(Book::getTitle)); // 2 thenComparing aquí recibe un libro, devuelve un String (comparable)
		List<Book> books3 = books.stream().sorted(new ComparaLibros()).toList(); // 2 thenComparing aquí recibe un libro, devuelve un String (comparable)
		List<Book> books2 = books.stream().sorted(c1.thenComparing(Book::getTitle)).toList(); // 2
		System.out.println("books  " +books);
		System.out.println("books2  " +books2);
		System.out.println("books3 " +books3);
	}
	
	//intentando forzar la ejecución de la implementación por defecto de thenComapring...sin mucho éxito.
	public static class ComparaLibros implements Comparator<Book>
	{

		@Override
		public int compare(Book o1, Book o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public <U extends Comparable<? super U>> Comparator<Book> thenComparing(
				Function<? super Book, ? extends U> keyExtractor) {
			// TODO Auto-generated method stub
			if (keyExtractor instanceof Book) {
				System.out.println("es tipo libro");
				
			} else 
			{
				System.out.println("sabe Díos qué tipo es keyExtractor");
			}
			return Comparator.super.thenComparing(keyExtractor);
		}
		
		@Override
		public <U> Comparator<Book> thenComparing(Function<? super Book, ? extends U> keyExtractor,
				Comparator<? super U> keyComparator) {
			// TODO Auto-generated method stub
			return Comparator.super.thenComparing(keyExtractor, keyComparator);
		}
				
	}

}
