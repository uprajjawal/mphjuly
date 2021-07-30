package com.mph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortClass {

	public static void main(String[] args) {
		int[] intArr = {4,3,8,5,6};
		Arrays.sort(intArr);
		System.out.println("Sorted Array :" + Arrays.toString(intArr));
		
		String[] strArr = {"Ritika","Guru","Chiru","Prasahant"};
		Arrays.sort(strArr);
		System.out.println("Sorted String Array : " + Arrays.toString(strArr));
		
		List<String> list = new ArrayList();
		list.add("Raj");
		list.add("Sai");
		list.add("Monish");
		list.add("Rishab");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("Sorted List : " + list);
		
		Student[] stArray = new Student[3];
		stArray[0]=new Student(20,"Mahitha",80,20);
		stArray[1]=new Student(10,"Chiru",70,25);
		stArray[2]=new Student(15,"Sanjeev",95,19);
		
		Arrays.sort(stArray);
		System.out.println("Sorted student Array :" + Arrays.toString(stArray));
		
		Arrays.sort(stArray,Student.nameComparator);
		System.out.println("Sorted student Array w.r.t Name:" + Arrays.toString(stArray));
		
		Arrays.sort(stArray,Student.marksComparator);
		System.out.println("Sorted student Array w.r.t Marks:" + Arrays.toString(stArray));
		
	}

}