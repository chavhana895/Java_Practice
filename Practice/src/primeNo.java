
public class primeNo {

	public static void main(String[] args) 
	{
//	 int num=13;
//	 int cnt=0;
//	 if(num==0 || num==1)
//		 System.out.println("Not prime");
//	 
//	 for (int i = 2; i < num; i++) 
//	 {
//		if(num%i!=0)
//		{
//			System.out.println("prime");
//			break;
//		}
//		else
//		{
//			System.out.println("Not Prime");
//			break;
//		}
//	}
		
		int num=29;
		int cnt=0;
		for (int i = 2; i< num; i++)
		{
			if(num/i!=0)
			{
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
