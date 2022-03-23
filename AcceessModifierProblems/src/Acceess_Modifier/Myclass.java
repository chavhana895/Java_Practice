package Acceess_Modifier;

import java.util.Scanner;

public class Myclass {

			public static void main(String[] args) {
				Scanner  sc=new Scanner(System.in);
				EmployeeDemo a=new EmployeeDemo();
				System.out.println("Enter the name of emp.");
				a.name=sc.next();
				System.out.println("Enter the id of emp.");
				a.id=sc.nextInt();
				System.out.println("Enter the Dept. of emp");
				a.Dept=sc.next();
				System.out.println("Enter the salary of emp");
				a.salary=sc.nextInt();
				a.emp_name();
				a.emp_id();
				a.emp_dept();
				
				sc.close();
	}

}
