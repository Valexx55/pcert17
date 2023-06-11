package jcp17.clasicas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStatic2 {

	private static final String leftRope;
	private static final String rightRope;
	// private static final String bench;
	private static final String name = "name";
	static {
		leftRope = "left";
		rightRope = "right";
	}
	static {
//		name = "name";
//		rightRope = "right";
	}

	public static void main(String[] args) {
		List<Double> numbers = new ArrayList<>();
		numbers.add(12.0);
		numbers.add(3.14);
		numbers.add(3.14);
		numbers.add(2.718);
		numbers.add(2.718);

		numbers.forEach(n -> System.out.println(n.doubleValue()));

		numbers.forEach(n -> System.out.println((int) n.doubleValue()));

		Predicate<Double> pred = n -> Math.round(n) == (int) n.doubleValue();

		numbers.removeIf(pred);

		System.out.println(numbers);

		var tailFeathers = 3;
		final var one = 1;
		switch (tailFeathers) {
		case one:
			System.out.print(3 + " ");
			// case :
		case 2, 3:
			System.out.println(5 + " ");
		}
		while (tailFeathers > 1) {
			System.out.print(--tailFeathers + " ");
		}

		Stream<String> s = Stream.empty();
		var p = s.collect(Collectors.partitioningBy(b -> b.startsWith("c")));
		s = Stream.empty();
		var g = s.collect(Collectors.groupingBy(b -> b.startsWith("c")));
		System.out.println(p + " " + g);

		Set<Integer> ce = new TreeSet<>();
		// ce.add(null);

		Map<String, Integer> m = new TreeMap<>();
		m.put("3", null);

		var arr = new String[] { "PIG", "pig", "123" };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, "0"));

		var spliterator = Stream.generate(() -> "x").spliterator();

		spliterator.tryAdvance(System.out::print);
		var split = spliterator.trySplit();
		split.tryAdvance(System.out::print);
		
		List<?> q = List.of("mouse", "parrot");
		var v = List.of("mouse", "parrot");
		
		//q.removeIf(String::isEmpty);
		//q.removeIf(g->g.length() == 4);
		v.removeIf(String::isEmpty);
		v.removeIf(gt->gt.length() == 4);

	}

}
