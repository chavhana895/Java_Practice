package HomeWork;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2021;
		if(year%100==0)
		{
		if(year%400==0)
			System.out.println("Leap");
		else
				System.out.println("Non leap");
		}
		else
		{
		if(year%4==0)
			System.out.println("Leap");
		else
			System.out.println("Non leap");
		}
	}

}
