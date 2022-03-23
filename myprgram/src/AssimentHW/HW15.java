package AssimentHW;
//15) Write a program to print all the LEADERS in thearray
public class HW15 {

	public static void main(String[] args)
	{
		
		int a[]= {1,7,5,3,43,5,8,6,4};
		
		for (int i = 0; i < a.length; i++)
		{
			int cnt=0;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]<a[j])
					cnt++;
			}
			if(cnt==0)
			{
				System.out.println(a[i]);
			}
		}
		
		}

}
