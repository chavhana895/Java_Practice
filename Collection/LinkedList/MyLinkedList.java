package LinkedList;

public class MyLinkedList<type> {
	
	Node<type> root;
	
	public void remove(int i) {
		
		if(i<0)
			throw new IndexOutOfBoundsException();
		
		if(i==0) {
			root=root.next;
			return;
		}
		
		Node<type> temp=root;
		int index=0;
		
		while(temp!=null) {
			if(index==i-1) {
				if(temp.next==null) {
					throw new IndexOutOfBoundsException();
				}
				temp.next=temp.next.next;
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
			obj.next=root;
			root=obj;
			return;
		}else {
			Node<type> temp=root;
			int index=0;
			while(temp!=null) {
				if(index==i-1) {
					obj.next=temp.next;
					temp.next=obj;
					return;
				}
				temp=temp.next;
				index++;
			}
		}
		
		throw new IndexOutOfBoundsException();
		
	}
	
	public type[] toArray() {
		
		type[] a=(type[])new Object[size()];
		int index=0;
		Node<type> temp=root;
		while(temp!=null) {
			a[index++]=temp.data;
			temp=temp.next;
		}
		return a;
		
	}
	
	public int size() {
		
		Node<type> temp=root;
		int index=0;
		while(temp!=null) {
			temp=temp.next;
			index++;
		}
		return index;
		
	}
	
	public String toString() {
		
		Node<type> temp=root;
		String s="[";
		while(temp!=null) {
			s+=temp.data;
			if(temp.next!=null) {
				s+=", ";
			}
			temp=temp.next;
		}
		return s+="]";
		
	}
	
	public void add(type data) {
		
		Node<type> obj=new Node<type>(data);
		if(root==null) {
			root=obj;
		}else {
			Node<type> temp=root;
			
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=obj;
			
		}
		
	}

}
