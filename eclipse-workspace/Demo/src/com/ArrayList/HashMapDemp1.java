package com.ArrayList;
import java.util.*;
public class HashMapDemp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>map = new HashMap<Integer, String>();
		map.put(10, "Bojay");
		map.put(20, "Bijay");
		map.put(11, "Bojay");
		map.put(21, "Bijay");
		
		Set<Integer> s = map.keySet();
		for(int i:s) {
			System.out.println("key=="+i);
			System.out.println("value="+map.get(i));
		}
		

	}

}
