package Recursion;

public class removeMorethanTwo_repetedN0 {

	static int []n= {1,2,4};
	static int []a= {1,1,1,1,1,2,2,3,4};
	
	public static void main(String[] args) 
	{
		loopN(0);
		int i=0;
		print(i);
		
	}
	private static void print(int i) 
	{
	  if(i<a.length)
	  {
		  System.out.print(a[i]+" ");
		  print(i+1);
	  }
	}
	private static void loopN(int i) 
	{
	  if(i<n.length)
	  {
		  int removeWalaElement=n[i];
		  int count=removeCount(removeWalaElement,0,0);
		  int []newA=new int[a.length-count];
		  int removeCount=0;
		  int newAIndex=0;
		  int j=0;
		  transferElements(newA,newAIndex,j,removeCount,removeWalaElement);
		  a=newA;
		  loopN(i+1);
	  }
	}
	private static void transferElements(int[] newA, int newAIndex, int j, int removeCount, int removeWalaElement) 
	{
		if(j<a.length)
		{
			if(a[j]!=removeWalaElement || removeCount>=2)
				newA[newAIndex++]=a[j];
			else
				removeCount++;
			transferElements(newA, newAIndex, j+1, removeCount, removeWalaElement);
		}
	}
	private static int removeCount(int removeWalaElement, int j, int count) {
		if(j<a.length)
		
		{ 
			if(count<2)
			{
				if(removeWalaElement==a[j])
					count++;
				int pudhchyachaCount=removeCount(removeWalaElement, j+1,count);
				return pudhchyachaCount;
			}
			else 
				return count;
		}
		return count;
	}

}
