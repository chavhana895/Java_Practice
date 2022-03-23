package AssimentHW;
//Write a program to print the addition of two matrices. (Variations)
public class HW21 {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{9,8,7}};
		int b[][]= {{1,2,3},{4,5,6},{9,8,7}};
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				System.out.print((a[i][j]+b[i][j])+" ");
			}
			System.out.println();
		}
	}

}
