package feb_18;

import java.util.Scanner;

public class Q1_ElectricityUnit 
{

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Electricity Unit");
	  double unit=sc.nextDouble();
	  double bill=0;
	  double finalbill=0;
	  
	  if(unit<=50)
		  bill=unit*0.50;
	  else if(unit<=150)
		  bill=50*0.50+(unit-50)*0.75;
	  else if(unit<=250)
		  bill=50*0.50+100*0.75+(unit-150)*1.20;
	  else
		  bill=50*0.50+100*0.75+100*1.20+unit*1.50;
	  finalbill=1.20*bill;
	  System.out.println(finalbill);
	}

}
