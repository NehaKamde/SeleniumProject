package javapratice;

import java.util.Scanner;

public class ProfitLossWithInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Cost Price");

		int cp = sc.nextInt();

		System.out.println("Enter Selling Prise");
		
		int sp = sc.nextInt();
		
		int profit = sp-cp;
		
		
		
		System.out.println("profit is " + profit);
		
		int loss = cp-sp;
		
		System.out.println("Loss is"+ loss);

	}

}
