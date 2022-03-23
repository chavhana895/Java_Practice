import java.util.Scanner;

public class consequativeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		if ((m-n)==1 | (m-n)==-1 | (n-m)==1 | (n-m)==-1)
System.out.println("consequtive Number");
else
System.out.println("Not consequtive number");
	
	}

}

//m=45
//n=46
