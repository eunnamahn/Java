
public class selectionSort {

	public static void main(String[] args) {
		
		int [] array = {52, 10, 26, 4, 16, 12, 9, 30, 7};
		int i, j, k;
		int minIndex, temp;
		int size = array.length;
		
		for (i = 0; i < size-1; i++)
		{
			minIndex = i;
			
			for (j = i+1; j < size; j++)
			{
				if (array[j] < array[minIndex])
				{
					minIndex = j;
				}
				
			}
			
			temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
				
			System.out.println("i: " + i);
			for (k = 0; k < size; k++)
			{
				System.out.print(array[k] + " ");
			}
			System.out.println();
			System.out.println();
			
		}

	}

}
