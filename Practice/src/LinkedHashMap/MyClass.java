package LinkedHashMap;

public class MyClass {

	public static void main(String[] args)
	{
		LHM map=new LHM();
		
		map.put(2, "Two");
		map.put(7, "Seven");
		map.put(4, "Four");
		map.put(3, "Three");
		map.put(1, "One");
		
		map.print();
		
		System.out.println("-------get Method-----");
		System.out.println(map.get(4));
	}

}
