package mostIMP;

public class fibonacci_Series {

	public static void main(String[] args) 
	{
		int n=0, n1=1 , n2=0;
		
		int []a=new int[10];
		int index=0;
		System.out.print(n+" "+n1);
		for (int i = 0; i < 8; i++) 
		{
			n2=n+n1;
			a[index]=n2;
			System.out.print(" "+n2);
			n=n1;
			n1=n2;
			index++;
		}
		System.out.println();
//		for (int i = a.length-1;i>=0; i--) 
//		{
//			System.out.print(n+" "+n1+" "+a[i]);
//		}
	}
}