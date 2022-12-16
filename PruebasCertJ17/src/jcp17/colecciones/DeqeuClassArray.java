package jcp17.colecciones;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeqeuClassArray {
	
	public static void main(String[] args) {

//What will the following code print when run?

		//QUEE colas -> Deque FIFO
        Deque<Integer> d = new ArrayDeque<>();
        d.push(1);//con push inserta el primero!!!! en la CIMA
        d.push(2);
        d.push(3);
        System.out.println("primero" + d.pollFirst());
        System.out.println(d.poll());
        System.out.println(d.pollLast());
	}

}
