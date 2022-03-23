package Array;

public class MultiplicationOfMatrix {

	public static void main(String[] args) {
		int [][]a= {{1,2,3},
				{4,5,6}};
		int [][]b= {{1,2},
				{4,5},
				{7,8}};
		
		int [][]c=new int[2][2];
		
		/*c[0][0]=a[0][0]*b[0][0]+a[0][1]*b[1][0]+a[0][2]*b[2][0];
		c[0][1]=a[0][0]*b[0][1]+a[0][1]*b[1][1]+a[0][2]*b[2][1];
		c[1][0]=a[1][0]*b[0][0]+a[1][1]*b[1][0]+a[1][2]*b[2][0];
		c[1][1]=a[1][0]*b[0][1]+a[1][1]*b[1][1]+a[1][2]*b[2][1];  */
		
		for (int i = 0; i<2; i++) 
		{
		for(int j=0;j<2;j++)
		{
			for(int k=0;k<3;k++)
			{
				c[i][j]=c[i][j]+a[i][k]*b[k][j];
			}
		}
		}
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c[i].length; j++) 
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		}
	}


