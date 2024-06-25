package com.ArrayList;

import java.util.HashSet;

public class HashSetDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add(98);
		hs.add(32);
		hs.add(32);
		hs.add("Bijay");
		hs.add("Trushal");
		
		HashSet hs1 = new HashSet();
		hs.add(91);
		hs.add(69);
		hs.add(30);
		
		hs.addAll(hs1);
		System.out.println(hs);
		
		
		

	}

}
