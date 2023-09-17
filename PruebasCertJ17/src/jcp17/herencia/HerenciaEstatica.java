package jcp17.herencia;

class Super { static String ID = "QBANK"; }

class Sub extends Super{
	int a = 0;
   static { System.out.print("In Sub"); }
}
public class HerenciaEstatica{
   public static void main(String[] args){
	  Sub b = new Sub();
      System.out.println(Sub.ID);
   }
}