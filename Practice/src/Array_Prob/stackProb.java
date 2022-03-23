package Array_Prob;

public class stackProb 
{
 static int [] a=new int[5];
 static int index=0;
 public static void main(String[] args) 
 {
   push(5);
   push(3);
   push(8);
   push(12);
   push(2);
   
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
   System.out.println(pop());
 }
private static int pop() 
{
	if(index>0)
	{
		index--;
		return a[index];
	}
	else 
		System.out.println("Stack is Empty");
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
	  System.out.println("Stack is Full");
}
}
