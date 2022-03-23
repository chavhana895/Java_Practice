package Array_4_OctPractice;

public class HW20_Average {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9,10};
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
