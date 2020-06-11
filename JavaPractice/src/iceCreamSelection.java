import java.util.Scanner;

public class iceCreamSelection {
	
	public enum IceCream {
		
		// Each constructor takes String.
		ALUMNISWIRL("a"), 
		DEATHBYCHOCOLATE("b"), 
		GRILLEDSTICKIES("c"), 
		MINTNITTANY("d"), 
		PEACHYPATERNO("e"), 
		SCHOLARSCHIP("f"), 
		WHITEOUT("g");
		
		private final String shortKey;
		
		IceCream(String shortKey) {
			
			this.shortKey = shortKey;
		
		}
		
		public String getShortKey() {
			
			return this.shortKey;
		
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Berkey Creamery!");
		System.out.println("********************************");
		System.out.println("Type 'a' for 'Alumni Swirl'.");
		System.out.println("Type 'b' for 'Death By Chocolate'.");
		System.out.println("Type 'c' for 'Grilled Stickies'.");
		System.out.println("Type 'd' for 'Mint Nittany'.");
		System.out.println("Type 'e' for 'Peachy Paterno'.");
		System.out.println("Type 'f' for 'Scholar's Chip'.");
		System.out.println("Type 'g' for 'White Out'.");
		System.out.println("********************************");
		System.out.println("Which flavor would you like to have?");
		
		// User is asked to enter one flavor.
		String flavors = scan.next();
		scan.close();
	
		// Prints out the flavor that user has entered using If Statement.
		if (flavors.equals(IceCream.ALUMNISWIRL.getShortKey())) {
			
			System.out.println("You have selected 'Alumni Swirl'.");
			
		} else if (flavors.equals(IceCream.DEATHBYCHOCOLATE.getShortKey()))  {
			
			System.out.println("You have selected 'Death By Chocolate'.");
			
		} else if (flavors.equals(IceCream.GRILLEDSTICKIES.getShortKey()))  {
			
			System.out.println("You have selected 'Grilled Stickies'.");
		
		} else if (flavors.equals(IceCream.MINTNITTANY.getShortKey()))  {
			
			System.out.println("You have selected 'Mint Nittany'.");
		
		} else if (flavors.equals(IceCream.PEACHYPATERNO.getShortKey()))  {
			
			System.out.println("You have selected 'Peachy Paterno'.");
		
		} else if (flavors.equals(IceCream.SCHOLARSCHIP.getShortKey()))  {
			
			System.out.println("You have selected 'Scholar's Chip'.");
		
		} else {
			
			System.out.println("You have selected 'White Out'.");
		
		} 
	
	}

}