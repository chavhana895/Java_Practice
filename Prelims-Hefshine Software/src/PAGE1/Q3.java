package PAGE1;

public class Q3 {

	public static void main(String[] args) 
	{
		int []a= {1,0,1,0,1,0,1,0};
        
		int count=0;
		int cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			count=count+a[i];
			cnt++;
		}
		System.out.println(count);
	}

}
