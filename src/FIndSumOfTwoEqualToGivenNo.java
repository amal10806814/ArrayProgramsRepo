
public class FIndSumOfTwoEqualToGivenNo {
	
	public static boolean findSum(int[]arr , int x, int n)
	{
		int i;
		
		for( i = 0 ; i < arr.length; i++)
		{
			if(arr[i]>arr[i+1])
			{
				break;
			}
		}
		
		int low = i+1;
		int high = i;
		
		while(low!=high)
		{
			if(arr[low]+arr[high]==x)
			{
				return true;
			}
			
			else if (arr[low]+arr[high]>x)
			{
				high = (n+ high-1)%n;
			}
			
			else
			{
				low = (low+1)%n;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		int[] a = {18,20,5,8,12,15,17};
		
		int sum = 17;
		int n = a.length;
		
		System.out.println(findSum(a, sum, n));
		
	
	}

}
