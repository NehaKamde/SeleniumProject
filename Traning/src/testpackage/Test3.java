package testpackage;

import java.util.Scanner;

public class Test3 {
 
	public static void main (String[] args) {
		
	int a;
	int b;
	
	int mod;
	
	System.out.println("Enter 2 numbers");
	
	Scanner sc= new Scanner(System.in);
	a = sc.nextInt();
	b = sc.nextInt();
	mod = a%b;
	
	System.out.println("mod of 2 numbers are "+ mod);
	
	}
}
