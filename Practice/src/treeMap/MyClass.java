package treeMap;

public class MyClass {

	public static void main(String[] args) 
	{
	  MyTreeMap m = new MyTreeMap();
	  m.add(1, "One");
	  m.add(7, "Seven");
	  m.add(5, "Five");
	  m.add(8, "Eight");
	  m.add(4, "Four");
	  m.add(3, "Three");
	  
	  m.print();
	  
	  System.out.println("-----get Method-----");
	  System.out.println(m.get(5));
	}

}
