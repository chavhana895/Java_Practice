package HW;
public class HW5 {

	public static void main(String[] args)
	{
       int [] a = {23,15,19,26,30};
       
        int i=0;
        int j=a.length-1;
        while(i<j)
        {
        	int temp=a[i];
        	a[i]=a[j];
        	a[j]=temp;
        	i++;j--;
        }
        for (int j2 = 0; j2 < a.length; j2++)
        {
			System.out.print(a[j2]+" ");
		}
    }

}
