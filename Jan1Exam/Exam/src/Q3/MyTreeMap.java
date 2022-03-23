package Q3;

public class MyTreeMap 
{
Node root;

void put(int key,String value)
{
	if(root==null)
	{
		root=new Node(key, value);
	}
	else
	{
		Node temp=root;
		while(true)
		{
		if(key==temp.key)
		{
			temp.value=value;
			return;
		}
		else if(key<temp.key && temp.left==null)
		{
			temp.left= new Node(key, value);
			return;
		}
		else if(key>temp.key && temp.right==null)
		{
			temp.right= new Node(key, value);
			return;
		}
		else if(key<temp.key && temp.left!=null)
		 temp=temp.left;
		else if(key>temp.key && temp.right!=null)
			temp=temp.right;
		}
	}
}

String get(int key)
{
	Node temp=root;
	if(temp.key==key)
	{
	 return temp.value;
	}
	return "-1" ;
	
}














void print()
{
	Node temp=root;
	if(temp==null)
	{
		
	}
	else
	{
		while(true)
		{
			
		}
	}
}
}
