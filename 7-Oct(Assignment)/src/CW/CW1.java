package CW;

public class CW1 {

	public static void main(String[] args) {
		double []a= {1,2,3,4,5,6,7,1};
		double sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			sum=sum+a[i];
		}
		System.out.println("sum is: "+sum);
		double average;
		average=sum/a.length;
		System.out.println("Average is: "+average);
	}

}
