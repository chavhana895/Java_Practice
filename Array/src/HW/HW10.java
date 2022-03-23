package HW;
public class HW10 {
	public static void main(String[] args)
	{
	  int [][] a = {{2,3,32},{8,4,2},{3,1,3}};
	  int cnt=0;
	  for (int i = 0; i < a.length; i++)
	  {
		for (int j = 0; j < a.length; j++)
		{
		  if(a[i][j]>cnt)
		  {
			  cnt=a[i][j];
		  }
		}
	  }
	  System.out.println("Maximum No: "+cnt);
	}
}
