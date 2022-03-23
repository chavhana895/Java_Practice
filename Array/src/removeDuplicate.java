import java.util.Arrays;

public class removeDuplicate {

	public static void main(String[] args)
	{
		int []a= {1,4,2,5,2,8,6,0,3,7,10,3,10,5,1,8,9};
		int cnt=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				    break;
				}
			}
		}
		
		int []b=new int [a.length-cnt];
		int index=0;
		for (int i = 0; i < a.length; i++)
		{
			int cntB=0;
			for (int j = 0; j < b.length; j++)
			{
			   if(a[i]==b[j])
				   cntB++;
			}
			if(cntB==0)
				b[index++]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}

}
