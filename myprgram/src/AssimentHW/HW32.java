package AssimentHW;

public class HW32 {

	public static void main(String[] args) {
		int a[][]= {{1,1,1},{1,1,1},{1,1,1}};
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if( j-i==0)
				{
					System.out.print(a[i][j]+a[i][j]+" ");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
