package Collebera;
import java.util.*;
public class leapYear {

	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Year: ");
	  int year=sc.nextInt();
	  
	  if(year%100==0)
	  {
		  if(year%400==0)
		  System.out.println("Leap Year");
		  else
			  System.out.println("Not");
	  }
	  else
	  {
		  if(year%4==0)
			  System.out.println("Leap Year");
		  else
			  System.out.println("Not");
	  }
	  
	}

}
