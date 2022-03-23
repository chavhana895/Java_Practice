package Oct_19_Recursion_Exam;

public class Q3 {

	public static void main(String[] args) 
	{
		int []a= {35,12,42,23,28,78};
		int min=0;
		int num=12;
		int max=a[a.length-1];
				loopI(a,min,max,num);	
	}

	private static void loopI(int[] a, int i, int min, int max) 
	{
	  if(max<min)
	  {
	    System.out.println("Not Found");
		  return 0;
	  }
		  if(a[i]<min)
		  {   
			  min=a[i];
			  loopI(a, i+1, min,max);
		  }
		  
		 // loopI(a, i+1, min);
		  System.out.print(a[min]+" ");
	  }
	}

	private static void loopJ(int[] a, int i, int j, int min) 
	{
	   if(j<a.length)
	   { 
		  loopJ(a, i, j+1,min); 
	   }
	}

}
