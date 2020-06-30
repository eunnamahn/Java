public class bubbleSort {

	public static void main(String[] args) {
		
		int[] array = {52, 10, 26, 4, 16, 12, 9, 30, 7};
		int temp;
		
		for (int i = 0; i < array.length-1; i++)
		{
			System.out.println("i: " + i);
			for (int j = 0; j < array.length-i-1; j++)
			{
				if (array[j] > array[j+1])
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
				for (int k = 0; k < array.length; k++)
				{
					System.out.print(array[k] + " ");
				}
				
				System.out.println();
				
			}
			System.out.println();
			
		}

	}

}