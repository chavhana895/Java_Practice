package Array_Prob;

public class QueueProb {

	static int a[]= new int[5];
	static int index=0;
	public static void main(String[] args) 
	{
	  push(12);	
	  push(4);	
	  push(7);	
	  push(9);	
	  push(3);	
	  
	  for (int i = 0; i < a.length; i++) 
	  {
		System.out.print(a[i]+" ");
	  }
	  
	  System.out.println();
	  System.out.println();
	  
	  System.out.println(pop());
	  System.out.println(pop());
	  System.out.println(pop());
	  System.out.println(pop());
	  System.out.println(pop());
	  System.out.println(pop());
	}
	private static int pop() 
	{
		if(index>0)
		{
			int num=a[0];
			
			for (int i = 1; i < index; i++) 
			{
				a[i-1]=a[i];
			}
			index--;
			return num;
		}
		else
			System.out.println("Queue is Empty");
		return 0;
	}
	private static void push(int num) 
	{
	  if(index<a.length)
	  {
		  a[index]=num;
		  index++;
	  }
	  else
		  System.out.println("Queue is Full");
	}

}
