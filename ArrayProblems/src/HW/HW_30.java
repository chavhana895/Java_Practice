

package HW;

public class HW_30 {

	public static void main(String[] args) {
		int []a= {1,1,1,1,1,2,2,3,4};
		int []b= {1,2,4};
		
		for (int i = 0; i < b.length; i++) 
		{
			int element=b[i];
			int count=0;
			for (int j = 0; j < a.length; j++) 
			{
				if(a[j]==element)
					count++;
				if(count==2)
					break;
			}
			int[]c=new int[a.length-count];
			int index=0;
			int removedCount=0;
			for (int j = 0; j < a.length; j++) 
			{
				if(a[j]!=element || removedCount>=2)
					c[index++]=a[j];
				else
					removedCount++;
		}
			a=c;
			
			}
			for (int i = 0; i < a.length; i++) 
			{
				System.out.print(a[i]+" ");
			}
	}

}
