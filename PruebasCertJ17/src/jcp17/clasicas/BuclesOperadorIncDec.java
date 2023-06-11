package jcp17.clasicas;

public class BuclesOperadorIncDec {
	int k = 5;

	public boolean checkIt(int k) {
		return k-- > 0 ? true : false;
	}

	public void printThem() {
		while (checkIt(k)) {
			System.out.print(++k);
		}
	}

	public static void main(String[] args) {
		new BuclesOperadorIncDec().printThem();
	}
}
