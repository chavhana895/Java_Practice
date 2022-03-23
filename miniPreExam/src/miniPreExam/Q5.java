package miniPreExam;

public class Q5 {

	public static void main(String[] args) 
	{
	  int []a= {5,1,3,6,8,2,9,0,10};
	  int max=0,count=0;
	  int min=0;
	  int douncount=0;
	  for (int i = 0; i < a.length; i++) 
	  {
		if(a[i]<max)
		{
			max=a[i];
		   count++;
		   System.out.println(a[max]);
		}
		else
		{
		   min=a[max];
		   douncount++;
	    }
	  }
	  /*int []b=new int [a.length-count];
	  int []c=new int [count];
	  if(count==0)
		  for (int j = 0; j < a.length; j++) {
	
		  System.out.println(a[j]);
		  }*/
	}

}
