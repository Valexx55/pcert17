package jcp17.concurrencia;

import java.util.concurrent.*;
import java.util.stream.*;

public class StockRoomTracker {
	public static void await(CyclicBarrier cb) { // j1
		try {
			cb.await();
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
      var cb = new CyclicBarrier(10,
         ()->System.out.println("Stock Room Full!")); // j2
      IntStream.iterate(1, i->1).limit(10).parallel()
         .forEach(i->await(cb)); // j3
   }
}