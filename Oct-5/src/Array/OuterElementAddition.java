package Array;

public class OuterElementAddition {

	public static void main(String[] args) {
		int [][]b= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b[i].length; j++) 
			{
				if(i==0 || i==2 ||j==0 || j==2)
					sum=sum+b[i][j];
			}
		}
		System.out.println(sum);

	}

}
