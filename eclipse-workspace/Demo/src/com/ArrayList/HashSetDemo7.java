package com.ArrayList;
import java.util.*;
public class HashSetDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add(69);
		hs.add(32);
		hs.add(32);
		hs.add("Bijay");
		hs.add("Trushal");
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}

	}

}
