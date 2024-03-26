package Palindrom;

public class PalindromDemo {

	public static void main(String[] args) {

String str1 = new String("MADAM");

char ch1[] = str1.toCharArray();
char ch2[] = new char[ch1.length];

for(int i=ch1.length-1,j=0;i>=0;i--) {
	
	ch2[j++]=ch1[i];
	
}
 String str2 = new String(ch2);
 
 if(str1.equals(str2)) {
	 
	 System.out.println("Palindrom");
 }
 else{
	System.out.println("Not Palindram");
}


		
	}

}
