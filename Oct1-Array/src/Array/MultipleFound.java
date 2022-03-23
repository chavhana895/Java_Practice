package Array;

public class MultipleFound {

	public static void main(String[] args) {
		
		int[]a= {21,53,42,83,53,42,41,53,76};
		int num=53;
		int counter=0;
		int index=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				counter++;
				System.out.println("Found at Index: "+i);

			}
		}
		if (counter==0)
			System.out.println("Not Found");
		

	}

}
