package com.ArrayList;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("10");
		hs.add("20");
		hs.add("49");
		hs.add("69");
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
