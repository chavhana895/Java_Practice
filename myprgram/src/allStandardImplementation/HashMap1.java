package allStandardImplementation;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hashmap=new HashMap<Integer, String>();
		hashmap.put(1, "one");
		hashmap.put(9, "nine");
		hashmap.put(7, "seven");
		hashmap.put(2, "two");
		hashmap.put(33, "three");
		hashmap.put(11, "oneeee");
		System.out.println("hashMap are not maintain inserton oreder also it can not  maintain sortd from");
		System.out.println(hashmap);
		System.out.println("also it can not cantain index value");
		
	}

}
