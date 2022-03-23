package OOPsHW1;

import java.util.Scanner;

public class Diwali {
	int basicSalary;
	int yearOfExp;
	
	public void bonus()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary");
		basicSalary=sc.nextInt();
		System.out.println("Enter NO of Exp");
		yearOfExp=sc.nextInt();
		 double totalSalary=0;
		 
		 if(yearOfExp>5)
			 totalSalary=1.35*basicSalary;
		 else
			 totalSalary=1.15*basicSalary;
		 System.out.println(totalSalary);
	}

}
