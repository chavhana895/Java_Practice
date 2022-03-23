package HW;

public class HW8 {

	public static void main(String[] args)
	{
	   int [] a = {15,57,19,38,47,53};
	   int cnt=a.length-2;
	   for (int i = 0; i < a.length; i++)
	   {
		for (int j = i+1; j < a.length; j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	   }
	   for (int i = 0; i < a.length; i++)
	   {
		   if(a[i]==a[cnt])
		System.out.println("Second Largest= "+a[i]);
	   }
	}

}
