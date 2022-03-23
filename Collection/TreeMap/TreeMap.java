package TreeMap;

public class TreeMap {

	Node root;

	public String get(int key) {

		Node temp = root;
		while (true) {
			if (temp.key == key) {
				return temp.value;
			} else if (key < temp.key && temp.left == null) {
				return null;
			} else if (key > temp.key && temp.right == null) {
				return null;
			} else if (key < temp.key && temp.left != null) {
				temp = temp.left;
			} else if (key > temp.key && temp.right != null) {
				temp = temp.right;
			}
		}
	}

	public boolean containsValue(String value) {

		boolean result = false;
		result = findValue(root, value, result);
		return result;

	}

	private boolean findValue(Node temp, String value, boolean result) {

		if (temp.left != null) {
			result = findValue(temp.left, value, result);
		}
		if (temp.value == value) {
			result = true;
		}
		if (temp.right != null) {
			result = findValue(temp.right, value, result);
		}
		return result;

	}

	public void print() {

		printMyNode(root);
		System.out.println();
	}

	private void printMyNode(Node temp) {

		if (temp.left != null) {
			printMyNode(temp.left);
		}
		System.out.println(temp.key + " " + temp.value);
		if (temp.right != null) {
			printMyNode(temp.right);
		}

	}

	public String toString() {
		String s = "";
		s = printMyNode(root, s);
		return s;
	}

	private String printMyNode(Node temp, String s) {

		if (temp.left != null) {
			s = printMyNode(temp.left, s);
		}
		s += temp.key + " " + temp.value + " ";
		if (temp.right != null) {
			s = printMyNode(temp.right, s);
		}
		return s;

	}

	public void add(int key, String value) {

		if (root == null) {
			root = new Node(key, value);
			return;
		}
		Node temp = root;
		while (true) {
			if (temp.key == key) {
				return;
			} else if (key < temp.key && temp.left == null) {
				temp.left = new Node(key, value);
				return;
			} else if (key > temp.key && temp.right == null) {
				temp.right = new Node(key, value);
				return;
			} else if (key < temp.key && temp.left != null) {
				temp = temp.left;
			} else if (key > temp.key && temp.right != null) {
				temp = temp.right;
			}

		}
	}
}
