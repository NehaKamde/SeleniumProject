import java.util.Arrays;
import java.util.Collections;

public class ArrayDemo {

	public static void main(String[] args) {

		Integer a[] = {10,2,8,5,9};
		
		System.out.println(Arrays.toString(a));

		Arrays.sort (a,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(a));
		
		
		
	}

}
