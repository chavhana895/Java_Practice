import java.util.Scanner;

public class agesScanner {

	public static void main(String[] args) {
		int age1,age2,age3,max,min;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of first person: ");
		age1=sc.nextInt();
		System.out.println("Enter the age of Second person: ");
		age2=sc.nextInt();
		System.out.println("Enter the age of Third person: ");
		age3=sc.nextInt();
		
		if(age1>age2&&age1>age3)
			System.out.println("First Person is oldest ");
		else if(age2>age1 && age2>age3)
			System.out.println("Second person is oldest");
		else if(age3>age1 && age3>age2)
			System.out.println("Third person is oldest");
		
		else {
			System.out.println("All have Equal ages");
			
			}
		if (age1<age2&&age1<age3)
			System.out.println("First person is Youngest");
		if (age2<age1&&age2<age3)
			System.out.println("Second person is Youngest");
		if (age3<age2&&age3<age1)
			System.out.println("Third person is Youngest");
			sc.close();
			
				
	}

}
