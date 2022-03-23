package TreeList;

public class TreeList {

	Node root;
	
	public String toString() {
		
		String s="";
		s=printMyNode(root, s);
		
		return s;
	}
	
	private String printMyNode(Node temp, String s) {

		if(temp.left!=null) {
			s=printMyNode(temp.left, s);
		}
		s+=temp.data+" ";
		if(temp.right!=null) {
			s=printMyNode(temp.right, s);
		}
		return s;
		
	}
	
	public void print() {
		
		printMyNode(root);
		System.out.println();
	}

	private void printMyNode(Node temp) {

		if(temp.left!=null) {
			printMyNode(temp.left);
		}
		System.out.print(temp.data+" ");
		if(temp.right!=null) {
			printMyNode(temp.right);
		}
		
	}

	public void add(int data) {

		if (root == null) {
			root = new Node(data);
			return;
		}

		Node temp = root;
		while (true) {
			if (temp.data == data) {
				return;
			} else if (data < temp.data && temp.left == null) {
				temp.left = new Node(data);
				return;
			} else if (data > temp.data && temp.right == null) {
				temp.right = new Node(data);
				return;
			} else if (data < temp.data && temp.left != null) {
				temp = temp.left;
			} else if (data > temp.data && temp.right != null) {
				temp = temp.right;
			}
		}
	}

}
