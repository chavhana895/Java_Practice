package AssimentHW;

public class HW26my {

	public static void main(String[] args) 
	{
		int a[]={3,7,90,20,56,50,40};
		int k=3;
		int min=Integer.MAX_VALUE;
		
		Firstsub(a, min, k);

		
	}
	static void Firstsub(int a[], int min, int k)
	{
		int index=0;

		for (int i = 0; i < a.length-k+1; i++) ///2
		{
			int sum=0;
			for (int j = i; j < i+k; j++)  //0 1 2 
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
		System.out.println("avg :- "+min);
		for (int i = index; i < index+k; i++)
		{
			System.out.print (a[i]+" ");
		}

	}
	

}
