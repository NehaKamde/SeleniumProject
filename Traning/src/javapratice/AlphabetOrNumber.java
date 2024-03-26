package javapratice;

public class AlphabetOrNumber {

	public static void main(String[] args) {

		int ch = '+';
	
		
		if (ch>=65 && ch<=90){
			
		System.out.println("ch is Capitabl Alphabet");	
					
			}
		else if (ch>=97 && ch<=122) {
			System.out.println("ch is Small");
		}
	
	else if (ch>=48 && ch<=57) {
	 System.out.println("ch is Number");	
	}
	else {
		
		System.out.println("ch is special charecter");
	}
}
}

