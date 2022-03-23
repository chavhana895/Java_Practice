package AssimentHW;
//Write a program to find and display reverse of an array
//without using thirdvariable.
public class HW6 {

	
	public static void main(String[] args)
	{
		int a[]= {1,4,2,3,4,5};
		
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];
			i++;
			j--;
			
		}//a=a+b;
		//b=a-b;
		//a=a-b;
		
		System.out.println("Rverse An Array ");
 		for (int j2 = 0; j2 < a.length; j2++)
		{
			System.out.println(a[j2]);
		} 

	}

}
