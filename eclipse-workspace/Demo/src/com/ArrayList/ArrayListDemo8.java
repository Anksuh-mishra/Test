package com.ArrayList;
import java.util.*;
public class ArrayListDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e = new Employee(20,"Snkudh","83784");
		al.add(e);
		al.add(new Employee (20,"Ankush","30"));
		
		Iterator<Employee>itr = al.iterator();
		while(itr.hasNext()) {
		System.out.println("Empoyee list>> "+itr.next());
		
		}
		
		
	}

}
