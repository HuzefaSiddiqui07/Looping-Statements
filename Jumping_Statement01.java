// Break & Continue Statement 01

public class Jumping_Statement01 {

	public static void main(String[] args) {
		
		System.out.println("Using For-Loop Increment :-----------------------------");
		
		for (int start=1; start<=20; start++) {
		   if (start==17) {
				continue;
			}
		   System.out.println(start);
		}
		
		System.out.println("Using For-Loop Decrement :-----------------------------");
		
		for (int w=10; w>=1; w--) {
			if(w==2) {
				break;
			}
			System.out.println(w);
		}

	}

}
