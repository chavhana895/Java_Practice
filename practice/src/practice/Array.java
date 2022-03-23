package practice;

public class Array {

	public static void main(String[] args) {
		/*int []a= {1,2,3,4,5,6,7,8};//Binary Search
		int min=0;
		int max=a.length-1;
		int num=5;
		
		while(true)
		{
			if(max<min)
			{
				System.out.println("Not Found");
			break;
			}
			int mid=(min+max)/2;
		  if(a[mid]==num)
			{
				System.out.println("Found at: "+mid);
			break;
			}
		
		  else if(num>a[mid])
			min=mid+1;
		else
			max=mid-1;
		}*/
		
		
		
		
		/*int []a= {23,43,12,35,15,8,9};        //Leader No
		for (int i = 0; i < a.length; i++) 
		{  int num=a[i];
		int	countCounter=0;
			for (int j =i+1; j < a.length; j++) 
			{
				if(a[j]>num)
					countCounter++;
			}
			if(countCounter==0)
				System.out.print(a[i]+" ");
		}*/
		
		
		int [][]a= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		int [][]b=new int[3][3];
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				b[i][j]=a[j][i];
			}
		}
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				System.out.println(b[i][j]+" ");
			}
			System.out.println();
		}
		}
	}


