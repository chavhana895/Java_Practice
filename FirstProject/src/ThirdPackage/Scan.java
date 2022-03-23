package ThirdPackage;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method ;stub 
		Scanner sc=new Scanner(System.in);
System.out.println("Enter a num");
int num=sc.nextInt();
if (num==0)
	System.out.println("Sun");
else if (num==1)
	System.out.println("Mon");
else if (num==2)
	System.out.println("Tue");
else if (num==3)
	System.out.println("Wed");
else if (num==4)
	System.out.println("Thurs");
else if (num==5)
	System.out.println("Fri");
else if (num==6)
	System.out.println("Sat");
else 
	System.out.println("InvalidInput");



	}

}
