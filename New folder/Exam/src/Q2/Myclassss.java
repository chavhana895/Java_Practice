package Q2;

import java.util.TreeMap;

public class Myclassss {

	public static void main(String[] args) 
	{
	  TreeMap<Integer, String> map= new TreeMap<>();
	  
	  map.put(1, "One");
	  map.put(6, "Six");
	  map.put(3, "Three");
	  map.put(8, "Eight");
	  map.put(7, "Seven");
	  
	  System.out.println(map.toString());
	  System.out.println(map.get(8));
	  
	}

}
