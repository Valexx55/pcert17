package jcp17.herencia;

/**
 * 
 * cURIOSO. un método abstracto implica que quedada definido en una clase abstracta
 * o en una interfaz""""
 * 
 * se puede poner el modificador de abstract a un método de una interfaz 
 * -aunque parezca redundante-
 *
 */

//public abstract class Prueba {
	public interface Prueba {
	public abstract void draw(); }
	// Insert code here public abstract void draw(); } //Insert code here public
	// 

//class SubP extends Prueba
class SubP implements Prueba

{ 
	@Override
	public void draw(){ System.out.println("in draw..."); } }
