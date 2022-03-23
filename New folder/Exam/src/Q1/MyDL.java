package Q1;

public class MyDL <p>
{

	Node<p> head;
	Node<p> tail;
		
void add(p data)
{
   if(head==null)
   {
	   head=new Node<p>(data);
	   tail=head;
   }
   Node<p> obj= new Node<p>(data);
   tail.next=obj;
   obj.prev=tail;
   tail=obj;
}


public String toString()
{
	String s="[";
	Node <p> temp=head;
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


void remove(p data)
{
	Node<p> temp= head;
	
	while(temp!=null)
	{
		if(temp.data==data)
		{
		
		}
		temp=temp.next;
	}
}
}
