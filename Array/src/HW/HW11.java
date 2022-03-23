package HW;

public class HW11 {

	public static void main(String[] args)
	{
		int []a= {1,3,6,3,7,8,3,3,3,9,4,2};
		
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
		int k=0;
		for (int i = 0; i < a.length; i++)
		{
			int num=a[i];
			int countInB=0;
			for (int j = 0; j < b.length; j++)
			{
				if(num==b[j])
				countInB++;
			}
			if(countInB==0)
			{
				b[k]=num;
				k++;
			}
		}
		for (int i = 0; i < b.length; i++)
		{
		  System.out.print(b[i]+" ");	
		}
	}

}
