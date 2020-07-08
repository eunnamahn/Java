public class bubbleSort {

	public static void main(String[] args) {
		
		int[] array = {52, 10, 26, 4, 16, 12, 9, 30, 7};
		int i, j, k;
		int temp;
		int arraySize = array.length;
		
		for (i = 0; i < arraySize-1; i++)
		{
			System.out.println("i: " + i);
			for (j = 0; j < arraySize-i-1; j++)
			{
				if (array[j] > array[j+1])
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
				for (k = 0; k < arraySize; k++)
				{
					System.out.print(array[k] + " ");
				}
				
				System.out.println();
				
			}
			System.out.println();
			
		}

	}

	
}