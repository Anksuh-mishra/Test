package com.ArrayList;

import java.util.HashSet;
//import java.util.LinkedHashSet;



public class HasSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hasSet = new HashSet();
		hasSet.add(10);
		hasSet.add(4);
		hasSet.add(43);
		hasSet.add(65);
		for(Object j:hasSet) {
			System.out.println(j);
		}

	}

}
