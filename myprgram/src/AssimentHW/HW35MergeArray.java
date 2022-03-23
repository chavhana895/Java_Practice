package AssimentHW;

public class HW35MergeArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,6,7};
		int b[]= {0,9,8};
		int c[]=new int[a.length+b.length];
		int index=0;
		int indexb=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < c.length; j++)
			{
				
				if(index<a.length)
				{
					c[j]=a[index];
					index++;
				}
			}
			
		}
		for (int i =a.length; i < c.length; i++)
		{
			
				if(indexb<b.length)
				{
					c[i]=b[indexb];
					indexb++;
				}
			
		}
			
		for (int i = 0; i < c.length; i++)
		{
			System.out.println(c[i]);
		}

	}

}
