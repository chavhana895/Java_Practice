package HW;

public class HW18 {

	public static void main(String[] args)
	{
	   int [] a = {23,21,17,39,42,98,35,26,14};
	   
	   int cnt=0;
	   int cnt1=0;
	   for (int i = 0; i < a.length; i++) 
	   {
		if(a[i]%2==0)
			cnt++;
		else
			cnt1++;
	   }
	   
	   int [] evenA=new int[a.length-cnt1];
	   int k=0;
	   int [] oddA=new int[a.length-cnt];
	   int k1=0;
	   for (int i = 0; i < a.length; i++)
	   {
		if(a[i]%2==0)
		{
			evenA[k]=a[i];
			k++;
		}
		else
		{
			oddA[k1]=a[i];
			k1++;
		}
	   }
	   for (int i = 0; i < evenA.length; i++) 
	   {
		System.out.print(evenA[i]+" ");
	   }
	   for (int i = 0; i < oddA.length; i++) 
	   {
		System.out.print(oddA[i]+" ");
	   }
	}

}
