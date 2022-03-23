package AssimentHW;
// find and display reverse of an array using thirdvariable.
public class hw5 {
	public static void main(String[] args) {
		int a[]= {1,4,2,3,4,5};
		
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
			
		}
		
		System.out.println("Rverse An Array ");
 		for (int j2 = 0; j2 < a.length; j2++)
		{
			System.out.println(a[j2]);
		} /*/
		int a[]= {1,4,2,3,4,5};
		int b[]=new int [a.length];
		int i=a.length-1;
		int j=0;
		while(i>=0)
		{
			b[j]=a[i];
			i--;
			j++;
			
		}
		a=b;
		System.out.println("Rverse An Array ");
 		for (int j2 = 0; j2 < b.length; j2++)
		{
			System.out.println(a[j2]);
		} */
	}

}
