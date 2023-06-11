package jcp17.clasicas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serial {

	public static void main(String[] args) throws Exception {
		Moo moo = new Moo();
		moo.moo = 20;
		FileOutputStream fos = new FileOutputStream("moo1.ser");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(moo);
		os.close();

		System.out.println("--------------------");
		
		FileInputStream fis = new FileInputStream("moo1.ser");
		ObjectInputStream is = new ObjectInputStream(fis);
		Moo moo1 = (Moo) is.readObject();
		is.close();
		System.out.println(moo1.moo);
	}

}

class Boo {
	public Boo() {
		System.out.println("In Boo");
	}
}

class BooBoo extends Boo {
	public BooBoo() {
		System.out.println("In BooBoo");
	}
}

class Moo extends BooBoo implements Serializable {
	int moo = 10;
	{
		System.out.println("moo set to 10");
	}

	public Moo() {
		System.out.println("In Moo");
	}
}
