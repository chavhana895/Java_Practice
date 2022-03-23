package CW;

public class CW9 {
	static int [] a=new int[5];
	static int index=0;
	public static void main(String[]args)
	{
			push(5);
			push(10);
			push(7);
			push(6);
			push(9);
			
			for (int i = 0; i < a.length; i++) 
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();;
			System.out.println();
			
			System.out.println(pop());
			System.out.println(pop());
			System.out.println(pop());
			System.out.println(pop());
//			System.out.println(pop());
//			System.out.println(pop());
			
	}
		public static int pop()
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
			
				System.out.println("Que is empty");
				return 0;
	}
		public static void push (int num)
		{
			if(index<a.length)
			{
				a[index]=num;
				index++;
			}
			else
				System.out.println("Que is full");
}

}
