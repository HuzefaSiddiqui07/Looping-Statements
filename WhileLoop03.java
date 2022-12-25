// While Loop Type 
// Create Math Table Of '9' With the help of While_Loop.

public class WhileLoop03 {

	public static void main(String[] args) {
		
		int fn = 9; // fn : Fixed Number
		
		int range = 10; // Up to 10
		
		int v = 1; // Increment this value up to with range number
		
		while (v<=range) {
			System.out.println(fn+ "*" +v+ "=" +fn*v);
			v++;
		}
		
	}

}
