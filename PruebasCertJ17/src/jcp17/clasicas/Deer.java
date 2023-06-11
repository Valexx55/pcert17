package jcp17.clasicas;

public class Deer {
	enum Food {
		APPLES, BERRIES, GRASS
	};

	protected class Diet {
		private Food getFavorite() {
			return Food.BERRIES;
		}
	}
	
	

	public static void main(String[] seasons) {
		System.out.print(switch (new Deer().new Diet().getFavorite()) {
		case APPLES -> "a";
		case BERRIES -> "b";
		default -> "c";
		});
		
		
		var s = "Hello";
		var t = new String(s);
		if ("Hello".equals(s)) System.out.println("one");
		if (t == s) System.out.println("two");
		s.intern();
		if (t.intern() == s) System.out.println("three");
		if ("Hello" == s) System.out.println("four");
		if ("Hello".intern() == t) System.out.println("five");
		String h = "Hello";//new String("Hello");
		if (h == s) System.out.println("six");
	}
}