package ejemplos;

/*
 * Name: BasicConditionals.java
 * Description: Examples of switch + if-else
 * Author: Juan Gomez Romero
 * Version: 1
 * Creation: October 8, 2009
 * Modification: October 4, 2011
 */

public class BasicConditionals {
	
	public static void main(String[] args) {
			
		/* switch */
		// Months
		System.out.println("--------------------------------------");
		System.out.println("Months example");		
		
		int month = 5;		
		switch(month) {
			case 1: 
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;			
			case 3:  
				System.out.println("March"); 
				break;
            case 4:  
            	System.out.println("April"); 
            	break;
            case 5:  
            	System.out.println("May"); 
            	break;
            case 6:  
            	System.out.println("June"); 
            	break;
            case 7:  
            	System.out.println("July"); 
            	break;
            case 8:  
            	System.out.println("August"); 
            	break;
            case 9:  
            	System.out.println("September"); 
            	break;
            case 10: 
            	System.out.println("October"); 
            	break;
            case 11: 
            	System.out.println("November"); 
            	break;
            case 12: 
            	System.out.println("December"); 
            	break;
            default: 
            	System.out.println("Invalid month.");
            	break;					
		}
		
		System.out.println("End of example");
		System.out.println("--------------------------------------");
		
		// Number of days of months 
		// (adapted from: 
		//  http://java.sun.com/docs/books/tutorial/java/nutsandbolts/switch.html)
		System.out.println("--------------------------------------");		
		System.out.println("Months example 2");		
		
		int month_2 = 5;
		int year = 2009;
		int numDays = -1;
		
		switch(month_2) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numDays = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDays = 30;
			break;
		case 2:
			if ( ((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0) )
				numDays = 29;
			else
				numDays = 28;
			break;
		default:
			System.out.println("Invalid month.");
			break;				
		}
		System.out.println("Number of Days = " + numDays);		
		System.out.println("End of example");
		System.out.println("--------------------------------------");
	}

}
