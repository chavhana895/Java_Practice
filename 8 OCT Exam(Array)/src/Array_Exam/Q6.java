package Array_Exam;

public class Q6 
{

	public static void main(String[] args) 
	{    int temp;
		int []a= {1,2,3,4};
		int []b= {5,6,7,8};
		int []c=new int[a.length+b.length];
		
      for (int i = 0; i < c.length; i++) 
		{
	      for (int j = 0; j < c.length; j++)
	      {
		       c[i]=a[i];
		  }
	    }
      
      for (int i = 0; i < c.length; i++) 
      {
		System.out.println(c[i]);
	}
	}
}
