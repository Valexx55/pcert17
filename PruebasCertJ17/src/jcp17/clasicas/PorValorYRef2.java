package jcp17.clasicas;

class M {
	int i = 5;
}

public	class PorValorYRef2 {
		private M m = new M();

		public void makeItNull(M pM) {
			pM.i = 6; //MODIFIMOAS EL ESTADO
			pM = null; //HACEMOS QUE EL NUEVO PUNTERO APUNTE A OTRO SITIO
		}

		public void makeThisNull() {
			System.out.println("ANTES"+ m.i);
			makeItNull(m);
			if (m==null)
			{
				System.out.println("M es null");
			} else 
			{
				{
					System.out.println("M NO es null");
					System.out.println("DESPUÉS"+ m.i);
				}
			}
		}

		public static void main(String[] args) {
			PorValorYRef2 n = new PorValorYRef2();
			n.makeThisNull();
		}
	}


