package AssimentHW;

public class HW8 {

	public static void main(String[] args)
	{
		int a[]= {12,43,34,52,47,41};
		int temp;
		for (int i = 0; i < a.length; i++)   
        {  
            for (int j = i + 1; j <a.length; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
		System.out.println(" minimum  number : "+a[0]);
		System.out.println(" second minimum  number : "+a[1]);
		
		
	}

}
