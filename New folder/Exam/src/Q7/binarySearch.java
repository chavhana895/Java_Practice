package Q7;

public class binarySearch {

	static int []a= {1,2,3,4,5,6};
	public static void main(String[] args)
	{
	 int num=3;
	 LoopI(num,0);
	}
	private static void LoopI(int num, int i)
	{
		if(i<a.length)
		{
			if(a[i]==num)
				System.out.println("Found at: "+i);
			LoopI(num, i+1);
		}
	}

}
