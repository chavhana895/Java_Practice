package practice;

public class PushPop 
{
     
	static int index =0;
	static int []a= new int[4];
	public static void main(String[] args) 
	{
	push(1);
	  System.out.println(a[0]);
		pop();
		System.out.println(a[2]);
		
		System.out.println(a[1]);
		
	}
	static public void push(int num)
	{   if(index<a.length)
		 {
	      	a[index++]=num;
		 }
	    else
		System.out.println("Stack is full");
	}
	
	static public int pop()
	{   if(index>0)
			{
			index--;
	        int num1= a[index];
	        return num1;
			}
	else
		System.out.println("Stack is Empty");
	return 0;
	}
	

}
