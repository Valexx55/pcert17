package jcp17.rarotest;

public class DobleDefault {

	interface House {
		public default String getAddress() {
			return "101 Main Str";
		}
	}

	interface Bungalow /*extends House*/ {

		public default String getAddress() {
			return "101 Smart Str";
		}
	}

	class MyHouse implements Bungalow, House {
	}

	//public class TestClass {
		public static void main(String[] args) {
			House ci = new DobleDefault().new MyHouse(); // 1
			System.out.println(ci.getAddress()); // 2 } }
		}
	//}

}
