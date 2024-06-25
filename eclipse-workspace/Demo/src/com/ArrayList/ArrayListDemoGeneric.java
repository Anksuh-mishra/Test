package com.ArrayList;
import java.util.ArrayList;
public class ArrayListDemoGeneric {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(50);
		
		for(int a:al) {
			System.out.print(" "+a);
		}
	}

}
