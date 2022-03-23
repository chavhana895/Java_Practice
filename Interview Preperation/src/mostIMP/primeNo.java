package mostIMP;

public class primeNo {

	public static void main(String[] args) 
	{
	   int n=14;
	   int m=n/2;
	   int cnt=0;
	   if(n==0 || n==1)
	   {
		   System.out.println("Not Prime No");
	   }
	   else
	   {
		   for (int i = 2; i <= m; i++) 
		   {
			 if(n%i==0)
			 {
				 cnt++;
			 }
		   }
	   }
	   if(cnt==0)
		   System.out.println(n+" is prime no");
	   else
		   System.out.println("Not prime no");
	}
}