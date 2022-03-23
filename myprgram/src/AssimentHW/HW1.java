package AssimentHW;

public class HW1 {

	public static void main(String[] args) {
		int a[]= {11,22,33,44,55,22};
		int num=22,counter=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==num)
				counter++;
		}
		if(counter!=0)
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
		//Write a program to find the index of an arrayelement
	System.out.println("_____________________________");
	
	
	
	
	
	
	
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==num)
				System.out.println("Index : "+i);
		}
		
		System.out.println("_____________________________");
		
		
		
		
		
		
		/// 
		
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==num)
			{
				index=i;
				counter++;
				break;
			}
		}
		if(counter!=0)
			System.out.println("Found at index "+index);
		else
			System.out.println("Not Found");
	}

}
