package com.ArrayList;
import java.util.ArrayList;
public class ArrayListDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("Pune");
		al.add("Mumbai");
		al.add("Bangalore");
		al.add(20);
		System.out.println(al.get(1));
		System.out.println(al);
		System.out.println(al.remove("Bangalore"));
		System.out.println(al.contains("Pune"));
		System.out.println(al);
		

	}

}
