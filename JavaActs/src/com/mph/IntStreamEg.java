package com.mph;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamEg {

	public static void main(String[] args) {
		int[] intArr = {2,3,4,8,7,5,5,6,10};
		System.out.println("int Array values"+ Arrays.toString(intArr));
		//Print using IntStream
		//IntStream.of(intArr).forEach(System.out::println);
		
		System.out.println(IntStream.of(intArr).count());
		System.out.println(IntStream.of(intArr).max().getAsInt());
		System.out.println(IntStream.of(intArr).min().getAsInt());
		System.out.println(IntStream.of(intArr).sum());
		System.out.println(IntStream.of(intArr).average().getAsDouble());
		
		int[] val = {1,2,3,4,5};
		System.out.println("Reduce ops : "+ IntStream.of(val).reduce(1, (x,y) -> x+y));
		

		IntStream.of(intArr).filter(num -> num%2==0).sorted().forEach(System.out::println);
	
		System.out.println("Range ==> "+ IntStream.rangeClosed(1,5).sum());
		//Make Integer[] values to Collection object
		Integer[] intArr1 = {2,3,4,8,7,5,5,6,10};
		List<Integer> val1 = Arrays.stream(intArr1).filter(n->n>5).sorted().collect(Collectors.toList());
		System.out.println(val1);
		//Make int[] values to Collection<Integer> object
		List<Integer> lis =IntStream.of(intArr).boxed().collect(Collectors.toList());
		System.out.println(lis);
	}

}
