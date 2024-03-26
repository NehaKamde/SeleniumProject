package javapackage;

import java.util.Scanner;

public class Subtraction {

	public static void main(String[] args) {
      
		int a;
		int b;
		int sub;
		
       System.out.println("Enter 2 Numbers");	
       Scanner sc = new Scanner(System.in);
    	a = sc.nextInt();
        b = sc.nextInt();
        sub = a-b;
        
        System.out.println("Subtraction of 2 numbers are " + sub);
        
	
	
	}

}
