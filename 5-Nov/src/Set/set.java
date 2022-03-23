package Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class set {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(11);
		list.add(4);
		list.add(20);
		list.add(7);
		System.out.println("**********ArrayList*************");
		
		System.out.println("Arraylist Insertion Order: "+list);       //Insertion Order Maintain
		System.out.println(list);
		
		list.add(1,100);
		
		System.out.println("Arraylist Updated Value: "+list);
		System.out.println();
		
		System.out.println("***************LinkedList*****************");
		
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(40);
		list1.add(43);
		list1.add(37);
		list1.add(21);
		list1.add(81);
		list1.add(73);
		
		System.out.println("Linkedlist Insertion Order "+list1);                //Insertion Order Maintain
		list1.add(0, 100);
		System.out.println("Updated value: "+list1);
		
		System.out.println();
		System.out.println("****************HashMap***************");
		HashMap<Integer, Integer> Map=new HashMap<Integer,Integer>();
		Map.put(1, 1);
		Map.put(2, 2);		
		Map.put(8, 8);
		Map.put(6, 6);
		Map.put(9, 9);
		Map.put(3, 3);
		
		System.out.println("HashMap: "+Map);        //Insertion Order Not Maintain   @Sorted
		System.out.println("*************LinkedHashMap***************");
		
		LinkedHashMap<Integer, String> map1=new LinkedHashMap<Integer,String>();
		
		map1.put(5, "Five");
		map1.put(1, "One");
		map1.put(7, "Seven");
		map1.put(3, "Three");
		map1.put(2, "Two");
		map1.put(6, "six");
		
		System.out.println("LinkedHashMap: "+map1);   //Insertion Order Maintained
		
		System.out.println();
		System.out.println("");

	}

}
