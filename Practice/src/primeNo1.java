
public class primeNo1 {

	public static void main(String[] args) 
	{
       int num=18;
       int m=num/2;
       int cnt=0;
       if(num==0 || num==1)
         {
          System.out.println("Not Prime No");
          // break;
         }
       else
         {
             for (int i = 2; i <= m; i++) 
           {
		      if(num%i==0)
		        {
		    	  cnt++;
		        }
           }
         }
       
       if(cnt==0)
    	   System.out.println("Prime No");
       else
    	   System.out.println("Not Prime No");
	}

}
