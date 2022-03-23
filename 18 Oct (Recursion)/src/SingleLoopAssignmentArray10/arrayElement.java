package SingleLoopAssignmentArray10;

public class arrayElement {

	public static void main(String[] args) {
		
		int []a= {23,35,46,56,13,74};
		int i=0;
		printMyElement(a,i);

	}

	private static void printMyElement(int[] a, int i) 
	{
		
		if(i<a.length)
		{
			System.out.println(a[i]);
			printMyElement(a,i+1);
		}
		
	}

}
