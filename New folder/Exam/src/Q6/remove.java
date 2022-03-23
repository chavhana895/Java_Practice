package Q6;

public class remove {

	public static void main(String[] args) 
	{
		int []a= {1,1,1,1,1,2,2,3,4};
		int []n = {1,2,4};
		
		
		int cnt=0;
		for (int i = 0; i < n.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if(n[i]==a[j] && cnt<2 )
				{
					cnt++;
				
				}
			}
			
			
		}
		int []result=new int[a.length-cnt];
		for (int i = 0; i < result.length; i++) 
		{
		System.out.println(result[i]);	
		}
	}

}
