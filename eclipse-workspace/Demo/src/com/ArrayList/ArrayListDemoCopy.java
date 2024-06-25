package com.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemoCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		al.addAll(a1);
		System.out.println("Copy arraylist is= "+al);
		
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		

	}

}
