package HashMap;

public class Myclass {

	public static void main(String[] args)
	{
	  MyHashMap<Integer,String> map=new MyHashMap<>();
	  
	  map.add(10, "Ten");
	  map.add(9, "Nine");
	  map.add(2, "Two");
	  map.add(7, "Seven");
	  map.add(3, "Three");
	  
	  map.print();
	  System.out.println("----get method----");
	  System.out.println(map.get(10));
	  System.out.println("-----containsValue----");
	  System.out.println(map.contains(700));
	  System.out.println("-----size Method----");
	  System.out.println(map.size());
	  System.out.println("-----contains method----");
	  System.out.println(map.contains(7));
	}

}
