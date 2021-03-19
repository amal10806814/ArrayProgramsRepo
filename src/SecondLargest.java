import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int [] a = {44,31,71,90,16 ,10, 5};
		
		if(a.length<2)
		{
			return;
		}
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < a.length ; i++) //2
		{
			if(a[i]>first)
			{
				second = first;
				first = a[i]; //90
				 //71
			}
			
			else if ( second < a[i] && first != second)
			{
				second = a[i]; //32
			}
			
		}
		
		System.out.println(second);
			
	}

}
