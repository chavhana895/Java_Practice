package Q7;

public class binary {

	public static void main(String[] args)
	{
	 int []a= {1,2,3,4,5,6,7};
	 int num=4;
	 int min=0;
	 int max=a.length-1;
	 LoopI(0,a,num,min,max);
	}

	private static void LoopI(int i, int[] a, int num,int min,int max)
	{
		 if(i<a.length)
		 {
			
			 int mid=(a[min]+a[max])/2;
			 
			 if(num==a[mid])
			 {
				 System.out.println("Found at index: "+i);
				 return;
			 }
			 if(num>min)
				 min=mid+1;
			 else 
				 max=mid-1;
			 LoopI(i+1, a, num,min,max);
		 }
	}

}
