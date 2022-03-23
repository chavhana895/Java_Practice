package HomeWork;

import java.util.Scanner;

public class week {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
				int choice =sc.nextInt();
		
		if(choice==0)
			System.out.println("Sun");
		else if(choice==1)
			System.out.println("Mon");
		else if(choice==2)
			System.out.println("Tue");
		else if(choice==3)
			System.out.println("Wed");
		else if(choice==4)
			System.out.println("Thurs");
		else if(choice==5)
			System.out.println("Fri");
		else if(choice==6)
			System.out.println("sat");		
		else
			System.out.println("invalid");
	}
}
