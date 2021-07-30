package com.mph;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	private int sid;
	private String name;
	private int marks;
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String name, int marks, int age) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Student s1) {
		return this.age - s1.age;
	}
	
	//Anonymous inner class
	public static Comparator<Student> nameComparator = new Comparator<Student>() {
		@Override
		public int compare(Student  s1,Student  s2) {
			return (s1.getName().compareTo(s2.getName()));
		}	
		
	};
	//Anonymous inner class
		public static Comparator<Student> marksComparator = new Comparator<Student>() {
			@Override
			public int compare(Student  s1,Student  s2) {
				return (s1.getMarks() - s2.getMarks());
			}	
			
		};
	
}