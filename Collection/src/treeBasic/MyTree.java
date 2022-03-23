package treeBasic;

public class MyTree 
{
Node root;
  
void print()
{
	printMyNode(root);
}

private void printMyNode(Node temp) 
{
	if(temp.left!=null)
		printMyNode(temp.left);
	System.out.println(temp.data);
	if(temp.right!=null)
		printMyNode(temp.right);
}

public void add(int data) 
{
	if(root==null)
		root=new Node(data);
	else
	{
		Node temp=root;
		while(true)
		{
			if(data==temp.data)
				return;
			else if(data<temp.data && temp.left==null)
			{
				temp.left=new Node(data);
				return;	
			}
			else if(data>temp.data && temp.right==null)
			{
				temp.right=new Node(data);
				return;
			}
			else if(data<temp.data
					&& temp.left!=null)
				temp=temp.left;
			else if(data>temp.data && temp.right!=null)
				temp=temp.right;
		}
	}
}
}
