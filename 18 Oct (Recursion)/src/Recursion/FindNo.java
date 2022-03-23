package Recursion;

public class FindNo {

	public static void main(String[] args) 
	{
		int []a= {3,5,11,7,9};
		int num=11;
		int i=0;
		findNum(a,num,i);
	}

	private static void findNum(int[] a, int num, int i) 
	{
		if(i<a.length)
		{
			if(a[i]==num)
				System.out.println("found at: "+i);
			else
				findNum(a, num, i+1);
		}
		else
			System.out.println("Not Found");
		
	}

}
