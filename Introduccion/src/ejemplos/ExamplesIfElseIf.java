package ejemplos;

/*
 * Name: ExamplesIfElseIf
 * Description: Calculates character mark from numerical value
 * Author: Juan Gomez Romero
 * Version: 1.0
 * Creation: Java Tutorial
 * Modification: October 4, 2011
 */

import java.util.Scanner;

public class ExamplesIfElseIf {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("score? ");
		int testscore = sc.nextInt();
        
		char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade = " + grade);
        
        sc.close();
	}

}
