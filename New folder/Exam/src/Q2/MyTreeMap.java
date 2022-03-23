package Q2;

public class MyTreeMap <k,v> 
{
Node <k,v> root;

void add(k key, v value)
{
	if(root==null)
	{
		root=new Node<k, v>(key, value);
	}
	else
	{
	  Node<k,v> temp=root;
	  while(temp.next!=null)
	  {
		  temp=temp.next;
	  }
	  temp.next=new Node<k, v>(key, value);
	}
}

public String toString()
{
	String s="[";
	Node<k,v> temp=root;

	while(temp!=null)
	{
		while(temp!=null)
		{
			s=s+", ";
			temp=temp.next;
		}
			
	}
	s=s+"]";
	return s;
	
}
}
