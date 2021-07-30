package com.mph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java7wayStreams {

	public static void main(String[] args) {
		long count = 0;
		List<String> strList = Arrays.asList("Rat", "Cat", "Bat", "", "Tiger", "Lion", "", "Elephant");
		System.out.println(strList);

		count = getEmptyStringCount(strList);
		System.out.println("No. of Empty strings " + count);

		count = getStringsWithLength3(strList);
		System.out.println("No. of strings with Length 3  : " + count);

		List<String> filtered = getStringListwithoutEmptyString(strList);
		System.out.println("Strings without empty strings : " + filtered);

		List<Integer> intList = Arrays.asList(1,5,6,2,4,8,3);
		System.out.println(intList);

		int max = getMax(intList);
		System.out.println("Max value : " + max);

		int min = getMin(intList);
		System.out.println("Min value : " + min);
		
		float avg = getAvg(intList);
		System.out.println("Avg value : " + avg);

	}

	private static float getAvg(List<Integer> intList) {
		int sum = 0;
		for (int i : intList) {
		    sum+=i;
		}
		if(intList.isEmpty()){
		    System.out.println("List empty");
		} else {
		    System.out.println("Average found is " + sum/(float)intList.size());         
		}
		
		float avg= sum/(float)intList.size();
		return avg ;

	}

	private static int getMin(List<Integer> intList) {
		int min = intList.get(0); // 1,5,6,2,4,8,3

		for (int i = 0; i < intList.size(); i++) {
			Integer num = intList.get(i);
			if (num.intValue() < min) {
				min = num.intValue();
			}

		}

		return min;
	}

	private static int getMax(List<Integer> intList) {
		int max = intList.get(0); // 1,5,6,2,4,8,3

		for (int i = 0; i < intList.size(); i++) {
			Integer num = intList.get(i);
			if (num.intValue() > max) {
				max = num.intValue();
			}

		}

		return max;
	}

	private static List<String> getStringListwithoutEmptyString(List<String> strList) {
		List<String> filList = new ArrayList<String>();

		for (String str : strList) {
			if (!(str.isEmpty())) {
				filList.add(str);
			}
		}
		return filList;
	}

	private static long getStringsWithLength3(List<String> strList) {
		int count = 0;

		for (String str : strList) {
			if (str.length() == 3) {
				count++;
			}
		}
		return count;
	}

	private static long getEmptyStringCount(List<String> strList) {
		int count = 0;

		for (String str : strList) {
			if (str.isEmpty()) {
				count++;
			}
		}
		return count;
	}

}