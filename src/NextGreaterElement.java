
public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [] a = {5, 8, 3,9,10,6,12};
	
	for(int i= 0 ; i < a.length ; i++)
	{
		int return_value = -1 ;
		for(int j = i+1 ; i < a.length-1; j++)
		{
			if(a[i]< a[j]){
				
				return_value = a[j];  
				break;
			}
			
		}
		System.out.println(a[i]+ " "+ return_value);
	}
		
	}
	

}
