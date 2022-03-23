package Q3;

public class MyClass {

	public static void main(String[] args) 
	{
	  MyTreeMap map = new MyTreeMap();
	  map.put(3, "Three");
	  map.put(7, "Seven");
	  map.put(4, "Four");
	  map.put(2, "Two");
	  map.put(9, "Nine");
	  map.put(5, "five");
	  
	  map.print();
	  
	  System.out.println(map.get(7));
	}

}
