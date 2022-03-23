package HashMap;

public class HashMap<k, v> {

	Node[] a = new Node[5];
	
	

	public String toString() {
		String s = "[";
		for (int i = 0; i < a.length; i++) {
			Node<k, v> temp = a[i];
			if (temp != null) {
				s += temp.key + " " + temp.value;
				if(i<a.length-1 || temp.next!=null) {
					s+=", ";
				}
				temp = temp.next;
			}
		}
		return s+="]";

	}

	public void add(k key, v value) {

		Node<k, v> obj = new Node<k, v>(key, value);
		int index = key.hashCode() % a.length;
		if (a[index] == null) {
			a[index] = obj;
			return;
		}
		Node<k, v> temp = a[index];
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = obj;
	}

}
