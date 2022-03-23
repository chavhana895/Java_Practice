import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int SystemAns=145;
		int myAns=sc.nextInt();
	
		if(myAns==SystemAns)
		System.out.println("correct");
		else if(myAns>SystemAns)
		System.out.println("high");
		else if (myAns<SystemAns)
		System.out.println("Low");

	}

}
