package Exam;

public class doublyLinkedList <E> {
 E data;
 Node head;
 Node tail;
 
 public void add(E data) 
 {
	if(head==null & tail==null)
	{
		Node obj = new Node <E>(data);
		head=obj;
		tail=obj;
	}
	else
	{
		Node obj=new Node <E>(data);
		tail.next=obj;
		obj.next=tail;
		tail=obj;
	}
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


public void forwardPrint() 
{
	Node temp=head;
	while(temp!=null)
	{
		System.out.println(temp.data);
		temp=temp.next;
	}
}


public void reversePrint() 
{
	Node temp=tail;
	while(temp!=null)
	{
		System.err.println(temp.data);
		temp=temp.prev;
	}
}


public Object [] toArray() 
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

public int size() {
	// TODO Auto-generated method stub
	return 0;
}
}
