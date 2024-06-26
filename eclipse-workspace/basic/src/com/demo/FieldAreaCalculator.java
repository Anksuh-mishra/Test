package com.demo;
import java.util.*;
public class FieldAreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double leangthfeet= sc.nextDouble();
		double widthfeet = sc.nextDouble();
		
		double acresquarefeet = leangthfeet * widthfeet;
		
		double areaAcre = acresquarefeet / 43560.0;
		
		System.out.println("Area of Feet: "+areaAcre+ " area");
	}

}
