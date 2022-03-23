package HW;

public class HW16 {

	public static void main(String[] args)
	{
	  int [] a = {23,42,13,3,17,21};
	  
	  int max=0;
	  int min=0;
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
		System.out.print("Diff Bet Largest and Smallest: "+(a[a.length-1]-a[0]));
		break;
	  }
	}

}
