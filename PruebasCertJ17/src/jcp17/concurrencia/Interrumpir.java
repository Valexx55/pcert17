package jcp17.concurrencia;




class A extends Thread
{
   boolean flag = true;
   public void run()
   {
      System.out.println("Starting loop");

      while( flag ){ };   //1
//      while( !this.isInterrupted() ){
//    	  
//    	  System.out.println("camón");
//      };   //1

      System.out.println("Ending loop");
   }
}
public class Interrumpir
{
   public static void main(String args[]) throws Exception
   {
      A a = new A();
      //a.setDaemon(true);//con esta instrucción, la JVM acaba aunque el hilo ese no?
      a.start();
      
      Thread.sleep(500);
      
      //2
     // System.out.println("jamón");
      a.interrupt();

   }
}

