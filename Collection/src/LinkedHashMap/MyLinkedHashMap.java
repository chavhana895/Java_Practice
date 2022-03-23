package LinkedHashMap;

public class MyLinkedHashMap 
{
  Node root;
  Node []a=new Node[5];
  
  void put(int key, String value)
  {
	  //create an object
	  Node obj=new Node(key,value);
	  //add in hashmap
	  int index=key%a.length;  
	  if(a[index]==null)
	  {
		  a[index]=obj;
	  }
	  else
	  {
		  Node temp=a[index];
		  while(temp.hashMapNext!=null)
		  {
			  temp=temp.hashMapNext;
		  }
		  temp.hashMapNext=obj;
	  }
	  
	  //add in linkedList
	  if(root==null)
	  root=obj;
	  else
	  {
		  Node temp=root;
		  while(temp.linkedListNext!=null)
		  {
			  temp=temp.linkedListNext;
		  }
		  temp.linkedListNext=obj;
	  }
  }
  
  void print()        //LinkedList    Insertion Order Manitained
  {
	  Node temp=root;
	  
	  while(temp!=null)
	  {
		  System.out.println(temp.key+" "+temp.value);
		  temp=temp.linkedListNext;
	  }
  }
  
  String get(int key)
  {
	  int index=key%a.length;
	  Node temp=a[index];
	  
	  while(temp!=null)
	  {
		  if(temp.key==key)
			  return temp.value;
		  temp=temp.hashMapNext;
	  }
	  return null;
  }
}
