public class isPrime {

	public static void main(String[] args) {
		
		System.out.println("First few prime numbers: ");
		
		for (int number = 2; number <= 100; number++)
		{
			boolean isPrime = true;
			
			for (int i = 2; i <= number/2; i++)
			{
				if (number % i == 0)
				{
					isPrime = false;
					break;
				} 
			}
			
			if (isPrime == true)
			{
				System.out.println(number);
			}
				
			
		}
				
	}

}
