import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		switch(n%2) {
		case 0:
			System.out.println("even");
			break;
			default:
				System.out.println("odd");
				
		}
	}
}
