package practice;

public class QUE {

	static int []a=new int[5];
	static int index=0;
	public static void main(String[] args) {
		
		push(23);
		push(15);
		push(36);
		push(27);
		push(45);
	
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}	
		System.out.println();
		System.out.println();
		
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
			{
			System.out.println("Que is Empty");
			}
			return 0;	
	}

	private static void push(int num) 
	{
		if(index<=a.length-1)
		{
			a[index]=num;
			index++;
		}
		else
			System.out.println("Que is full");
	}

}
