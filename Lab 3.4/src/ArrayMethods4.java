/*
 * Miriam Monroe & Ramisha Sarwar
 * Lab 3.4
 */
public class ArrayMethods4
{
	
	public static void main(String[] args)
	{
		int list[] = {5, 9, 3, 4, 2, 10};
		quickSort(list, 0, 5);
		printArr(list);
		//System.out.println();
	}
	
	public static int partition(int[] list1, int front, int back)
	{
		int pivot = list1[back];
		int idx = front-1;
		for(int j = front; j < back; j++)
		{
			if(list1[j]<= pivot)
			{
				idx++;
				
				swap(list1, idx, j);
			}
		}
		swap(list1, idx+1, pivot);
		return idx+1;
	}
	
	public static void quickSort(int[] list1, int front, int back)
	{
		if(back < front)
		{
			int x = partition(list1, front, back);
			quickSort(list1, front, x-1);
			quickSort(list1, x+1, back);
		}
	}
	
	public static void customSort(int[] list)
	{
		
	}
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void printArr(int[] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
