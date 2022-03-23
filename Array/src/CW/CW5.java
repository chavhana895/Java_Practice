package CW;

public class CW5 {

	public static void main(String[] args)
	{
		int[]a= {-4,8,6,-5,6,-2,1,2,3,-11};
		int temp;
		for (int i = 0; i < a.length; i++) 
		{
		 for (int j = 0; j < a.length; j++) 
		 {
		 if(j>0 && a[j]>0 && a[j-1]<0)
		 {
			 temp=a[j];
			 a[j]=a[j-1];
			 a[j-1]=temp;
			 j--;			 
		 } 		 
		}
		System.out.println(a[i]);
      }
	}
}
