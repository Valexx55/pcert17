package jcp17.clasicas.threads;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CuentaAnimanlesZoo {
	
	public static void main(String[] args) {
		final var r = new ArrayList<Future<?>>();
		ExecutorService s = Executors.newSingleThreadExecutor();
		
		try {
			
			for (int i=0; i<10;i++)
			{
				final int animal = i;
				r.add(s.submit(()->performCount(animal)));
			}
			r.forEach(f -> printResults(f));
		} finally {
			// TODO: handle finally clause
			s.shutdown();
		}
	}
	
	public static void printResults (Future<?> f)
	{
		try {
			System.out.println(f.get(10, TimeUnit.SECONDS));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("EXCEPTION");
		}
	}
	
	public static void performCount (int animal)
	{
		throw new RuntimeException();
	}

}
