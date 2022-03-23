package Array;

public class CopyArray {

	public static void main(String[] args) {
		int[]a= {21,53,42,83,41,53,76};
		int[]b=new int [a.length];
	    int i=0;
	    int j=0;
		while(i<a.length)
		{
			    b[j]=a[i];
				i++;j++;
		}
		a=b;
		for (int j2 = 0; j2 < b.length; j2++) 
		{
			System.out.print(a[j2]+" ");
		}
	}

}
