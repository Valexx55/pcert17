package jcp17.interfaces;

public interface T1 {

}
//COMPILA SIN PROBLEMAS


interface T2{
   int VALUE = 10;
   void m1();
}

interface T3 extends T1, T2{
   public void m1();
   public void m1(int x);
   
}