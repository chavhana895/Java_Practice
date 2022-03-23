package practice;

public class imp 
{

	public static void main(String[] args) 
	{
		int units=30;                                     //control statement 1    HW4
		double bill=0;
		if(units<=50)
			bill=units*0.5;
		else if (units<=150)
			bill=(50*0.5)+((units-50)*0.75);
		else if (units<=250)
			bill=(50*0.5)+(100*0.75)+((units-150)*1.2);
		else
			bill=50*0.5+(100*0.75)+100*1.2+((units-250)*1.5);
			double finalBill=1.2*bill;
		System.out.println(finalBill);
	}

}
