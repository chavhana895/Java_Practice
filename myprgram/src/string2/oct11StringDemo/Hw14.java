package oct11StringDemo;

public class Hw14 {

	public static void main(String[] args) {
//		String a="123456o";
//		boolean temp=true;
//		for (int i = 0; i <a.length(); i++) 
//		{
//			if(a.charAt(i)<'0'  || a.charAt(i)>'9')
//				temp=false;
//		}
//		if(temp)
//			System.out.println("its Digit");
//		else
//			System.out.println("few character");
		
		
		
		
		
//		String a="123456";
//		int i=0;
//		
//		for (; i < a.length(); i++)
//		{
//			if(a.charAt(i)< '0' || a.charAt(i)> '9')
//				break;
//		}
//		if(i==a.length())
//			System.out.println("its only digit");
//		else
//			System.out.println("its few charater");
		
		
		
		
		
		
		String a="765432o";
		int counter=0;
		for (int i = 0; i < a.length(); i++)
		{
			if(a.charAt(i)> '0' || a.charAt(i)< '9')
			{
				counter++;
			}
		}
		System.out.println(counter);
		System.out.println(a.length());
		if(counter==a.length())
			System.out.println("its only digit");
		else
			System.out.println("few character");

	}

}
