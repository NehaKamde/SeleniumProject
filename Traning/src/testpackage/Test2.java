package testpackage;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int sub;
		
    System.out.println("Enter 2 numbers");
    Scanner sc =new Scanner(System.in);
    
    a = sc.nextInt();
    b = sc.nextInt();
    
    sub= a-b;
    System.out.println("subtraction of 2 numbers are "+ sub);
    
	}

}
