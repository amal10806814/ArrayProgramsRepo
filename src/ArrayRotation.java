

public class ArrayRotation {
	
	public static void rotationMethod(int[] a, int x )
	{
		for(int i = 0 ; i<x ; i++)
		{
			int temp = a[0];
			
			for(int j = 0 ; j < a.length-1 ; j++)
			{
				a[j]= a[j+1];
			}
			a[a.length-1] = temp;
		}
		
		for(int k : a)
		{
			System.out.println(k);
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		int d = 2;
		
		rotationMethod(arr, d);
		
		
	}

}
