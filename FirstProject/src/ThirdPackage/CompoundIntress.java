package ThirdPackage;

public class CompoundIntress {

	public static void main(String[] args[])
	{
	float p=4500,r=10,t=2,n=1;t=2;
			
	System.out.println("Enter the Principal: "+p);
	
	System.out.println("Enter the intrest: "+r);
	
	System.out.println("Enter the Time period: "+t);

	System.out.println("intrest is compounded per unit t: "+n);
	
	double amount = p * Math.pow(1+(r/n),n*t);
	double cintrest= amount-p;
	System.out.println("Compound Intrest after "+t+"years: "+cintrest);
	System.out.println("Amount after " +t+"years: "+amount);
	}

}
