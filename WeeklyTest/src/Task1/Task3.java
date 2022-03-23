package Task1;

import java.util.TreeMap;

public class Task3 {

	public static void main(String[] args) 
	{
		TreeMap<Integer, String> tree=new TreeMap <>();
		 
		  tree.put(4, "Pen");
		  tree.put(6, "Pencil");
		  tree.put(9, "Bag");
		  tree.put(2, "Watch");
		  tree.put(8, "Mobile");
		
		  
		  System.out.println(tree.containsValue("Bag"));

	}

}
