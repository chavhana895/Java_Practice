package HW;

public class HW3 {

	public static void main(String[] args) {
		int []a= {1,2,3,4,4,4,4,5,7,8,9,4,4};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==4)
				count++;
		}
		int newSize=a.length-count;
		int []b=new int[newSize];
		int i=0,j=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]!=4)
			{
				b[j]=a[i];
				j++;
			}
			i++;
		}
		a=b;
		for (int j2 = 0; j2 < a.length; j2++) {
			System.out.println(a[j2]);
		}
	}

}
