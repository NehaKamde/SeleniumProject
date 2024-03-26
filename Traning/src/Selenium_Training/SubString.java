package Selenium_Training;

public class SubString {

	public static void main(String[] args) {
String str = new String("Programming");

int vol = 0;
int con = 0;


String str1 = str.substring(5,8);

System.out.println(str1);

String rev = new StringBuilder(str).reverse().toString();

System.out.println(rev);

System.out.println(str.length());

char ch1[] = str.toCharArray();

for(char ch:str.toCharArray()) {
	
	if(ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u') {
		
		vol++;
		
	}
	else {
		
		con++;
		
	}
	
	
}

System.out.println(vol);
System.out.println(con);

}

}
