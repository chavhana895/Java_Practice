package LinkedHashMap;

public class MyClass {

	public static void main(String[] args)
	{
	  MyLinkedHashMap map= new MyLinkedHashMap();
	  
	  map.put(2, "Two");
	  map.put(9, "Nine");
	  map.put(7, "Seven");
	  map.put(8, "Eight");
	  map.put(5, "five");
	  map.put(1, "One");
	  
	  map.print();
	  System.out.println("-----get Method----");
	  System.out.println(map.get(8));
	}

}
