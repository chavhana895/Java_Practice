package Recursion;

public class AdditionArray {

	public static void main(String[] args) {
		
		int[]a= {3,5,7,9};
		int i=0;
		int result=addArrayElement(a,i);
		System.out.println(result);
		

	}

	private static int addArrayElement(int[] a, int i) 
	{
		if(i<a.length)
		{
			int sum=addArrayElement(a, i+1);
	        return a[i]+sum;
					
		}
		return 0;
	}

}
