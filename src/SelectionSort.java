import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {64, 25, 12, 22, 11};  //11 12 22 25 64
		
		 for(int i = 0 ; i< a.length ; i++)
		 {
			 int min = i ; //3
			 
			 for(int j = i+1 ; j< a.length ;j++)  //4
			 {
				 
				 if(a[min]> a[j])  //4 ,  12 ,11
				 {
					 min = j;  //2
				 }
				
			 }
			 
			 int temp = a[i];  //64
			 
			 a[i] = a[min];  //11
			 a[min] = temp;  //64
		 }
		 
		 System.out.println(Arrays.toString(a));
		 for(int x : a)
		 {
			 System.out.println(x);
		 }

	}

}
