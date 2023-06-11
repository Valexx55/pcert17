package jcp17.herencia;

class Super { static String ID = "QBANK"; }

class Sub extends Super{
   static { System.out.print("In Sub"); }
}
public class HerenciaEstatica{
   public static void main(String[] args){
      System.out.println(Sub.ID);
   }
}