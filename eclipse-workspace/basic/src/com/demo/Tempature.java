package com.demo;
import java.util.Scanner;
public class Tempature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in celsius: ");
	      float celsius = sc.nextFloat();
	      float f = (celsius*18f)+32;
	      System.out.println("The Temperature in Fahrenheit "+f);
		

	}

}
