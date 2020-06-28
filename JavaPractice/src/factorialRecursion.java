public class factorialRecursion {

	public static void main(String[] args) {
		
		int n = 6;
		System.out.println("For n = " + n + ": ");
		System.out.println(fib(n));

	}
	
	static int fib(int n) {
		
		if (n == 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		} else {
			return fib(n-1) + fib(n-2);
		}
				 
	}

}
