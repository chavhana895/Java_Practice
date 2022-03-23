package practice;

public class findNoinArray {

	public static void main(String[] args) 
	{
	   int []a= {1,2,3,4,5,67};
	   int num=4;
	   int counter=0;
	   int index=0;
	   for (int i = 0; i < a.length; i++) 
	   {
		if(num==a[i])
		{
			counter++;
			index=i;
		}
	  }
	   if(counter==0)
		   System.out.println("No not Found");
	   else
		   System.out.println("No Found at: "+index);
	}

}
