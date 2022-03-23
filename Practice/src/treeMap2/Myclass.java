package treeMap2;

public class Myclass
{
	public static void main(String[] args) 
	{
	  MyTreeMap map = new MyTreeMap();
	  map.put(3, "Three");
	  map.put(5, "Five");
	  map.put(6, "six");
	  map.put(4, "Four");
	  map.put(9, "Nine");
	  map.put(7, "Seven");
	  
	  map.print();
	  
	  System.out.println("------get Method-----");
	  
	  System.out.println(map.get(9));
	}
}
