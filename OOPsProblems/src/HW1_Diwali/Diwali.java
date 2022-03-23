package HW1_Diwali;

import java.util.Scanner;

public class Diwali {
int basicSalary;
int bonus;
int numberOfExp;

public void bonus()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Salary");
	basicSalary =sc.nextInt();
	System.out.println("Enter No of Year Exp: ");
	numberOfExp=sc.nextInt();
	double totalSalary=0;
	
	if(numberOfExp>5)
		totalSalary=1.35*basicSalary;
	else
		totalSalary=1.15*basicSalary;
	System.out.println(totalSalary);
	sc.close();
}
}

