package doubleLinkedList;

public class MyDoublyLinkedList <p>
{
Node <p> head;
Node <p> tail;

void add(p data)
{
	if(head==null)
	{
		head=new Node<p>(data);
		tail=head;
	}
	else
	{
		Node<p> obj=new Node<p>(data);
		tail.next=obj;
		obj.prev=tail;
		tail=obj;
	}
}

void print()
{
	Node<p> temp=head;
	while(temp!=null)
	{
		System.out.println(temp.data);
		temp=temp.next;
	}
}
}