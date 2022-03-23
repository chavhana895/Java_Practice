package practice;

public class removeNoArray {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,2,2,2,2,6};
		int count=0;
		int num=2;
		for (int i = 0; i < a.length; i++) 
		{
		  if(a[i]==num)
			  count++;
		}
		int []b=new int[a.length-count];
		int i=0;
		int j=0;
		while(j<b.length)
		{
			if(num!=a[i])
			{
				b[j]=a[i];
				j++;
			}
			i++;
		}
		a=b;
		for (int j2 = 0; j2 < b.length; j2++) 
		{
			System.out.println(a[j2]);
		}
	}

}
