package searchingTechnique;
import java.util.Arrays;
public class buble 
{
	public static void main(String[] args)
	{
		int []a= {8,2,5,1,9,7,3,2};
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}