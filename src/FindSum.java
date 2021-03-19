
public class FindSum {
	
	public static void main(String[] args) {
		
		int arr [] = {11,15,6,8,9,10};
		int sum = 16;
		int n = arr.length;
		System.out.println(findPair(arr, sum, n));
	}
	
	public static boolean findPair(int[] a, int sum, int n)
	{
		int i ;
		
		for(i = 0 ; i < n ; i++)
		{
			if(a[i]>a[i+1])
			{
				break;
			}
		}
		
		int low = i+1;
		int high = i;
		
		//  {11,15,6,8,9,10};
		
		while(low!=high)
		{
			if(a[low]+a[high]==sum)
			{
				return true;
			}
			
			else if (a[low]+a[high]>sum)
			{
				high = (n + high-1)%n;
			}
			
			else if (a[low]+ a[high]< sum)
			{
				low = (low+1)%n;
			}
		}
		
		return false;
	
		}
	}
	

