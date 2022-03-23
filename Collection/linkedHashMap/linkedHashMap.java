package linkedHashMap;

public class linkedHashMap<k, v> {

	Node<k, v> root;
	Node[] a = new Node[5];
	
	public String toString() {
		
		String s="[";
		Node<k, v> temp = root;
		while (temp != null) {
			s+=temp.key+" "+temp.value+" ";
			if(temp.lNext!=null) {
				s+=", ";
			}
			temp = temp.lNext;
		}
		return s+"]";
		
	}

	public boolean contiansValue(v value) {

		Node<k, v> temp = root;
		while (temp != null) {
			if (temp.value == value) {
				return true;
			}
			temp = temp.lNext;
		}
		return false;

	}

	public v get(k key) {

		int index = key.hashCode() % a.length;
		Node<k, v> temp = a[index];
		while (temp != null) {
			if (temp.key == key) {
				return (v) temp.value;
			}
			temp = temp.hNext;
		}
		return null;

	}

	public void hashPrint() {

		for (int i = 0; i < a.length; i++) {
			Node<k, v> temp = a[i];
			while (temp != null) {
				System.out.println(temp.key + " " + temp.value);
				temp = temp.hNext;
			}
		}

	}

	public void print() {

		Node<k, v> temp = root;
		while (temp != null) {
			System.out.println(temp.key + " " + temp.value);
			temp = temp.lNext;
		}

	}

	public void add(k key, v value) {

		int index = key.hashCode() % a.length;
		if (a[index] == null) {
			a[index] = new Node<k, v>(key, value);
		} else {
			Node<k, v> temp = a[index];
			while (temp.hNext != null) {
				temp = temp.hNext;
			}
			temp.hNext = new Node<k, v>(key, value);
		}

		if (root == null) {
			root = new Node<k, v>(key, value);
		} else {
			Node<k, v> temp = root;
			while (temp.lNext != null) {
				temp = temp.lNext;
			}
			temp.lNext = new Node<k, v>(key, value);
		}
	}

}
