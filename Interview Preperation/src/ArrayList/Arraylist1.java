package ArrayList;


import java.util.*;

public class Arraylist1 {

	public static void main(String[] args) 
	{
	ArrayList <Integer> list = new ArrayList <>();

	list.add(34);
	list.add(14);
	list.add(39);
	list.add(19);
	list.add(27);
	
	Collections.sort(list);
	System.out.println(list);
	//System.out.println(list.get(list.size()-2));
	System.out.println(list.size());
	}

}