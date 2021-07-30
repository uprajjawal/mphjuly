package com.mph;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;


public class StreamJava8 {

	public static void main(String[] args) {
		long count = 0;
		List<String> strList = Arrays.asList("Rat", "Cat", "Bat", "", "Tiger", "Lion", "", "Elephant");
		System.out.println(strList);

		count = strList.stream().filter(str -> str.isEmpty()).count();
		System.out.println("No. of Empty strings " + count);

		count = strList.stream().filter(str -> str.length() == 3).count();
		System.out.println("No. of strings with Length 3  : " + count);
		
		List<String> lis= strList.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
		System.out.println("Strings without empty strings : " + lis);
		
		String lis1= strList.stream().filter(str -> !str.isEmpty()).collect(Collectors.joining(" , "));
		System.out.println("Strings merged with comma : " + lis1);
		
		List<Integer> intList = Arrays.asList(1, 5, 6, 2, 4, 8, 3);
		System.out.println(intList);
		
		List<Integer> intList1 = Arrays.asList(1, 5, 6, 2, 4, 8, 3);
		intList1.stream().filter(x->x%2==0).forEach(System.out::println);
		
		
		IntSummaryStatistics stat =intList.stream().mapToInt(x->x).summaryStatistics();
		System.out.println(stat.getCount());
		System.out.println(stat.getMax());
		System.out.println(stat.getMin());
		System.out.println(stat.getAverage());
		System.out.println(stat.getSum());
	}

}