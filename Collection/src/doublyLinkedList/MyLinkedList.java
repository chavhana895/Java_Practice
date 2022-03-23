package doublyLinkedList;

public class MyLinkedList <p>
{
 private Node <p> head;
 private Node <p> tail;
 
 int indexOf(p data)
 {
	 Node<p> temp=head;
	 int index=0;
	 while(temp!=null)
	 {
		 if(temp.data==data)
		 {
			 return index;
		 }
		 temp=temp.next;
		 index++;
	 }
	 return -1; 
 }
 
 void remove(int i)
 {
	 if(i<0)
		 throw new ArrayIndexOutOfBoundsException();
	 if(i==0)
	 {
		 head=head.next;
		 head.prev=null;
		 return;
	 }
	 Node<p> temp=head;
	 int index=0;
	 while(temp!=null)
	 {
		 if(index==i-1)
		 {
			 if(temp.next==null)
			 {
				 throw new ArrayIndexOutOfBoundsException();
			 }
			 if(temp.next.next==null)
			 {
				 temp.next=null;
				 tail=temp;
				 return;
			 }
			 else
			 {
				 temp.next=temp.next.next;
				 temp.next.prev=temp;
				 return;
			 }
		 }
		 temp=temp.next;
		 index++;
	 }
	 throw new ArrayIndexOutOfBoundsException();
 }
 
 
 int lastIndexOf(p data)
 {
	 int returnValue=-1;
	 Node<p> temp=head;
	 int index=0;
	 while(temp!=null)
	 {
		 if(temp.data==data)
		 {
			 returnValue=index;
		 }
		 temp=temp.next;
		 index++;
	 }
	 return returnValue;
 }
 
 
 p get(int i)
 {
	 if(i<0)
		 throw new ArrayIndexOutOfBoundsException();
	 Node <p> temp =head;
	 int index=0;
	 while(temp!=null)
	 {
		 if(index==i)
		 {
			 return temp.data;
		 }
		 temp=temp.next;
		 index++;
	 }
	 throw new ArrayIndexOutOfBoundsException();
 }
 
 
 void set(int i, p data)
 {
	 if(i<0)
		 throw new ArrayIndexOutOfBoundsException();
	 Node <p> temp =head;
	 int index=0;
	 while(temp!=null)
	 {
		 if(index==i)
		 {
			temp.data=data;
			return;
		 }
		 temp=temp.next;
		 index++;
	 }
	 throw new ArrayIndexOutOfBoundsException();
 }
 
 
 void add(int i , p data)
 {
	 if(i<0)
		 throw new ArrayIndexOutOfBoundsException();
	 if(i==0)
	 {
		 Node <p> obj=new Node <p> (data);
		 obj.next=head;
		 head.prev=obj;
		 head=obj;
		 
//		 add(data);
		 return;
	 }
	 Node <p> temp=head;
	 int index=0;
	 while(temp!=null)
	 {
		 if(index==i-1)
		 {
			 Node <p> obj = new Node<p>(data);
			 obj.next=temp.next;
			 if(temp.next!=null)
				 temp.next.prev=obj;
			 else
				 tail=obj;
			 temp.next=obj;
			 obj.prev=temp;
			 return;
		 }
		 temp=temp.next;
		 index++;
	 }
	 throw new ArrayIndexOutOfBoundsException();
 }
 
 void revPrint()
 {
	 Node <p>temp=tail;
	 while(temp!=null)
	 {
		 System.out.print(temp.data+" ");
		 temp=temp.prev;
	 }
	 System.out.println();
 }
 
 void frwPrint()
 {
	 Node<p> temp=head;
	 while(temp!=null)
	 {
		 System.out.print(temp.data+" ");
		 temp=temp.next;
	 }
	 System.out.println();
 }
 
  void add(p data)
   {
	 if(head==null)
	 {
		 Node<p> obj = new Node<p>(data);
		 head=obj;
		 tail=obj;
	 }
	 else
	 {
		 Node<p> obj = new Node<p>(data);
		 tail.next=obj;
		 obj.prev=tail;
		 tail=obj;				 
	 }
 }
}
