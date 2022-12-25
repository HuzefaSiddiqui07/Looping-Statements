// For Loop Type 
// Create a math table of 12 by using For_Loop.

public class ForLoop07 {

	public static void main(String[] args) {
		// Table of 12 print
		System.out.println("Table of 12 is :------------------------------------------");
		int fn = 12;
		for (int b=1; b<=10; b++) {
			System.out.println(fn+ "*" +b+ "=" +fn*b);
		}
		
		// Table of 13 print
		System.out.println("Table of 13 is :------------------------------------------");
		for (int c=13; c<=130; c=c+13) {
			System.out.println("Table of 13 is :" +c);
		}
		
	}

}
