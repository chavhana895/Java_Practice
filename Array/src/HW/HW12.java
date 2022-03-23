package HW;

public class HW12 {

	public static void main(String[] args)
	{
      int []a= {1,2,3,4,5,6,7,8,9,34,32,35,87,82,48,37};    
     int cnt1=0;
     int cnt2=0;
      for (int i = 0; i < a.length; i++)
      {
		if(i%2==0)
			cnt1++;
		else
			cnt2++;		
	  }
      int [] evenA=new int[a.length-cnt2];
      int k=0;
      int [] oddA=new int[a.length-cnt1];
      int k1=0;
      for (int i = 0; i < a.length; i++)
      {
		if(a[i]%2==0)
		{
			evenA[k]=a[i];
			k++;
		}
		else
		{
			oddA[k1]=a[i];
			k1++;
		}
	  }
      System.out.print("Even Numvers are: ");
      for (int i = 0; i < evenA.length; i++)
      {  
		System.out.print(evenA[i]+" ");
	  }
      System.out.println();
      System.out.print("Odd Numbers are: ");
      for (int i = 0; i < oddA.length; i++)
      {
		System.out.print(oddA[i]+" ");
	}
	}

}
