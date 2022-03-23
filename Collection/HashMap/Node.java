package HashMap;

public class Node<k, v> {

	k key;
	v value;
	Node<k, v> next;

	public Node(k key, v value) {
		super();
		this.key = key;
		this.value = value;
	}

}
