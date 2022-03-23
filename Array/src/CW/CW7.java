package CW;

public class CW7 
{
	public static void main(String[] args)
	{
      int []a= {1,2,3,4,5,6,7};
      int k=9;
      int cnt=0;
      for (int i = 0; i < a.length; i++) 
      { 
		for (int j = i+1; j < a.length; j++) 
		{ 
			if(a[i]+a[j]==k)             // CW7 Not Done
			{
				System.out.println("pair is ("+a[i]+","+a[j]+")");
				cnt++;
			}
		}
	  }
      System.out.println();
      System.out.println("Pairs are: "+cnt);
	}
}
