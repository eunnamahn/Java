public class insertionSort {

	public static void main(String[] args) {

		int [] array = {52, 10, 26, 4, 16, 12, 9, 30, 7};
		int i, j, k;
		int temp;
		int size = array.length;
		
		for (i = 1; i < size; i++)
		{
			System.out.println("i: " + i);
			temp = array[i];
			j = i-1;
			
			while ((j >= 0) && (temp < array[j]))
			{
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = temp;
			
			for (k = 0; k < size; k++)
			{
				System.out.print(array[k] + " ");
			}
			System.out.println();
			System.out.println();
		}
		
	}

}