import java.util.Arrays;

public class shiftToLeft {

	public static void main(String[] args)
	{
	  int []a= {3,4,9,1,5,8,4,2};
	  int temp=a[0];
	  
	  for (int i = 0; i < a.length-1; i++)
	  {
		 a[i]=a[i+1];
	  }
	  a[a.length-1]=temp;
	  
	System.out.println(Arrays.toString(a));
	}

}
