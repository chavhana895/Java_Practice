package LinkedList;

import java.util.Arrays;

public class MyClass {

	public static void main(String[] args) {
		
		MyLinkedList<Integer> list=new MyLinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		
		System.out.println(list);
		list.add(7, 5);
		list.remove(7);
		System.out.println(Arrays.toString(list.toArray()));
	}
	
}
