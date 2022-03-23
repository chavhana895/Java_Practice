package Array_4_OctPractice;

public class Average {

	public static void main(String[] args) {
		int []a= {43,46,32,45,6,86,3};
		int sum ;
		int Average;
		int temp=0;
		for (int i = 0; i < a.length; i++) 
		{
		    sum=a[i]+temp;
		    temp=sum;
		
		}
		Average=temp/a.length;
		System.out.println(Average);

	}

}
