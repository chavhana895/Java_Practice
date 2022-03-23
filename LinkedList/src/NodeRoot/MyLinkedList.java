package NodeRoot;

public class MyLinkedList {
Node root;
	public void add(int num) 
	{
		if(root==null)
		{
			root=new Node(num);
		}
		else
		{
			Node temp=root;
			while(temp.next!=null)
			{
				temp=temp.next;
				
			}
			temp.next=new Node(num);
		}
	}
	public void print() 
	{
		Node temp=root;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
