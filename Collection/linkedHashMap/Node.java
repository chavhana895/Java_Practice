package linkedHashMap;

public class Node<k, v> {

	k key;
	v value;
	Node<k, v> lNext;
	Node<k, v> hNext;

	public Node(k key, v value) {
		super();
		this.key = key;
		this.value = value;
	}

}
