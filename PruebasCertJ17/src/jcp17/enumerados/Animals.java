package jcp17.enumerados;

public enum Animals {
	MAMMAL(true), INVERTEBRATE(Boolean.FALSE), BIRD(false),
	REPTILE(false), AMPHIBIAN(false), FISH(false) {
	public int swim() { return 4; }
	};
	final boolean hasHair;
	 Animals(boolean hasHair) {
	this.hasHair = hasHair;
	this.hasHair = true;
	}
	public boolean hasHair() { return hasHair; }
	public int swim() { return 0; }

}
