package Array;

public class leastAvg {

	public static void main(String[] args) {
		int []a= {3,7,90,20,5,50,40};
		int k=3;
		int min=Integer.MAX_VALUE;
		int index=0;
		for (int i = 0; i < a.length-k+1; i++) 
		{
			int sum=0;
			for (int j = 0; j < i+k; j++) 
			{
				sum=sum+a[j];
				
			}
			int avg=sum/k;
			if(avg<min)
			{
				min=avg;
				index=i;
			}
		}
		
		for (int i = index; i < index+k; i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
