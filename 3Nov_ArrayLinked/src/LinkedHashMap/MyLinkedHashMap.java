package LinkedHashMap;

public class MyLinkedHashMap 
{
  Node[]a=new Node[5];
  Node llroot;
  
  public String get(int key) 
  {
	int index=key%a.length;
	Node temp=a[index];
	
	while(temp!=null)
	{
		if(temp.key==key)
			return temp.value;
		temp=temp.hashTableNext;
	}
	return null;
}
  
  public void print() 
  {
	Node temp=llroot;
	while(temp!=null)
	{
		System.out.println(temp.key+" "+temp.value);
		temp=temp.linkedListNext;
	}
}
  
  public void add(int key, String value)
  {
	  Node obj=new Node(key,value);
	  //Add in hashtable blue line
	  int index=key%a.length;
	  Node temp=a[index];
	  if(temp==null)
	  {
		  a[index]=obj;
	  }
	  else
	  {
		  while(temp.hashTableNext!=null)
		  {
			  temp=temp.hashTableNext;
		  }
		  temp.hashTableNext=obj;
	  }//add in linkedlist red line
	  if(llroot==null)
		  llroot=obj;
	  else
	  {
		  temp=llroot;
		  while(temp.linkedListNext!=null)
		  {
			  temp=temp.linkedListNext;
		  }
		  temp.linkedListNext=obj;
	  }
	  
  }
  
}
