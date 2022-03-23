package TreeMap;

public class MyClass {

	public static void main(String[] args) 
	{
	   MyTreeMap map= new MyTreeMap();
	   
	   map.add(1, "One");
	   map.add(7, "Seven");
	   map.add(3, "Three");
	   map.add(9, "Nine");
	   map.add(4, "Four");
	   map.add(2, "Two");
	                                                    
	   map.print();
	   System.out.println("-----get Method----");
	   System.out.println(map.get(4));
	}
}