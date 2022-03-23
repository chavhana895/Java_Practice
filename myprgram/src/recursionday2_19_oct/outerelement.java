package recursionday2_19_oct;

public class outerelement {
	static int sum=0;
	static int counter=0;
	public static void main(String[] args) {
		int a[][]= {{1,2,3,4,5,6}
					,{1,2,3,4,5,6}
					,{1,2,3,4,5,6},
					{1,2,3,4,5,6},
					{1,2,3,4,5,6},
					{1,2,3,4,5,6}};
		
		outter(a,0,0);
			System.out.println("Avg :-"+sum/counter);
		}
	private static void outter(int[][] a, int j,int i) 
	{
		if(i<a.length)
		{
			if(j<a.length)
			{
			
				if(i==0||j==0||i==5||j==5)
					System.out.print("");//a[i][j]+" ");
				else
				{
				//System.out.print("");
					sum=a[i][j]+sum;
					counter++;
				}
				if(j==a.length)
				{
					j=0;
				}
			
			outter(a, ++j,i);
			}
		outter(a, j,++i);
		}
	}
}
