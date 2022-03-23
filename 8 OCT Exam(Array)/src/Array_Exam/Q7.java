package Array_Exam;

public class Q7 {

	public static void main(String[] args) {
		int []a= {5,1,3,6,8,2,9,0,10};
		int count=0;
		int min=0;
		int max=a.length-1;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(a[i]<a[j])
				count++;
			}
		}
		
	}

}
