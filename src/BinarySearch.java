
public class BinarySearch {
	
	public static int findElement(int[]a , int l , int r , int num)
	{
		
		// {2, 3, 4, 10, 40,45,60}
		
		
		int mid = (l+r)/2; //5
		
		if(a[mid]==num)
		{
			return mid;
		}
		
		else if (a[mid]>num)
		{
			return findElement(a, l, mid-1, num);
		}
		
		else
		{
			return findElement(a, mid+1, r, num);
		}
		
	}

	
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40,45,60};

        int l = 0;
         int element=60;
         int length = arr.length;
         
        System.out.println(findElement(arr, l, length-1, element));
         
    

  }
}
    
    