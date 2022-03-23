package recursionday2_19_oct;

public class maximumof_matrix {

	static int a[][]= {{1,2,3},{8,6,4},{3,5,7}};
	static int max=Integer.MIN_VALUE;
	public static void main(String[] args) 
	{
		
		findmaximumnoin(0,0);
		System.out.println(max);
		
	}
	private static void findmaximumnoin(int i,int j) {
		if(i<a.length)
		{
			if(j<a.length)
			{
				if(a[i][j]>max)
					max=a[j][i];
			}
			j++;
			if(j==a.length-1)
			{
				j=0;
				i++;
			}
			findmaximumnoin(i, j);
		}
		
	}

}
