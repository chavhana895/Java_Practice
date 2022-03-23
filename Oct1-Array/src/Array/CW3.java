package Array;

public class CW3 {

	public static void main(String[] args) {
		
int[]a= {1,2,3,4,5,6};
int newSize=5;
int []b=new int[newSize];
int i=0,j=0;
while(i<a.length && j<b.length)
{
	if( a[i]!=4)
	{
		b[j]=a[i];
		j++;
	}
	i++;
	
}
for(int j2=0;j2<b.length;j2++)
{
	System.out.println(b[j2]);
}
		
		
		
	}

}
