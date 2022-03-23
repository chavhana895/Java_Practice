package DLinkedList;

public class MyDLinkedList<type> {

	Node<type> head;
	Node<type> tail;
	
	public void remove(int i) {
		
		if(i<0)
			throw new IndexOutOfBoundsException();
		
		if(i==0) {
			head=head.next;
			head.prev=null;
			return;
		}
		Node<type> temp=head;
		int index=0;
		while(temp!=null) {
			if(index==i-1) {
				if(temp.next==null) {
					throw new IndexOutOfBoundsException();
				}
				if(temp.next.next==null) {
					temp.next=null;
					tail=temp;
					return;
				}
				temp.next=temp.next.next;
				temp.next.prev=temp;
				return;
			}
			temp=temp.next;
			index++;
		}
		
		throw new IndexOutOfBoundsException();
		
	}
	
	public void add(int i, type data) {
		
		if(i<0)
			throw new IndexOutOfBoundsException();
		
		Node<type> obj=new Node<type>(data);
		if(i==0) {
			obj.next=head;
			head.prev=obj;
			head=obj;
			return;
		}
		Node<type> temp=head;
		int index=0;
		while(temp!=null) {
			if(index==i-1) {
				if(temp.next==null) {
					
					temp.next=obj;
					obj.prev=temp;
					tail=obj;
					return;
					
//					throw new IndexOutOfBoundsException();
				}
				obj.next=temp.next;
				temp.next.prev=obj;
				temp.next=obj;
				obj.prev=temp;
				return;
			}
			temp=temp.next;
			index++;
		}
		
		throw new IndexOutOfBoundsException();
		
		
	}
	
	public type[] toArray() {
		
		type[] a=(type[])new Object[size()];
		int index=0;
		
		Node<type> temp=head;
		while(temp!=null) {
			a[index++]=temp.data;
			temp=temp.next;
		}
		return a;
		
	}

	public int size() {
		
		Node<type> temp=head;
		int index=0;
		while(temp!=null) {
			temp=temp.next;
			index++;
		}
		return index;
		
	}
	
	public void backPrint() {

		Node<type> temp = tail;
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.prev;
		}

		System.out.println();
	}

	public String toString() {

		String s = "[";
		Node<type> temp = head;
		while (temp != null) {
			s += temp.data;
			if (temp.next != null) {
				s += ", ";
			}
			temp = temp.next;
		}
		return s += "]";

	}

	public void add(type data) {

		Node<type> obj = new Node<type>(data);
		if (head == null) {
			head = obj;
			tail = obj;
			return;
		} else {
			tail.next = obj;
			obj.prev = tail;
			tail = obj;
			return;
		}
	}

}
