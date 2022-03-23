package Array;

public class ArrayReverse {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6};
		int[]b=new int[a.length];
		
		int i=a.length-1;
		int j=0;
		while(i>=0)
		{
			b[j]=a[i];
			i--;j++;
		}
a=b;
for (int k = 0; k < a.length; k++) {
	System.out.println(a[k]);
}
		  
		}
		
	}
