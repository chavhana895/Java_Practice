package treeMap3;

public class Myclass {

	public static void main(String[] args) 
	{
		MyTreeeMap map=new MyTreeeMap();
		
		map.add(2, "Two");
		map.add(7, "Seven");
		map.add(5, "Five");
		map.add(10, "Ten");
		map.add(4, "Four");
		
		map.print();
		
		System.out.println("----get Method----");
		System.out.println(map.get(3));
	}

}
