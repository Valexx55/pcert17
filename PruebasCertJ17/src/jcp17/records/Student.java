package jcp17.records;

public record Student(int id, String... subjects) {
	public Student {
		if (id < 0)
			throw new IllegalArgumentException();
		if (subjects == null || subjects.length == 0) {
			subjects = new String[] { "english" };
		}
	}
}