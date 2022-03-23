package AssimentHW;

public class Hw3final {

	public static void main(String[] args) {
		int a[]= {1,4,2,3,4,5,6,4,5,4};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==4)
				count++;
		}
	
		int newsize=a.length-count;
		int b[]= new int[newsize]; 
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
		
		
		a=b;  //Copy b a into 
		
		for(int c: b )
		{
			System.out.println(c);
		}

	}

}
