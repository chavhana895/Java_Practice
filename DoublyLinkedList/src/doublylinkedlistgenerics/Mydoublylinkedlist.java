package doublylinkedlistgenerics;

public class Mydoublylinkedlist<E> {
	
	
	Node head;
	Node tail;
	
	
	public void add(E data)
	{
		if(head==null & tail==null)
		{
			Node obj=new Node(data);
			head=obj;
			tail=obj;
		}
		else
		{
			Node obj=new Node<E>(data);
			tail.next=obj;
			obj.prev=tail;
			tail=obj;
		}
	}
	public Object[] toArray()
	{
		Object[] arr=new Object[size()];
		int index=0;
		Node temp=head;
		while(temp!=null)
		{
			arr[index++]=temp.data;
			temp=temp.next;
				
		}
		return arr;
	}
	
	public String toString()
	{
		String s="";
		Node temp=head;
		while(temp!=null)
		{
			s=s+temp.data+" ";
			temp=temp.next;
		}
		return s;
	}
	public int size()
	{
		Node temp=head;
		int index=0;
		while(temp!=null)
		{
			temp=temp.next;
			index++;
		}
		return index;
		
	}
	public int lastIndexof(E data)
	{
		int lastIndex=size()-1;
		Node temp=tail;
		while(temp!=null)
		{
			if(temp.data==data)
				return lastIndex;
			temp=temp.prev;
			lastIndex--;
		}
		return -1;
	}
	public void remove(int i)
	{
		if(head==null)
			throw new IndexOutOfBoundsException();
		if(i==0)
		{
			head=head.next;
			head.prev=null;
		}
		else
		{
			int index=0;
			Node temp=head;
			while(index+1!=i)
			{
				if(temp.next!=null)
					temp=temp.next;
				else
					throw new IndexOutOfBoundsException();
				index++;
			}
			if(temp.next==tail)
			{
				temp.next=null;
				tail=temp;
			}
			else
			{
				temp.next=temp.next.next;
				temp.next.prev=temp;
			}
				
		}
			
	}
	
	
	public int indexof(E data)
	{
		Node temp=head;
		int index=0;
		while(temp!=null)
		{
			if(temp.data==data)
				return index;
			temp=temp.next;
			index++;
		}
		return -1;
	}
	
	
	
	public boolean contains(E data)
	{
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data==data)
				return true;
			temp=temp.next;
		}
		return false;
	}
	
	public void set(int i,E data)
	{
		if(i<0 || head==null)
			throw new IndexOutOfBoundsException();
		int index=0;
		Node temp=head;
		while(index!=i)
		{
			index++;
			if(temp.next!=null)
				temp=temp.next;
			else
				throw new IndexOutOfBoundsException();
		}
		temp.data=data;
		
	}
	
	public void add(int i,E data)
	{
		if(i<0)
			throw new IndexOutOfBoundsException();
		if(i==0)
		{
			Node obj=new Node<E>(data);
			head.prev=obj;
			obj.next=head;
			head=obj;
		}
		else
		{
			int index=0;
			Node temp=head;
			while(index+1!=i)
			{
				index++;
				if(temp.next!=null)
					temp=temp.next;
				else
				{
					throw new IndexOutOfBoundsException();
				}
			}
			if(temp.next==null)
			{
				add(data);
			}
			else
			{
				Node obj=new Node<E>(data);
				temp.next.prev=obj;
				obj.next=temp.next;
				temp.next=obj;
				obj.prev=temp;
				
			}
		}
		
	}
	
	
	public void forwardPrint()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	
	public void ReversePrint()
	{
		Node temp=tail;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.prev;
		}
	}

}
