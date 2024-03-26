package testpackage;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		int a;
		int b;
		int sum;

		System.out.println("Enter 2 numbers");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		sum = a + b;

		System.out.println("Sum of 2 numbers are " + sum);

	}

}
