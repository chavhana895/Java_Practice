package Array;

public class breakLoop {

	public static void main(String[] args) {
		int[]a= {21,53,42,83,41,53,76};
		int num=53;
		int counter=0;
		int index=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				counter++;
				index=i;
				break;
			}
		}
		if (counter==0)
			System.out.println("Not Found");
		else
			System.out.println("Found at Index: "+index);

	}

}
