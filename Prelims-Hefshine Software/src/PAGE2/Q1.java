package PAGE2;

import java.util.ArrayList;
import java.util.List;

public class Q1 {

	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		System.out.println(list);
		int i=0;
		int j=list.size()-1;
		while(j>i)
		{
			Integer temp=list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
			i++;j--;
		}
		System.out.println(list);
	}

}
