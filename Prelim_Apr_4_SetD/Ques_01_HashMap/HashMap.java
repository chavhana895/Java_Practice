package Ques_01_HashMap;

public class HashMap<k, v> {
	
	Node[] a=new Node[5];
	
	public void print() {
		
		for (int i = 0; i < a.length; i++) {
			Node<k, v> temp=a[i];
			while(temp!=null) {
				System.out.println(temp.key+" "+temp.value);
				temp=temp.next;
			}
		}
		
	}
	
	public void add(k key, v value) {
		
		int index=key.hashCode()%a.length;
		if(a[index]==null) {
			a[index]=new Node<k, v>(key, value);
		}else {
			Node<k, v> temp=a[index];
			
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=new Node<k, v>(key, value);
		}
		
	}

}
