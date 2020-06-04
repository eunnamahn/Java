import java.util.Scanner;

public class iceCreamSelection {
	
	public enum IceCream {
		
		ALUMNISWIRL, DEATHBYCHOCOLATE, GRILLEDSTICKIES, MINTNITTANY, PEACHYPATERNO, SCHOLARSCHIP, WHITEOUT;
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Berkey Creamery!");
		System.out.println("Which flavor would you like to have?");
		String flavors = scan.next();
		scan.close();
		
		String alumni = IceCream.ALUMNISWIRL.toString();
		String death = IceCream.DEATHBYCHOCOLATE.toString();
		String grilled = IceCream.GRILLEDSTICKIES.toString();
		String mint = IceCream.MINTNITTANY.toString();
		String peachy = IceCream.PEACHYPATERNO.toString();
		String scholars = IceCream.SCHOLARSCHIP.toString();
		String white = IceCream.WHITEOUT.toString();
		
		
		if (flavors.equals(alumni)) {
			
			System.out.println("You have selected 'Alumni Swirl'.");
			
		} else if (flavors.equals(death))  {
			
			System.out.println("You have selected 'Death By Chocolate'.");
			
		} else if (flavors.equals(grilled))  {
			
			System.out.println("You have selected 'Grilled Stickies'.");
		
		} else if (flavors.equals(mint))  {
			
			System.out.println("You have selected 'Mint Nittany'.");
		
		} else if (flavors.equals(peachy))  {
			
			System.out.println("You have selected 'Peachy Paterno'.");
		
		} else if (flavors.equals(scholars))  {
			
			System.out.println("You have selected 'Scholar's Chip'.");
		
		} else {
			
			System.out.println("You have selected 'White Out'.");
		
		} 
		
	}

}
