package com.mph;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmpStreamEg {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		Employee[] empArr = {
			new Employee("Arun","Kumar","IT",60000),
			new Employee("Hari","Ram","Sales",70000),
			new Employee("Sharuk","Khan","Marketing",60000),
			new Employee("Aishwarya","Roy","IT",80000),
			new Employee("Prabhas","Bahu","Sales",960000)
				
		};
		
		List<Employee> empList = Arrays.asList(empArr);
		System.out.println(empList);
		
		boolean result =empList.stream().anyMatch(emp->emp.getDept().matches("IT"));
		if(result)
		{
			System.out.println("Employees Available");
		}else
		{
			System.out.println("No Employees :(");
		}
		
		Predicate<Employee> p1 = e->(e.getSalary()>60000 && e.getSalary()<90000);
		empList.stream()
			.filter(p1)
			.sorted(Comparator.comparing(Employee::getFname))
			.forEach(System.out::println);
		
		System.out.println("The first Emp in the entry :");
		System.out.println(empList.stream().filter(p1).findFirst().get());
		
		
		Map<String,List<Employee>> groupByDept =empList.stream().collect(Collectors.groupingBy(Employee::getDept));
		System.out.println(groupByDept);
		
		groupByDept.forEach((dep,empInDept)->{
			System.out.println(dep);
			
			/*Iterator<Employee> i = empInDept.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}*/
			
			empInDept.forEach(System.out::println);
			
		});
		
		
		/*
		IT:
			Aru
			Aish
		Sal:
			Har
			Prab
		Mark
		   Shar
		*/
	
	}

}