package jcp17.clasicas.other;

import jcp17.clasicas.animal.Frog;

public class Tadpole extends Frog {

	public static void main(String[] args) {
		Tadpole t = new Tadpole();
		t.ribbit();
		t.jump();
		Frog f = new Tadpole();
		f.ribbit();
		f.jump();
	}

}
