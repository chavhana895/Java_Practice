package CW;

public class CW9 {

	static int []a=new int[5];
	static int  index=0;
	public static void main(String[] args) 
	{
	    push(4);
	    push(5);
	    push(5);
	    push(3);
	    push(2);
	    
	    System.out.println();
	    System.out.println(pop());
	    System.out.println(pop());
	    System.out.println(pop());
	    System.out.println(pop());
	    System.out.println(pop());    
	    
	}
	private static int pop() 
	{
		if(index==0)
		{
			System.out.println("Que is Empty");
		}
		return index;
		
	}
	public static void push(int num) 
	{
	  if(index<a.length)
		 a [index++]=num;
	  else
		  System.out.println("Queue is Empty");
	}
	
}
