package jcp17.concurrencia;


//Consider the following code:
import java.util.concurrent.*;

public class ThreadPoolTest {
    public static void main(String[] args) {
        Runnable r = ()-> System.out.println("In Runnable");
        Callable<Integer> c = ()-> { System.out.println("In Callable"); return 0; };
        var es = Executors.newCachedThreadPool();

        //INSERT CODE HERE
        es.submit(r);
        es.submit(c);
        
      
        es.shutdown();

    }

}

//What can be inserted in the above code so that both - Runnable r and Callable c - will be executed?