package Collection;

import java.util.TreeMap;

public class TreeList {

	public static void main(String[] args) {

		TreeMap<Integer, String> list=new TreeMap<>();
		
		list.put(10, "Ten");
		list.put(1, "One");
		list.put(2, "Two");
		list.put(5, "Five");
		list.put(9, "Nine");
		list.put(6, "Six");
		
		System.out.println(list.get(9));
		System.out.println(list.containsValue("Six"));
		System.out.println(list.containsKey(2));
		System.out.println(list.firstKey());
		System.out.println(list.lastKey());
		System.out.println(list.remove(10));
		System.out.println(list.remove(1, "One"));
		
		System.out.println(list);
		
	}

}
