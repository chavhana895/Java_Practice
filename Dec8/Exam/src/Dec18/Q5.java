package Dec18;

public class Q5 {

	static int []a = {1,2,3,4};
	static int []b = {1,2,3,4,3,9,4,12,5};
	static int cnt=0;
	public static void main(String[] args) 
	{
	  loopI(0);
	}
	private static void loopI(int i) 
	{
	   if(a.length==b.length)
	   {
		   if(a[i]==b[i])
		   {
			   cnt++;
			   System.out.println("same");
		   }
		   loopI(i+1);
		   
	   }
	   else
		   System.out.println("Not Same");
	  
	}

}
