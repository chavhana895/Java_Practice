package AssimentHW;

public class HW30Remove2element {

	public static void main(String[] args)
	{
		int a[]= {1,1,1,1,1,2,2,3,4};
		int b[]= {1,2,4};
		int key=2;
		for (int i = 0; i < b.length; i++) 
		{
			int element=b[i];
			int count=0;
			for (int j = 0; j < b.length; j++)
			{
				if(a[j]==element)
					count++; //// 		count the double element
				if(count==2)//          theire 2 element then break
					break;
			}
			int c[]=new int[a.length-count];
			int index=0;
			int removeCount=0;
			for (int j = 0; j < a.length; j++)
			{
				if(a[j]!=element || removeCount==key) /// a array aani b array madhe same jar astil tr remove fact 2 karayche
					c[index++]=a[j];
				else
					removeCount++;
			}
			a=c;
		}
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]!=0)
				System.out.print (a[i]+" ");
		}
	}

}
