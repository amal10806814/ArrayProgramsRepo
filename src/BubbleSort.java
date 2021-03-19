
public class BubbleSort {
	
	public static void bubbleSort(int[] arr)
	{
		for(int i = 0 ; i < arr.length ; i ++)
		{
			for(int j =0; j<arr.length-i-1 ; j++)  //2 3 5 1 8 4 10
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int x : arr)
		{
			System.out.println(x);
		}
	}
	
	
	
	public static void main(String[] args) {
		int [] a = {5,2,3,8,1,10,4};
		
		bubbleSort(a);
	}

}
