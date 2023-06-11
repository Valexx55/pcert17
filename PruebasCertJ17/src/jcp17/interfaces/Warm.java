package jcp17.interfaces;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.DoubleStream;

public interface Warm {
	public void warm();

	private void make() {
		warm();
	}
	
	public static void main(String[] args) {
		//DoubleStream.generate(Random::nextDouble).limit(100).forEach(System.out::println);
		
		List<Integer> nums=List.of(5,19,3,4,12,4,11,22,15,7);
		System.out.println(nums.stream()
		.mapToInt(n->n-4)
		.distinct()
		.filter(n->n>20)
		.findFirst()
		.getAsInt());
		
		
		Consumer consumer=System.out::print;
		

	}
}