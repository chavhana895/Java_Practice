package SinglyLinkedList5;

public class MySinglyLinkedList <p>
{
Node<p> root;

void add(p data)
{
	if(root==null)
	{
		root= new Node<p>(data);
	}
	else
	{
		Node<p> temp=root;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=new Node<p>(data);
	}
}

void print()
{
	Node<p> temp=root;
	while(temp!=null)
	{
		System.out.println(temp.data);
		temp=temp.next;
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
	if(data==temp.data)
	{
		return true;
	}
	temp=temp.next;
  }
	return false;
}

Object[] toArray()
{
	Object[]a=new Object[size()];
	Node <p>temp=root;
	int index=0;
	while(temp!=null)
	{
		a[index]=temp.data;
		temp=temp.next;
		index++;
	}
	return a;
}


int size() 
{
	Node<p> temp=root;
	int index=0;
	while(temp!=null)
	{
		index++;
		temp=temp.next;
	}
	return index;
}
}
