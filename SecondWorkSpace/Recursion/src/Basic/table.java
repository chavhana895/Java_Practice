package Basic;

import java.util.Scanner;

public class table {

	static int cnt=0;
	static int num=5;
	public static void main(String[] args) 
	{
//	Scanner sc = new Scanner(System.in);
//	num = sc.nextInt();
	m1();
	}
	private static void m1() 
	{
		cnt++;
		System.out.println(cnt*num);
		if(cnt<10)
			m1();
	}

}
