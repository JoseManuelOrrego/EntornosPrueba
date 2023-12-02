package ejemplos;

public class ExamplesFor {

	public static void main(String[] args) {
		
		/* for */
		// Print multiplication table
		int t = 7;
		
		System.out.println("--------------------------------------");
		System.out.println("Multiplication table: " + t);
		for(int i = 0; i <= 10; i++) {
			System.out.println(t + " x " + i + " = " + t * i);		
		}
		System.out.println("End of example");
		System.out.println("--------------------------------------");
		
		
		System.out.println("Multiplication table (while): " + t);
		int k = 0;
		while( k<=10 ) {
			System.out.println(t + " x " + k + " = " + t * k);
			k++;
		}
		
		
		System.out.println("End of example");
		System.out.println("--------------------------------------");
	}

}
