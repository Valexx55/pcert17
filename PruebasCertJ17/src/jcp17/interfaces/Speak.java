package jcp17.interfaces;

public class Speak {
	public static void main(String[] args) {         
		Speak s = new GoodSpeak();          
		//INSERT CODE HERE
		//s.up();//NO EXISTE!!!!
		((Tone)s).up();
		((GoodSpeak)s).up();
		//(GoodSpeak)s.up();// NO COMPILA!!!
		}
}

class GoodSpeak extends Speak implements Tone {
	public void up() {
		System.out.println("UP UP UP");
	}
}

interface Tone {
	void up();
}