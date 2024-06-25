package com.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;
public class DynamicValue {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for(int i=0;i<=5;i++) {
			System.out.println("Enter the number");
			Scanner sc = new Scanner(System.in);
			String number=sc.next();
			list.add(number);
		}
		Iterator<String>itr = list.iterator();
		while(itr.hasNext()) {
		System.out.println("Empoyee list>> "+itr.next());
		
	}

}}
