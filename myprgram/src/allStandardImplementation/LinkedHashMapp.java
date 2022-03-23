package allStandardImplementation;

import java.util.LinkedHashMap;

public class LinkedHashMapp {

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, String > linkHMap=new LinkedHashMap<>();
		linkHMap.put(22, "2222");
		linkHMap.put(99, "9999");
		linkHMap.put(11, "1111");
		linkHMap.put(33, "3333");
		linkHMap.put(88, "888");
		linkHMap.put(44, "444");
		System.out.println(linkHMap);
		System.out.println("LinedHashMap are main Insertion order");
		System.out.println("its not dempend no index its key ");
		

	}

}
