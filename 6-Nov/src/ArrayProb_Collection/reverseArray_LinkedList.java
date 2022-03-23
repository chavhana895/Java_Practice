package ArrayProb_Collection;

import java.util.LinkedList;
import java.util.List;

public class reverseArray_LinkedList {

	public static void main(String[] args) 
	{
		List<Integer>list=new LinkedList<Integer>();

		list.add(12);
		list.add(4);
		list.add(7);
		list.add(88);
		list.add(23);
		list.add(12);
		System.out.println(list);
		
		int i=0;
		int j=list.size()-1;
		while(j>i)
		{
			Integer temp= list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
			i++;j--;
		}
		System.out.println(list);
	}

}
