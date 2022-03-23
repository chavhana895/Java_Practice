package string2.oct11StringDemo;

public class hw13 {

	public static void main(String[] args) {
		String ch="aaabbbccc";
		String c="";
		for (int i = 0; i < ch.length(); i++)
		{
			if(ch.charAt(i)!='b')
				c=c+ch.charAt(i);
		}
		System.out.println(c);

	}

}
