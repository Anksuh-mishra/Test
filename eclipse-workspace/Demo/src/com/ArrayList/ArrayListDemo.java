package com.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al =  Arrays.asList(1,2,3,4,5,6,7,8,9);
		for(int i = 0; i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		
		

	}

}
