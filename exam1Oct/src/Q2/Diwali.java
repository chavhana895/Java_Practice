package Q2;

import java.util.Scanner;

public class Diwali {
int basicSalary;
int noOfExp;
int bonus;
double finalSalary;

public void bonus()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your basicSalary: ");
	basicSalary=sc.nextInt();
	System.out.println("Enter noOfExp: ");
	noOfExp=sc.nextInt();
	if(noOfExp>5)
		finalSalary=1.35*basicSalary;
	else
		finalSalary=1.15*basicSalary;
	System.out.println(finalSalary);
	sc.close();
		
}

}
