package AssimentHW;



public class CW7uniqPair {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4};
		int count=0;
		// remove digit logic
		for (int i = 0; i < a.length; i++)
		{
			for (int j =i+1; j < a.length; j++)
			{
				if(a[i]==a[j])
				{
					count++;
					break;
				}
			}
		}
		int k=0;
	
		int b[]=new int[a.length-count];
		for (int i = 0; i < a.length; i++)
		{
			count=0;
			for (int j = 0; j < b.length; j++)
			{
				if(b[j]==a[i])
				{
						count++;
						break;
				}
			}
			if(count==0)
				b[k++]=a[i]; 
			
		}
		count=0;
		// pair logic
		for (int i = 0; i < b.length; i++)
		{
			for (int j =0; j<b.length; j++) 
			{
					count++;
					System.out.println(b[i]+"  "+b[j]);
				
			}
		
		}
		System.out.println("Pair :-" +count);
	}
}
