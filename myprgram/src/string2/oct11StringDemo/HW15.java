package oct11StringDemo;

public class HW15 {

	public static void main(String[] args) {
		String s="123dsd";
		int sum=0;
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			if(ch>'0' && ch <'9')
				sum=sum+(ch-48);
		}
		System.out.println(sum);

	}

}
