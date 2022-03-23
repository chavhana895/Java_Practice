package oct11StringDemo;

public class hw1 {

	public static void main(String[] args) 
	{
		char a[]= {'s','h','u','b','h','a','m'};
		String b="";
		for (int i = 0; i < a.length; i++)
		{
			b=b+a[i];
		}
		System.out.println(b);
		String c=new String(a);
		System.out.println(c);

	}

}
