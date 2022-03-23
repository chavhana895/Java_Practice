package HashBasics;

public class MyArrayLink {

	Node[]a=new Node[5];
	
	public void print() 
	{
		for (int i = 0; i < a.length; i++) 
		{
			Node temp=a[i];
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.Next;			
			}
		}
	}
	
	public void add(int data) 
	{
		int index=data%a.length;
		Node temp=a[index];
		
		if(temp==null)
		a[index]=new Node(data);
		
		else
		{
			while(temp.Next!=null)
			{
				temp=temp.Next;
			}
			temp.Next=new Node(data);
		}
		
	}
}
