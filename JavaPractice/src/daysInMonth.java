//import java.util.Scanner;

public class daysInMonth {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter year: ");
//		int year = sc.nextInt();
//		
//		System.out.println("Enter month: ");
//		int month = sc.nextInt();
//		
		
//		if (year > 0) {
//			System.out.println("Year: " + year);
//		} else {
//			System.out.println("Invalid year!");
//		}
//		
//		if (month > 0 && month < 13) {
//			System.out.println("Month : " + month);
//		} else {
//			System.out.println("Invalid month!");
//		}
//		
		
// https://www.programiz.com/java-programming/examples/leap-year
		
		
		// Declare variables 
		int year = 2000;
		int month = 12;
		int day;
		
		boolean leap;
		
		
		// Determine if given year is a "leap year" or not using If statement
		if (year % 4 == 0)
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			} else
				leap = true;
		} else
			leap = false;

		
		// Print out appropriate message based on the given year
		if (leap == true) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		} 
		
		System.out.println("");	
		
		
		// Determine number of days for the given month using If statement
		// Months 1, 3, 5, 7, 8, 10, 12 give 31 days
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			
			day = 31;
			System.out.println("Year: " + year + "\t Month: " + month + "\t Day: " + day);
		
		// Months 4, 6, 9, and 11 give 30 days
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			
			day = 30;
			System.out.println("Year: " + year + "\t Month: " + month + "\t Day: " + day);
		
		// Month 2 gives either 28 or 29 days	
		} else if (month == 2 && leap == true) {
			
			day = 29;
			System.out.println("Year: " + year + "\t Month: " + month + "\t Day: " + day);
			
		} else {
			
			day = 28;
			System.out.println("Year: " + year + "\t Month: " + month + "\t Day: " + day);
		
		}
		
		
//		// Determine number of days for the given month using Switch statement
//		switch (month) {
//		// Cases 1, 3, 5, 7, 8, 10, and 12 give 31 days
//		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//			day = 31;
//			System.out.println("Year: " + year + "\t Month: " + month + "\t Day: " + day);
//			break;
//		
//		// Case 2 gives either 28 or 29 days
//		case 2: 
//			if (leap == true) {
//				day = 29;
//				System.out.println("Year: " + year + "\t Month: " + month + "\t Day: " + day);
//			} else {
//				day = 28;
//				System.out.println("Year: " + year + "\t Month: " + month + "\t Day: " + day);
//			}
//			break;
//		
//		// Cases 4, 6, 9, and 11 give 30 days
//		case 4: case 6: case 9: case 11:
//			day = 30;
//			System.out.println("Year: " + year + "\t Month: " + month + "\t Day: " + day);
//			break;
//		}
	}
}