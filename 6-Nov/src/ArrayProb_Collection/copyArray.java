package ArrayProb_Collection;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class copyArray {

	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(7);
		list.add(8);
		list.add(90);
		list.add(23);                                      //Copy of Array using Arraylist
		list.add(15);
		
		System.out.println(list);
		
		List<Integer> list2=new ArrayList<Integer>(list);
		System.out.println(list2);
		System.out.println();
		
		System.out.println("*******LinkedList***********");
		
		List<Integer> list3=new LinkedList<Integer>(list2);
		
		System.out.println(list3);
		
		List<Integer> list4=new ArrayList<Integer>(list3);
		System.out.println(list4);
		
		System.out.println();
		System.out.println("***********Copy Of Array using set************");
		
		Set<Integer> set=new HashSet<Integer>(list);
		System.out.println(set);
		
		System.out.println();
		System.out.println("*************************");
		
		
		
	}

}
