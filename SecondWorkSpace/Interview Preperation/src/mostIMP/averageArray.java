package mostIMP;

public class averageArray {

	public static void main(String[] args) 
	{
      int []a= {1,2,3,4,5,6,7};
      int sum=0;
      for (int i = 0; i < a.length; i++) 
      {
		sum=sum+a[i];
	  }
      System.out.println("Sum is: "+sum);
      System.out.println("Average is: "+sum/a.length);
	}

}
