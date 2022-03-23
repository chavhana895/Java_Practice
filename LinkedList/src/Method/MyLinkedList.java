package Method;

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
	
	public String toString() 
	{
		String s="";
		Node temp=root;
		while(temp!=null)
		{
			s=s+temp.data+" ";
			temp=temp.next;
		}
		return s;
	}
	
	public int size() 
	{
		if(root==null)
			return 0;
		return 0;
	}
	public void remove(int i) 
	{
		if(root!=null)
		{
			if(i==0)
			{
				root=root.next;
			}
			else
			{
				int index=0;
				Node temp=root;
				while(index+1!=0)
				{
					index++;
					if(temp.next!=null)
					temp=temp.next;
					else
						break;
				}
				if(temp.next!=null)
				{
					temp.next=temp.next.next;
				}
			}
		}
	}
	public void clear() 
	{
		root=null;
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
