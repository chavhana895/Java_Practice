package Recursion;

public class SameoRNot {

	public static void main(String[] args) {
		
		int []a= {1,2,3,4};
		int []b= {5,6,7,8};
		
		if(a.length==b.length)
		{
			int i=0;
			checkTwoArray(a,b,i);
		}
		else
			System.out.println("len not same");
	}

	private static void checkTwoArray(int[] a, int[] b, int i) 
	{
	  if(i<a.length)
	  {  if(a[i]==b[i])
		  checkTwoArray(a, b, i+1);
	  else
		  System.out.println("Not Same");
	  }
	  else
		  System.out.println("same");
	}

}
