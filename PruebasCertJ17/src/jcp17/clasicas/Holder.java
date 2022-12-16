package jcp17.clasicas;

class Holder{
	
	//difíicl de seguir, supone un null pointer por la línea 18
	   int value = 1;
	   Holder link;
	   public Holder(int val){ this.value = val; }
	   public static void main(String[] args){
		final var a = new Holder(5);
		var b = new Holder(10);
		a.link = b;
		b.link = setIt(a, b);
		System.out.println(a.link.value+" "+b.link.value);
	   }
	   
	   public static Holder setIt(final Holder x, final Holder y){
	       x.link = y.link;
	       return x;
	   }
	   
	}