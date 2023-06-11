package jcp17.concurrencia;

public class MainConcurrente extends Thread {
	private static int threadcounter = 0;

	public void run() {
		threadcounter++;
		System.out.print(threadcounter+ " ");
	}

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 10; i++) {
			synchronized (MainConcurrente.class) {
				new MainConcurrente().start();
			}
		}
		double d = 3;
		long n = (long)d;
	}
	
	public long methodX( byte by){
	    var d = 10.0;
	    return (long) by/d*3;
	}

}
