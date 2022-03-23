package allStandardImplementation;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args)
	{
		LinkedList<Integer> list=new LinkedList<>();
		list.add(11);
		list.add(55);
		list.add(99);
		list.add(33);
		list.add(22);
		System.out.println("Linked list  are Maintain sorting  order");
		System.out.println(list);
		System.out.println("also index value :-  "+list.get(0));
		System.out.println("  "+list.set(4, 99));
		System.out.println(list);


	}

}
