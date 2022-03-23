package HW2_LaptopCompony;


	import java.util.Scanner;

	public class Laptopcompany {
		Scanner sc=new Scanner(System.in);
		public void welcome() {
			System.out.println("Welcome");
		
		System.out.println("Enter Option ADD-1,SUB-2,MULTI-3,QUIT-4");
		int choice=sc.nextInt();
		if(choice<4)
		{
		System.out.println("Enetr two number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
			if(choice==1)
				System.out.println("ADD="+(num1+num2));
			else if(choice==2)
				System.out.println("Subtract="+(num1-num2));
			else if(choice==3)
				System.out.println("Multiply="+(num1*num2));
		}
			else 
				System.out.println("Quit");
			
				System.out.println("Thank You");
		}
	}

