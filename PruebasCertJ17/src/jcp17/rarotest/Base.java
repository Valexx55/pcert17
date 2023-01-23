package jcp17.rarotest;

import java.util.ArrayList;
import java.util.Set;

class Base {
	public ArrayList<Number> transform(Set<Integer> list) {
		return null;
	};
}

class Derived extends Base {
	// Este primero PETA
	/*public ArrayList<? extends Integer> transform(Set<Integer> list) {
		return null;
	}
	*/
	/*public ArrayList<Number> transform(Set list){
		return null;
	}*/
}
