package ejemplos;

/*
 * Name: ExamplesWhileDoWhile
 * Description: Examples of while, do while
 * Author: Juan Gomez Romero
 * Version: 1
 * Creation: October 9, 2009
 * Modification: October 5, 2011
 */

public class ExamplesWhileDoWhile {

	public static void main(String[] args) {
		
		/* do while and while */
		// Count down
		System.out.println("--------------------------------------");
		int c;		
		
		// with do while
		System.out.println("Count down with 'do while'");
		c = 10;
		do {
			System.out.println(c);
			c = c - 1;
		} while (c < 10 && c > 0);
		
		// with while
		System.out.println("Count down with 'while'");
		c = 10;
		while (c < 10 && c > 0) {
			System.out.println(c);
			c = c - 1;			
		}
		
		System.out.println("End of example");
		System.out.println("--------------------------------------");

	}

}
