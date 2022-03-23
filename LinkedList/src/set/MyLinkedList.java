package set;

public class MyLinkedList <E> {
Node root;

public void set(E data,int i) 
{
	if(i<0 || root==null)
		throw new IndexOutOfBoundsException();
	if(i==0)
	{
		root.data=data;
	}
	else
	{
		int index=0;
		Node temp=root;
		while(index!=i)
		{
			index++;
			if(temp.next!=null)
				temp=temp.next;
			else
				throw new IndexOutOfBoundsException();
		}
		temp.data=data;	
	}
}
}
