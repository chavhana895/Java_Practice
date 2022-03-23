package mostIMP;

public class PerfectNo {

	public static void main(String[] args)
	{
//		int num=8;
//		int sum=0;
//		for (int i = 1; i < num; i++)
//		{
//			if(num%i==0)
//			{
//				sum=sum+i;
//			}
//		}
//		if(sum==num)
//			System.out.println("Perfect No");
//		else
//			System.out.println("Not Perfect No");
		
		
		float p=50000,r=10,t=2,n=1;t=2;
		
		System.out.println("Enter the Principal: "+p);
		System.out.println("Enter the intrest: "+r);	
		System.out.println("Enter the Time period: "+t);
		System.out.println("intrest is compounded per unit t: "+n);
		
		double amount = p * Math.pow(1+(r/n),n*t)/100;
		double cintrest= amount-p;		System.out.println("Compound Intrest after "+t+"years: "+cintrest);
		System.out.println("Amount after " +t+"years: "+amount);
	}

}
