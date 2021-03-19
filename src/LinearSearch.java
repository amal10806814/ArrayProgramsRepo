import java.awt.LinearGradientPaint;

public class LinearSearch {
	
	public static boolean linearSearch(int[] a , int x)

	{
		for(int i = 0 ; i < a.length ; i ++)
		{
			if(a[i]==x)
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,80,30,60,50,110,100,130,170};
		int num = 100;
		
		System.out.println(linearSearch(arr , num));
	}

}
