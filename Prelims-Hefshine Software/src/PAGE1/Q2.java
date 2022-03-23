package PAGE1;

public class Q2 
{

	public static void main(String[] args) 
	{
	  int [] []a = { {1,2,3,4,5},
			         {5,3,3,6,7},
			         {3,4,2,3,6},
			         {4,2,7,8,9},
			         {4,6,3,6,9}};
	  
	  int counter=0;
	  int sum=0;
	  for (int i = 0; i < a.length; i++) 
	  {
		for (int j = 0; j < a.length; j++) 
		{
			if(i==0 || j==0 || i==4 || j==4)
			{}
			else
			{
				sum=sum+a[i][j];
			    counter++;
			}
		}
	  }
	  System.out.println("Avg "+sum/counter);
	  }

	}


