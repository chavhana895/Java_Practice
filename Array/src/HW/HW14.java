package HW;

public class HW14 {

	public static void main(String[] args)
	{
      int []a= {1,2,3,4};
      int []b= {1,2,6,4};
      
      int cnt=0;
      
      if(a.length!=b.length)
         System.out.println("Not Equal");
      else
      {
        for (int i = 0; i < a.length; i++)
        {
	    	for (int j = 0; j < b.length; j++)
	     	{
				if(a[i]==b[j])
					cnt++;
		     }
	  }
      if(cnt==a.length)
    	  System.out.println("Equal");
      else
    	  System.out.println("Not Equal");
	}
	}
}
