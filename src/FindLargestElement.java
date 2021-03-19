

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindLargestElement {
	
	public static void LargestElement(int [] a)
	{
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		for(int i =0 ; i<a.length; i++)
		{
			al.add(a[i]);
		}
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		System.out.println(al.size());
		
		System.out.println(al.get(al.size()-1));
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,3,8,5,9,6,2};
		LargestElement(arr);
		

	}

}
