package HashMap;

public class MyHashMap <k,v>
{
	Node []a= new Node[5];
	
	void add(k key, v value)
	{
		int index=key.hashCode()%a.length;
		if(a[index]==null)
		{
			a[index]=new Node<k, v>(key, value);
			return;
		}
		Node temp=a[index];
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=new Node<k, v>(key, value);
	}
	
	void print()
	{
		for (int i = 0; i < a.length; i++)
		{
			Node temp=a[i];
			while(temp!=null)
			{
				System.out.println(temp.key+" "+temp.value);
				temp=temp.next;
			}
		}
	}
	
	int size()
	{
	  int size=0;
	  for (int i = 0; i < a.length; i++)
	  {
		Node temp=a[i];
		while(temp!=null)
		{
			size++;
			temp=temp.next;
		}
	  }
	return size;
	}
	
	boolean contains(k key)
	{
		int index=key.hashCode()%a.length;
		Node temp=a[index];
		while(temp!=null)
		{
			if(temp.key==key)
				return true;
			temp=temp.next;
		}
		return false;
	}
	
	Object get(k key)
	{
		int index=key.hashCode()%a.length;
		Node temp=a[index];
		while(temp!=null)
		{
			if(temp.key==key)
				return temp.value;
			temp=temp.next;
		}
		return false;
	}
	
	boolean containsValue(v value)
	{
		for (int i = 0; i < a.length; i++)
		{
		  Node temp=a[i];
		  while(temp!=null)
		  {
			  if(temp.value==value)
				  return true;
			  temp=temp.next;
		  }
		}
		return false;
	}
}