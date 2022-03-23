package Exam;

public class Q6 {

	public static void main(String[] args) {
		
		int []a= {5,6,15,8,9};
		//int []b=new int[a.length];
		int i=a.length-1;
		int j=0;
		
		while(j<i)
		{
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];
			
			
			i--;j++;
		}
		
		for (int j2 = 0; j2 < a.length; j2++) 
		{
			System.out.print(a[j2]+" ");
		}
	}
}
