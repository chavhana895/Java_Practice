package Exam;

public class Q7 {

	public static void main(String[] args) {
		int [][]a= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		
		int [][]b= {{11,12,13},
				{14,15,16},
				{17,18,29}};
		
		int [][]c=new int [a.length][b.length];
		int [][]d=new int [3][3];
		System.out.println("Multiplication is: ");
		for (int i = 0; i < 3; i++) 
		{
		  for (int j = 0; j < 3; j++) 
		  {
			  for (int k = 0; k < c.length; k++) 
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
		System.out.println();
		System.out.println("Substraction is: ");
		
		for (int i = 0; i < 3; i++) 
		{
		  for (int j = 0; j < 3; j++) 
		  {
			  
				d[i][j]=b[i][j]-a[i][j];
			  
		 }	
		}
		for (int i = 0; i < d.length; i++)
		{
			for (int j = 0; j < d[i].length; j++)
			{
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}

	}

}
