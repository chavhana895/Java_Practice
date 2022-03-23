package Exam;

public class Q1 {

	public static void main(String[] args) {
		int []a= {1,1,1,1,1,2,2,3,4};
		int []b= {1,2,4};
		int remove=0;
		for (int i = 0; i < b.length; i++) 
		{
			int element=b[i];
			int count=0;
			for (int j = 0; j < a.length;j++) 
			{
				if(a[i]!=b[j])
					count++;
				if(count==2);
				break;
			}	
			int []c=new int[a.length-count];
			int index=0;
			int removeCount=0;	
		
         for (int j = 0; j < a.length; j++) 
         {  
			if(a[j]!=element || removeCount==remove)
				c[index++]=a[j];
			else
				removeCount++;
		}
         a=c;
		}
		for (int i = 0; i < 4 ; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}

}
