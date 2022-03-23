package recursionday2_19_oct;

public class eqaulityOfArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,6,8};
		int b[]= {1,2,3,4,6,8};
		if(a.length==b.length)
		{
			int i=0;
			CheckArray(a,b,i);
		}
		else
			System.out.println("Length Length is not same");

	}

	private static void CheckArray(int[] a,int[]b, int i) {
		if(i<a.length)
		{
			if(a[i]==b[i])
			
				CheckArray(a,b, ++i);
			else
				System.out.println("its not same");
		}
		else
			System.out.println("its same");
		
	}

}
