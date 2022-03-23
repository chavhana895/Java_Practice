package arrayListMethods;

import java.util.ArrayList;

public class Basic {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		System.out.println(list);
  
		list.remove(1);
		System.out.println(list);
		
		System.out.println(list.contains(3));
		
		System.out.println(list.get(3));
		
	
		System.out.println(list.set(3, 100));
		System.out.println(list);
		
		System.out.println(list.lastIndexOf(70));
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		//System.out.println(list.toArray());
        
	}

}

