package LinkedHashMap;

public class Node
{
  int key;
  String value;
  Node hashMapNext;
  Node linkedListNext;
  
  Node(int key, String value)
  {
	  this.key=key;
	  this.value=value;
  }
}
