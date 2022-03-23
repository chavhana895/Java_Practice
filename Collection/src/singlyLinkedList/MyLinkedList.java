package singlyLinkedList;

public class MyLinkedList <p> 
{
Node<p> root;

public void print() 
{
	Node<p> temp=root;
	while(temp!=null)
	{
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	System.out.println();
}
 
public void add(p data) 
{
	Node<p> obj=new Node<p>(data);
	if(root==null)
	{
		root=obj;
	}
	else
	{
		Node<p> temp=root;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=obj;
	}
}


public String toString() 
{
	String s="[";
	Node<p> temp=root;
	while(temp!=null)
	{
		s=s+temp.data;
		if(temp.next!=null)
		{
			s=s+", ";
		}
		temp=temp.next;
	}
	s=s+"]";
	return s;	
}

int lastIndexOf(p data)
{
	int i=-1;
	Node<p> temp=root;
	int index=0;
	while(temp!=null)
	{
		if(temp.data==data)
		{
		  i=index;	
		}
		temp=temp.next;
		index++;
	}
	return i;
}

int indexOf(p data)
{
	int index=0;
	Node<p> temp=root;
	while(temp!=null)
	{
		if(temp.data==data)
			return index;
		temp=temp.next;
		index++;
	}
	return -1;
}

public void clear()
{
	root=null;
}

void set(int i, p data)
{
	if(i<0)
	throw new ArrayIndexOutOfBoundsException();
	Node<p> temp=root;
	int index=0;
	while(temp!=null)
	{
		if(index==i)
		{
			temp.data=data;
			return;
		}
		temp=temp.next;
		index++;
	}
	throw new ArrayIndexOutOfBoundsException();
}

p get(int i)
{
	if(i<0)
		throw new ArrayIndexOutOfBoundsException();
	Node<p> temp=root;
	int index=0;
	while(temp!=null)
	{
		if(index==i)
		{
			return temp.data;
		}
		temp=temp.next;
		index++;
	}
	throw new ArrayIndexOutOfBoundsException();
	
}

boolean contains(p data)
{
	Node<p> temp=root;
	while(temp!=null)
	{
		if(temp.data==data)
			return true;
		temp=temp.next;
	}
	return false;
}

int size()
{
	int index=0;
	Node<p> temp=root;
	while(temp!=null)
	{
		temp=temp.next;
		index++;
	}
	return index;
}

Object[] toArray()
{
	Object [] a=new Object[size()];
	Node<p> temp=root;
	int index=0;
	while(temp!=null)
	{
		a[index]=temp.data;
		temp=temp.next;
		index++;
	}
	return a;
}
}
