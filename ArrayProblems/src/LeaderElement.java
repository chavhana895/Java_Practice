
public class LeaderElement {

	public static void main(String[] args) 
	{
		int []a= {3,5,8,1,4,7,4,2};
		
		for (int i = 0; i < a.length; i++)
		{
			int cnt=0;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]<a[j])
					cnt++;
			}
			if(cnt==0)
				System.out.println("Leader Element: "+a[i]);
		}
		
	}

}
