// Break & Continue Statement 02

public class Jumping_Statement02 {

	public static void main(String[] args) {
		
		System.out.println("Using For-Loop to create math table of 12 :-----------------------------");
		
		int fn = 12;
		for(int e=1; e<=10; e++) {
			if (e==7) {
				break;
			}
			System.out.println(fn+ "*" +e+ "=" +fn*e);
		}
		System.out.println("Using For-Loop to create math table of 13 :-----------------------------");
		int rt = 13;
		for(int w=1; w<=10; w++) {
			if (w==7) {
				continue;
			}
			System.out.println(rt+ "*" +w+ "=" +rt*w);
		}
	}

}
