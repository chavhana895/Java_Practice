package oct12;

public class HW18 {
//  Write a program to reverse every word in a string using method
	public static void main(String[] args) {
		String s="abc cde fhi jkl";
		String[] sa=s.split(" ");
		for (int i = sa.length-1; i>=0; i--)
		{
			System.out.println(sa[i]);
		}

	}

}
