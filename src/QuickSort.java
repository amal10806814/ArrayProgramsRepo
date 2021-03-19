import java.util.Arrays;

	public class QuickSort {

        public static void main(String[] args)
        {
            // This is unsorted array
            Integer[] array = new Integer[] {10, 80, 30, 90, 40, 50, 70}; //7

            // Let's sort using quick sort
            quickSort( array, 0, array.length - 1 );

            // Verify sorted array
            System.out.println(Arrays.toString(array));
        }
        
        public static void quickSort(Integer[] arr , int low , int high)
        {
        	
        	int mid = low + (high -low)/2;  // 7/2 = 3
        	int pivot = arr[mid]; // 90
        	
        	//make left pivot n right pivot
        	
        	int i = low , j = high;
        	
        	while(i<=j)  //4<5
        	{
        		
        		while(arr[i]< pivot)
        		{
        			i++;
        		}
        		
        		while(arr[j]> pivot)
        		{
        			j--;
        		}
        	
        		if(i<=j) 
        		{
        			swap(arr, i, j);  
        			i++;  
        			j--;  
        		}
        		
        	}
        		if(low<j)  //
        		{
        			quickSort(arr, low, j);
        		}
        		
        		if(high>i)
        		
        		{
        			quickSort(arr, i, high);
        		}
        	}
        	
   
        
        public static void swap (Integer arr[], int x, int y)
        {
        	int temp = arr[x];
        	arr[x]	=arr[y];
        	arr[y]=temp;
        }
       
}
