package com.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>map = new HashMap<Integer, String>();
		map.put(10, "Bojay");
		map.put(20, "Bijay");
		map.put(11, "Bojay");
		map.put(21, "Bijay");
		
		Set<Integer> s = map.keySet();
		Iterator<Integer> tr = s.iterator();
		while(tr.hasNext()) {
		System.out.println(tr.next());
		}
	}

}
