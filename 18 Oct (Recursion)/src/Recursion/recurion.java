package Recursion;

public class recurion {

	public static void main(String[] args) {
		
		int i=0;
		m1(i);
	}

	private static void m1(int i) {
		
		if(i<5)
		{
			System.out.println("hi");
			m1(i+1);
		}
		
	}

}
