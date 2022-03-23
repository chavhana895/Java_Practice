package Q1;

import java.util.Scanner;

public class LaptopCompony {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		public void welcome();
     	System.out.println("Welcome");
		System.out.println("Enter 1-Add"+" Enter 2-Sub"+ " Enter 3-Mult"+ " Enter 4- Quit");
      int choice=sc.nextInt();
      if(choice<=4)  {
    	System.out.println("Enter two Number");
    	int num1=sc.nextInt();
    	int num2=sc.nextInt();
    	
    	if(choice==1)
    	{
    	int	result1=num1+num2;
    	System.out.println(result1);
    	}
    	if(choice==2)
    	{
    		int result2=num1-num2;
    		System.out.println(result2);
    	}
    	if(choice==3) {
    		int result3=num1*num2;
    	System.out.println(result3);}
    	else
    		System.out.println("Quit");
    	System.out.println("Thank You");
      
      	}
	}

	private static void welcome() {
		// TODO Auto-generated method stub
		
	}

	}

