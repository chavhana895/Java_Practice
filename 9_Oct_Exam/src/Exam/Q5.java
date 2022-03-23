package Exam;

public class Q5 {

	public static void main(String[] args) {
		int []a= {1,2,3};
		int []b= {1,2,3};
		
		int count=0;
		if(a.length==b.length)
		{
			for (int i = 0; i < b.length; i++) 
			{
				if(a[i]==b[i])
				{
					count++;
				}
				
			}
			if(count==a.length)
			{
				System.out.println("Equal");
			}
			else
				System.out.println("Not Equal");
		}
		else
			System.out.println("Not Equal");
	}

}
