package Dec18;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double unit = sc.nextDouble();
		double finalBill=0;
		double bill=0;
		
		if(unit<=50)
			bill=unit*0.50;
		else if(unit<=150)
			bill=50*0.50+(unit-50)*0.75;
		else if(unit<=250)
			bill=50*0.50+100*0.75+(unit-150)*1.20;
		else
			bill=50*0.50+100*0.75+100*1.20+(unit-250)*1.50;
		finalBill=bill*1.20;
		System.out.println(finalBill);
	}

}
