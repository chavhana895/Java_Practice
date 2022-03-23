package Pre_Basics;

import java.util.Scanner;

public class GrossSalary 
{

	public static void main(String[] args) 
	{
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter Basic Salary");
	   double BasicSalary=sc.nextDouble();
	   double GrossSalary=0;
	  
	   if(BasicSalary<=10000)
		   GrossSalary=BasicSalary+BasicSalary*.20+BasicSalary*.80;
	   else if(BasicSalary<=20000)
		   GrossSalary=BasicSalary+BasicSalary*.25+BasicSalary*.90;
	   else 
		   GrossSalary=BasicSalary+BasicSalary*.30+BasicSalary*.95;
	   System.out.println(GrossSalary);
	}

}
