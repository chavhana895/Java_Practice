package ArrayProb_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class copyArray_Linkedlist {

	public static void main(String[] args) {
		
		List<Integer> list=new LinkedList<Integer>();    //Copy of Array using LinkedList
		list.add(5);
		list.add(7);
		list.add(8);
		list.add(90);
		list.add(23);
		list.add(15);
		
		System.out.println(list);
		
		List<Integer> list4=new ArrayList<Integer>(list);
		System.out.println(list4);
	}

}
