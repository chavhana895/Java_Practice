package Pre_Basics;

import java.util.Scanner;

public class ElectricityBill 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Electricity Unit: ");
		double unit=sc.nextDouble();
		double bill=0;
		double finalbill=0;
		
		if(unit<=50)
			bill=unit*0.50;
		else if(unit<=150)
			bill=50*0.50+(unit-50)*0.75;
		else if(unit<=250)
			bill=50*0.50+100*0.75+(unit-150)*1.2;
		else
			bill=50*0.50+100*0.75+100*1.2+(unit-250)*1.50;
		finalbill=bill*1.20;
		System.out.println(finalbill);
	}

}
