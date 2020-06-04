import java.util.Scanner;

public class iceCreamSelection {
	
	public enum IceCream {
		
		ALUMNISWIRL, DEATHBYCHOCOLATE, GRILLEDSTICKIES, MINTNITTANY, PEACHYPATERNO, SCHOLARSCHIP, WHITEOUT;
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Which flavor would you like to have?");
		String flavors = scan.next();
		
		String alumni = IceCream.ALUMNISWIRL.toString();
		
		if (flavors.equals(alumni)) {
			
			System.out.println("You have selected 'Alumni Swirl'");
			
		} else {
			System.out.println(alumni);
		}
		
	}

}
