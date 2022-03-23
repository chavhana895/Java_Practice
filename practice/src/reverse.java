
public class reverse {

	public static void main(String[] args) 
	{
		
		int []a= {22,44,5,35,8,2,44};
		int i=0;int j=0;
		reverseArray(a,i,j);
	}

	private static void reverseArray(int[] a, int i, int j) 
	{
		if(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			reverseArray(a, ++i, --j);
		}
	
	     for (int j2 = 0; j2 < a.length; j2++) 
	     {
			System.out.println(a[j2]);
		}
		
	}

}
