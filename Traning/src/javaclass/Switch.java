package javaclass;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		System.out.println("Enter Number");
		Scanner sc =new Scanner(System.in);
		int day = sc.nextInt();
		
		

		switch(day)
		{
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		}
	}

}
