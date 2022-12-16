package jcp17.concurrencia;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

//What will the following code print when run? --> Devuelve DONE

class MyCallable implements Callable<String>{
    public String call() throws Exception {
        Thread.sleep(50000);
        return "DONE";
    }
}
public class TestClass {

    public static void main(String[] args) throws Exception {
       var es =  Executors.newSingleThreadExecutor();
       var future = es.submit(new MyCallable());
       System.out.println(future.get()); //1
       es.shutdownNow(); //2
    }
}    