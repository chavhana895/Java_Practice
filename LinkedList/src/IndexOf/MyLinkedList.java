package IndexOf;
public class MyLinkedList <E> 
{
Node root;

public int indexOf(E data) 
{
	if(root==null)
		return -1;
	Node temp=root;
	int index=0;
	while(temp!=null)
	{
		if(data==temp.data)
		return index;	
		
		else if(temp.next==null)
			return -1;
		else
		{
			temp=temp.next;
			index++;
		}
	}
	return -1;	

}
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

public int lastIndexOf(E data) 
{
	int i=-1;
	Node temp=root;
	int index=0;
		while(temp!=null)
		{
			if(temp.data==data)
			{
				i= index;	
			}
			temp=temp.next;
				index++;
			}
		return i;	
	}
}


