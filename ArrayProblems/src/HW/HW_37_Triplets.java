package HW;

public class HW_37_Triplets {

	public static void main(String[] args) {
	int []a={5,1,-4,-2,-1};
	int count=0;
for (int i = 0; i < a.length; i++) 
{
	for (int j = i+1; j < a.length; j++) 
	{
		for (int k = j+1; k < a.length; k++) 
		{
		 if(a[i]+a[j]+a[k]==2)
		 {
			 count++;
			 System.out.println(a[i]+" "+a[j]+" "+a[k]);
		}
	 }
	}
}
	System.out.println("No of Pair is: "+count);
	}

}
