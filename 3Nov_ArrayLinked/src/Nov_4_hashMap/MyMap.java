package Nov_4_hashMap;

public class MyMap <D1,D2>
{
Node<D1,D2> []a=new Node[5];

public boolean contains(D1 key) 
{
	int index=key.hashCode()%a.length;
	Node temp=a[index];
	while(temp!=null)
	{
		if(temp.kay==key)
			return true;
		temp=temp.next;
	}
	return false;
}

public D2 get(D1 key) 
{
	int index=key.hashCode()%a.length;
	Node temp=a[index];
	while(temp!=null)
	{
		if(temp.kay==key)
			return (D2) temp.value;
		temp=temp.next;
	}
	return null;
}

public void put(D1 key, D2 value) 
{
	int index=key.hashCode()%a.length;
	Node temp=a[index];
	if(temp==null)
		a[index]=new Node(key,value);
	else
	{
		boolean shouldWeAddNewObj=true;
		while(temp.next!=null)
		{
			if(temp.kay==key)
			{
				temp.value=value;
				shouldWeAddNewObj=false;
				break;
			}
			temp=temp.next;
		}
		if(shouldWeAddNewObj)
		{
			if(temp.kay==key)
				temp.value=value;
			else
				temp.next=new Node(key,value);
		}
	}
}

public void print() 
{
	for (int i = 0; i < a.length; i++) 
	{
		Node temp=a[i];
		while(temp!=null)
		{
			System.out.println(temp.kay+" "+temp.value);
			temp=temp.next;
		}
	}
}

public void replace(D1 key, D2 value) 
{
	int index=key.hashCode()%a.length;
	Node temp=a[index];
	while(temp!=null)
	{
		if(temp.kay==key)
		{
			temp.value=value;
			break;
		}
		temp=temp.next;
	}
}

public void remove(D1 key) 
{
	int index=key.hashCode()%a.length;
	Node temp=a[index];
	if(temp!=null)
	{
			if(temp.kay==key)
			{
				a[index]=temp.next;
			}
			else
			{
				while(true)
				{
					if(temp.next==null)
				     break;
				if(temp.next==key)
					temp.next=temp.next.next;
				break;
				}
			}
		}
	}
}
