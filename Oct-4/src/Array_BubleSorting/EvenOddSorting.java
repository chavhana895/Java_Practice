package Array_BubleSorting;

public class EvenOddSorting {

	public static void main(String[] args) {
		int []a= {3,5,6,4,8,1,7};
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
	System.out.println("____even No___");
	for (int i= 0; i < evenCount;i++) 
	{
		System.out.print(even[i]+" ");
	}
	System.out.println();
	System.out.println("_____odd no____");
   for(int i=0;i<odd.length;i++)
	System.out.print(odd[i]+" ");
	}
	}

