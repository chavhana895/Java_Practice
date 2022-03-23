package Singly;

public class SLL <p>
{
 Node<p> root;
 
void add(p data)
{
	Node<p>obj=new Node<p>(data);
	if(root==null)
	{
		root=obj;
	}
	else
	{
		Node<p>temp=root;
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

void print()
{
	Node<p> temp=root;
	while(temp!=null)
	{
		System.out.println(temp.data);
		temp=temp.next;
	}
}
}
