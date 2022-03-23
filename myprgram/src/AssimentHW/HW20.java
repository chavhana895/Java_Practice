package AssimentHW;

public class HW20 {
//Write a program calculate the average of the inner elements of an matrix(Variations)
	public static void main(String[] args) {
		int a[][]= { {1,2,3,4,5,6}
					,{1,2,3,4,5,6}
					,{1,2,3,4,5,6},
					 {1,2,3,4,5,6},
					 {1,2,3,4,5,6},
					 {1,2,3,4,5,6} };
		int sum=0;
		int counter=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if(i==0||j==0||i==5||j==5)
					System.out.print("");//a[i][j]+" ");
				else
				{
					//System.out.print("");
					sum=a[i][j]+sum;
					counter++;
				}
			}
			//System.out.println();
		}
		System.out.println("Avg :-"+sum/counter);
	}

}
