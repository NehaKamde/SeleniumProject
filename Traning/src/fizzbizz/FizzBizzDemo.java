package fizzbizz;

public class FizzBizzDemo {

	public static void main(String[] args) {
	
		int n=101; // change n if needed
		
		for(int i = 1;i<=n;i++) {
			
			if(i%3==0 && i%5==0) {
			System.out.println("FizzBizz");
			
		}
			
			else if (i%3==0) {
				
				System.out.println("Fizz");
			}
		
			else if (i%5==0) {
				System.out.println("Bizz");

	}
			else {
				System.out.println(i);
			}

}
	}
}