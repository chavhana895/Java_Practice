
public class greaterCnt {

	public static void main(String[] args)
	{
		int[]a= {67,1,2,56,3,15,4,5,6,7,17,8,9,10};
		
		for (int i = 0; i < a.length; i++)
		{
			int greatercnt=0;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]<a[j])
					greatercnt++;
			}
			if(greatercnt==0)
				System.out.print(a[i]+" ");
		}
	}
}