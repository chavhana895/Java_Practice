package recursionday2_19_oct;

public class LedderElement {

	
	public static void main(String[] args) {
		int a[]= {1,4,9,3,8,4,1};
		int i=0;
		
		loopi(a,i);
	}

	private static void loopi(int[] a, int i) 
	{
		if(i<a.length)
		{
			int j=i+1;
			int counter=0;
			loopij(a,j,i,counter);
			loopi(a, ++i);
		}
		
	}

	private static void loopij(int[] a, int j,int i,int counter)
	{
		if(j<a.length)
		{
			if(a[j]>a[i])
			{
				counter++;
			}
			loopij(a, ++j, i,counter);
		}
		else
			if(counter==0)
				System.out.println(a[i]);
		
	}

}
