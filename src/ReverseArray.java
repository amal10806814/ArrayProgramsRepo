import java.nio.charset.MalformedInputException;

public class ReverseArray {
	
	public static void stringReverse(int[] a ){
		
		for(int i= 0 ; i < a.length/2 ;i++)
		{
			int temp = a[i];
			a[i]= a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
		
		for(int x : a)
		System.out.println(x);

	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		stringReverse(arr);
		
	}

}
