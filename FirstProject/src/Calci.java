import java.util.Scanner;

public class Calci {

	public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter 2 nums");
int num1=sc.nextInt();
int num2=sc.nextInt();
System.out.println("Enter 1-add, 2-sub, 3-mult,4-div");
int choice=sc.nextInt();

if(choice==1)
	System.out.println("Addition is "+(num1+num2));
else if(choice==2)
	System.out.println("Sub is "+(num1-num2));
else if(choice==3)
	System.out.println("Mul is "+(num1*num2));
else if (choice==4)
	System.out.println("Div is "+num1/num2);

	

	}

}
