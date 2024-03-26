package javapackage;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {

		int a;
		int b;
		int Division;
		
		System.out.println("Enter 2 Numbers");
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		Division = a/b;
		
		System.out.println("Divison of 2 numbers are" + Division);
		
		
		
	}

}
