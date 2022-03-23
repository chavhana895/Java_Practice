package practice;

import java.util.Scanner;

public class bill {

	public static void main(String[] args) 
	{
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter Electricity Units");
	  double a=s.nextInt();
	  double bill=0;
	  double finalbill=0;
	  if(a<=50)
		  bill=a*0.50;
	  if(a<=150)
		  bill=(50*0.50)+((a-50)*0.75);
	  if(a<=250)
		  bill=(50*0.50)+(100*0.75)+((a-150)*1.2);
	  if(a>250)
		  bill=(50*0.50)+(100*0.75)+(100*1.2)+((a-250)*1.50);
	  finalbill=bill*1.2;
	  System.out.println(finalbill);
	}

}
