import java.util.Scanner;

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
		int year = 2000;
		int month = 12;
		int day;
		boolean leap;
		
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
		
		
		
		if (leap == true) {
		
			System.out.println(year + " is a leap year.");
		
		} else {
		
			System.out.println(year + " is not a leap year.");
		
		} 
		
		// https://www.programiz.com/java-programming/examples/leap-year
		
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			System.out.println("Year: " + year + "\t Month: " + month + "\t Day: " + day);
			break;
			
		case 2: 
			if (leap == true) {
				day = 29;
				System.out.println("Year: " + year + "\t Month: " + month + "\t Day: " + day);
			} else {
				day = 28;
				System.out.println("Year: " + year + "\t Month: " + month + "\t Day: " + day);
			}
			break;
			
		case 4: case 6: case 9: case 11:
			day = 30;
			System.out.println("Year: " + year + "\t Month: " + month + "\t Day: " + day);
			break;
		}

	}

}
