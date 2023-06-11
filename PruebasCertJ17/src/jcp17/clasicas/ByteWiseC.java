package jcp17.clasicas;

public class ByteWiseC {
	
	public static void main(String[] args) {
		int myFavoriteNumber = -96;
		int bird = ~myFavoriteNumber;
		int plane = -myFavoriteNumber;
		var superman = bird == plane ? 5 : 10;
		System.out.println(bird + "," + plane + "," + --superman);
	}

}
