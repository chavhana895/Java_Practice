package mostIMP;

public class Automarph_No {

	public static void main(String[] args)
	{
		int num=5;
		int num1=num;
		int sq=num*num;
		int cnt=0;
		while(num1>0)
		{
			int last1=sq%10;
			int last2=num1%10;

			num1=num1/10;
			sq=sq/10;
			
			if(last1==last2)
			{
				cnt++;
			}
		}
		if(cnt!=0)
			System.out.println("Automarph");
		else 
			System.out.println("Not");
	}

}
