package TreeMap_4Nov;

public class MyTreeMap {
Node root;

public void add(int key, String value)
{
	if(root==null)
		root=new Node(key,value);
	else
	{
		Node temp=root;
		while(true)
		{
			if(temp.key==key)
			{
				temp.value=value;
				break;
			}
			else if(key<temp.key && temp.left==null)
			{
				temp.left=new Node(key, value);
			break;
			}
			else if(key<temp.key && temp.left!=null)
				temp=temp.left;
			else if(key>temp.key && temp.right==null)
			{
				temp.right=new Node(key, value);
				break;
			}
			else if(key>temp.key && temp.right!=null)
				temp=temp.right;
		}
	}
		
}

public void print() 
{
	myPrintNode(root);
}

private void myPrintNode(Node temp) 
{
	if(temp.left!=null)
		myPrintNode(temp.left);
	System.out.println(temp.key+" "+temp.value);
	if(temp.right!=null)
		myPrintNode(temp.right);	
}

public String get(int key) 
{
	Node temp=root;
	if(temp==null)
		return null;
	else
	{
		while(true)
		{
			if(key==temp.key)
				return temp.value;
			else if(key<temp.key && temp.left!=null)
				temp=temp.left;
			if(temp.key==key && temp.left==null)
				return null;
			else if(temp.key==key && temp.right==null)
				return null;
			else if(key>temp.key && temp.right!=null)
				temp=temp.right;
		}
	}
}
}
