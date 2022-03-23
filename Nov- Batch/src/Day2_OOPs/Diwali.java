package Day2_OOPs;

import java.util.Scanner;

public class Diwali 
{
 public void calculateSalary() 
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Salary");
   int salary=sc.nextInt();
   System.out.println("year of Experience");
   int yearOfExp=sc.nextInt();
   
   if(yearOfExp>5)
   {
	   double totalSalary=salary*1.35;
	   System.out.println(totalSalary);
   }
   else
   {
	   double totalSalary1=salary*1.15;
	   System.out.println(totalSalary1);
   }
   
 } 
}
