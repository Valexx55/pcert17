package jcp17.herencia;

public class HerenciaInterfacesHiddenShadow {

	
	interface Uno {
		int n = 1;
		
		default void imprime ()
		{
			System.out.println(n);
		}
	}
	
	interface Dos extends Uno {
		int n = 2;
	}
	
	class Tres implements Uno {
		int n = 3;
		
		public void imprime () {
			System.out.println(n);
		}
		
//		public int dale ()
//		{
//			return 3;
//		}
	}
	
	class Cuatro extends Tres {
		public long dale ()
		{
			return 3;
		}
	}
	
	class Base{
		   private float f = 1.0f;
		   void setF(float f1){ this.f = f1; }
		}
	class Base2 extends Base{
		   private float f = 2.0f;
		   //1
		   //private void setF(float f1){ this.f = 2*f1; }
		   public void setF(double f1){ this.f =  (float) (2 *f1); }
		   public void setF(int f1){ this.f =  (float) 2*f1; }
	}
	
	public static void main(String[] args) {
		HerenciaInterfacesHiddenShadow.Uno uno = new HerenciaInterfacesHiddenShadow().new Tres();
		HerenciaInterfacesHiddenShadow.Tres tres = new HerenciaInterfacesHiddenShadow().new Tres();
		uno.imprime();
		tres.imprime();
		System.out.println(uno.n);
		System.out.println(tres.n);
	}
}
