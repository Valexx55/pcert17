package jcp17.clasicas;

public class ArrayTest {


	
		public static void main(String[] args) {
			//var ia[][] = { { 1, 2 }, null };
			var ia = new int[][]{ {1, 2}, null };
			for (int i = 0; i < 2; i++)
				for (int j = 0; j < 2; j++)
					System.out.println(ia[i][j]);
		}
	

	
}
