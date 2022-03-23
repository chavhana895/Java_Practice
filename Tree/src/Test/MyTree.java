package Test;

public class MyTree {

	Node root;
	int index=0;
	public void add(double data)
	{
		if(root==null)
		{
		root=new Node(data);
	
		}
		else
		{
			Node temp=root;
			while(true)
			{
				if(temp.data==data)
					break;
				else if(data<temp.data && temp.left==null)
				{
					temp.left=new Node(data);
					break;
				}
				else if(data<temp.data && temp.left!=null)
					temp=temp.left;
				else if(data>temp.data && temp.right==null)
				{
					temp.right=new Node(data);
				break;
				}
				else if(data>temp.data && temp.right!=null)
					temp=temp.right;
			}
		}
	}
	
	public boolean contains(double data) 
	{
		if(root==null)
			return false;
		else
		{
			Node temp=root;
			while(true)
			{
				if(temp.data==data)
					return true;
				else if(data<temp.data && temp.left!=null)
					temp=temp.left;
				else if(data>temp.data && temp.right!=null)
					temp=temp.right;
				else if (data<temp.data && temp.left==null)
					return false;
				else if(data>temp.data && temp.right==null)
					return false;
			}
		}
		
	}
	
	
	public void print()
	{
		printMyNode(root);
	}

	private void printMyNode(Node node) 
	{
	  if(node.right!=null)
		  printMyNode(node.right);
	  System.out.println(node.data+" ");
	  if(node.left!=null)
		  printMyNode(node.left);
		
	}
	
	
	public double[]toArray() 
	{
		if(root==null)
			return new double[0];
		double[]arr=new double[size()];
		index=0;
		addElementInArray(arr,root);
		return arr;	
	}

	public int size() 
	{
		if(root==null)
		return 0;
		else
		{
			int size=count(root);
			return size;
		}
	}

	

	private int count(Node temp) 
	{
		int size=1;
		if(temp.left!=null)
			size=size+count(temp.left);
		if(temp.right!=null)
			size=size+count(temp.right);
		return size;
	}
	
	public int sizeWithInstance(int size) 
	{
		return size;
	}

	private void addElementInArray(double[] arr, Node temp) 
	{
		if(temp.left!=null)
			addElementInArray(arr, temp.left);
		arr[index++]=temp.data;
		if(temp.right!=null)
		addElementInArray(arr, temp.right);	
	}
	
	public void clear() 
	{
	 root=null;	
	}
	
	public boolean isEmpty() 
	{
		if(root==null)
			return true;
		else
			return false;
	}
}
