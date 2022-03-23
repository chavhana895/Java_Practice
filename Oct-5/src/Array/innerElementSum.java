package Array;

public class innerElementSum {

	public static void main(String[] args) {
		int [][]b= {{1,2,3,6},
				   {4,5,6,8},
				   {7,8,9,9},
				   {3,5,6,2}};
		int sum=0;
		int counter=0;
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				if(i==0 || i==3 || j==0 || j==3)
				{}
				else
				{
					sum=sum+b[i][j];
				    counter++;
				}
			}
		}
		System.out.println(sum/counter);

	}

}
