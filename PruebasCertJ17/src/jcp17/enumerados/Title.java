package jcp17.enumerados;

public enum Title {
	MR("Mr."), MS1("Ms."), MS2("Ms.");

	private String title;

	private Title(String s) {
		title = s;
	}
}