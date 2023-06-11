package jcp17.clasicas;

public class InitArray {

	public static void main(String args[]) {
		String[][][] arr = { { { "a", "b", "c" }, { "d", "e", null } }, 
							 { { "x" }, null }, { { "y" } },
							 { { "z", "p" }, {} } 
							};
		System.out.println(arr[0][1][2]);
		double d = 3;
		if (d%2!=0)
		{
			System.out.println("jogl");
		}
	}

}
