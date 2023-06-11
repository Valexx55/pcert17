package jcp17.colecciones;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class DeqeuClassArray {

	public static void main(String[] args) {

//What will the following code print when run?
		
		var rlock = new ReentrantLock();
		var f1 = rlock.tryLock();
		System.out.println(f1);
		var f2 = rlock.tryLock();
		System.out.println(f2); 
		
		float f = 3;
		int a = (int)3.6;

		//QUEE colas -> Deque FIFO
        Deque<Integer> d = new ArrayDeque<>();
      //  Queue<Integer> d = new ArrayDeque<>();
        d.push(1);//con push inserta el primero!!!! por el PRINCIPIO vs con ADD por el final
        d.push(2);
        d.push(3);
        /*System.out.println(d);
        d.pop();
        System.out.println(d);
        d.pop();
        System.out.println(d);
        d.pop();
        System.out.println(d);*/
//        System.out.println("primero" + d.pollFirst());
//        System.out.println(d.poll());
//        System.out.println(d.pollLast());
        System.out.println(d.peekFirst());
        System.out.println(d);
        System.out.println(d.peekLast());
        System.out.println(d);
        System.out.println(d.peek());
        System.out.println(d);
        
        System.out.println(d.offerFirst(4));
        System.out.println(d);
        System.out.println(d.offerLast(5));
        System.out.println(d);
        
        d.addFirst(6);
        System.out.println(d);
        d.addFirst(7);
        System.out.println(d);
        d.addLast(8);
        System.out.println(d);
        
        
        System.out.println(d);
        d.poll();
        System.out.println(d);

        
        System.out.println(d.pollFirst());
        System.out.println(d);
        System.out.println(d.pollLast());
        System.out.println(d);
        
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
        
	}

}
