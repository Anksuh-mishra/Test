package com.ArrayList;
import java.util.ArrayList;
public class ArrayListGenericString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("10");
		al.add("20");
		al.add("30");
		al.add("40");
		
		for(String a:al) {
			System.out.print(" "+a);
		}

	}

}
