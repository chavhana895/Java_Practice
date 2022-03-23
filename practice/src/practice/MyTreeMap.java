package practice;

public class MyTreeMap {
Node root;

public void add(int key, String Value) 
{
	if(root==null)
		root=new Node(key,Value);
	else
	{
		Node temp=root;
		while(true)
		{
			if(temp.key==key)
			{
				temp.value=Value;
				break;
			}
			else if(key<temp.key && temp.left==null)
			{
				temp.left=new Node(key, Value);
				break;
			}
			else if(key<temp.key && temp.left!=null)
				temp= temp.left;
			else if(key>temp.key && temp.right==null)
			{
				temp.right=new Node(key,Value);
				break;
			}
			else if(key>temp.key && temp.right!=null)
				temp=temp.right;
		}
	}
}

public void print() 
{
	
}
}
