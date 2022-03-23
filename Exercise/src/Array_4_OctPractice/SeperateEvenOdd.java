package Array_4_OctPractice;

public class SeperateEvenOdd {

	public static void main(String[] args) {
		int []a= {21,13,42,53,62,89,70,57};
		int evenCount=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
				evenCount++;
		}
		int[] even=new int[evenCount];
		int[]odd=new int[a.length-evenCount];
		int j=0; int k=0;
		for (int i = 0; i < a.length; i++) 
		{
			
				if(a[i]%2==0)
				{
					even[j++]=a[i];
				}
				else
				{
					odd[k++]=a[i];
				}
		}
			System.out.println("even No");
			for (int i= 0; i < evenCount;i++) 
			{
				System.out.println(even[i]);
			}
			System.out.println("odd no");
		   for(int i=0;i<odd.length;i++)
			System.out.println(odd[i]);
	
	}

}
