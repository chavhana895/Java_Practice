package getMethod;

public class MyLinkedList <E> {
Node root;
	public E get(int i) 
	{
		if(root==null)
			return null;
		int index=0;
		Node temp=root;
		while(true)
		{
			if(i==index)
				return (E) temp.data;
			if(temp.next==null)
			{
				throw new IndexOutOfBoundsException();
			}
			else
			{
				temp=temp.next;
				index++;
			}
		}
	}
}
