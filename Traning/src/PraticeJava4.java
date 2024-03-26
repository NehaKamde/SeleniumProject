import java.util.Scanner;

public class PraticeJava4 {

	public static void main(String[] args) {

		int num;
		int fact = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");

		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			fact = fact * i;

		}
		System.out.println(fact);

	}

}
