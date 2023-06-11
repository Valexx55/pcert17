package jcp17.records;

public record Hello<T>(T t) {
	public Hello(T t) {
		this.t = t;
	}

	/*private void println(T message) {
		System.out.print(t + "-" + message);
	}*/
	
	private <T> void println(T message) {
		System.out.print(t + "-" + message);
	}

	public static void main(String[] args) {
		//new Hello<String>("hi").println(1);
		new Hello("hola").<Float>println(true);
		new Hello<String>("hola").<Integer>println(7);
	}
}