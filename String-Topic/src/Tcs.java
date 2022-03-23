import java.util.Scanner;

public class Tcs 
{
  public static void main(String[] args) {
	
	  Scanner sc =new Scanner(System.in);
	
	  String s="";
	  
	  for (int i = 0; i < 5; i++)
	  {
		s=s+sc.nextLine()+" ";
	  }
	  System.out.println(s);
	  
}
}
