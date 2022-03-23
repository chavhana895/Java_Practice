package HomeWork;

import java.util.Scanner;

public class coordinateSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Coordinates x & y");
		int X=sc.nextInt();
		int Y=sc.nextInt();
		
		if(X>0 && Y>0)
			System.out.println(" 1st coordinate ");
		else if(X<0 && Y>0)
			System.out.println(" 2nd coordinate ");
		else if(X<0 && Y<0)
			System.out.println(" 3rd coordinate ");
		else if(X>0 && Y<0)
			System.out.println(" 4th coordinate ");
		else
		System.out.println("on Origin");
			

	}

}
