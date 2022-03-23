package practice;

public class reverseArray {

	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,5};
		int []b= new int [a.length];
		int i=a.length-1;
		int j=0;
		while(i>=0)
		{
			b[j]=a[i];
			i--;j++;
		}
a=b;
for (int j2 = 0; j2 < b.length; j2++) 
{
	System.out.println(a[j2]);
}
	}

}
