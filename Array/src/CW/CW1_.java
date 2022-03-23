package CW;

public class CW1_
{

	public static void main(String[] args)
	{
		int [][]a= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int cnt=0;
		int sum=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j =0; j < a.length; j++)
			{
				sum=sum+a[i][j];         //works only with square Matrix
				cnt++;
			}
		}
		System.out.println("Sum is: "+sum);
		System.out.println("Avg is: "+sum/cnt);
	}

}
