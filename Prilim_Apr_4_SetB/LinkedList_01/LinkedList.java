package LinkedList_01;

public class LinkedList<type> {
	
	Node<type> root;
	
	public void print() {
		
		Node<type> temp=root;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public void add(type data) {
		
		if(root==null) {
			root=new Node<type>(data);
		}
		else {
			Node<type> temp=root;
			
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=new Node<type>(data);
			
		}
		
	}

}
