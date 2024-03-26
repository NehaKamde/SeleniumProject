package javapackage;

import java.util.Scanner;

public class ArthmaticOperation {

	public static void main(String[] args) {
      
		int a;
		int b;
		int mult;
		int sub;
		int add;
		int division;
		
		
		 System.out.println("Enter 2 Numbers");
		 
		 Scanner sc = new Scanner(System.in);
		 
		 a = sc.nextInt();
		 b = sc.nextInt();
		 mult = a*b;
		 sub = a-b;
		 add = a+b;
		 division = a/b;
		 
		 System.out.println("Multiplication of 2 numbers are" +  mult);
		 System.out.println("Subtraction of 2 numbers are" + sub);
		 System.out.println("Addition of 2 numbers are" + add);
		 System.out.println("division of 2 numbers are"  + division);
		 
	}

}
