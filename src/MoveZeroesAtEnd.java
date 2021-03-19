
public class MoveZeroesAtEnd {
	
	public static void moveMethod(int[] a)
	{
		int j =0;
		int count = 0;
		for(int i = 0 ; i< a.length; i++)
		{
			if(a[i]!=0)
			{
				a[j] = a[i];
				j++;
			}
			else
			{
				count++;
			}
		}
		
		while(count>0)
		{
			a[j]=0;
			j++;
			count --;
		}
		
		for(int x : a)
		{
			System.out.println(x);
		}
		
	}

	public static void main(String[] args) {
		int arr[] = {1,0,3,4,0,5,6,0,9};
		
		moveMethod(arr);
	}

}
