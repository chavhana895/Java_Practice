package Q2;

public class MyDoublyLinkedList <p>
{
Node head;
Node tail;

void add(p data)
{
	Node root=head;
	if(head==null)
	{
		head = new Node<p>(data);
	}
	else 
	{
		Node temp=head;
		while(true)
		{
			if(temp.next!=null)
			{
			  temp.data=temp.next;
			}
		}
	}
}
}
