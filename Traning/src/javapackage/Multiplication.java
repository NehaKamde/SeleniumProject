package javapackage;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {

		
		int a;
		int b;
		int mult;
		
		System.out.println("Enter 2 Numbers ");
		Scanner sc = new Scanner(System.in);
		
		a= sc.nextInt();
		b= sc.nextInt();
		mult = a*b;
		
		System.out.println("Multiplication of 2 numbers are" + mult);
		
	
	}

}
