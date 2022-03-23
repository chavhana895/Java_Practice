package AssimentHW;

public class HW3 {

	public static void main(String[] args) {
		int a[]= {11,22,33,44,55};
		int num=44;
		int j=0;
		for (int i = 0; i < a.length-1; i++) 
		{
			if(num==a[i])
			{
					a[j]=a[i+1];			
			}
			else
			{
					
					a[j]=a[i];
					j++;
					
			}
		}
		for(int b:a)
		{
			System.out.print(b+"  ");
		}
		 
	}

}
