import java.util.Scanner;

public class cuckoon {

	
	 static int cuckoon(int n)
	{
		if(n==1)
		return 0;
		
		if(n==2) return 1;
		else 
			return 1*cuckoon(n-1)+2*cuckoon(n-2)+3*1;
		
	}
	
	public static void main(String[] args) 
	{
		int n=0 ,result;
		int cuckoon;
		Scanner sc=new Scanner (System.in);
		result=cuckoon(n);
		System.out.println(result);
	}

}
