package LinkedList;

public class MyLinkedList <p>
{
Node <p> root;

int index=0;
void add(p data)
{
	Node<p> obj = new Node<p>(data);
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

void print()
{
	Node<p> temp=root;
	while(temp!=null)
	{
		System.out.println(temp.data);
		index++;
		temp=temp.next;
	}
}

int remove(int i)
{
	
	if(i<0)
		throw new ArrayIndexOutOfBoundsException();
	if(i==0)
	{
	  Node<p> obj=new Node<p>(null);
	  root=root.next;
	  return 1;
	}
   Node<p> temp=root;
   int index=0;
   while(temp!=null)
   {
	   if(index==i-1)
	   {
		   temp.next=temp.next.next;
		   return 1;
	   }
	   temp=temp.next;
	   index++;
   }
   throw new ArrayIndexOutOfBoundsException();
}
}
