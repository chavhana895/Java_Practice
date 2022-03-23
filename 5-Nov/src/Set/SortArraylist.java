package Set;

import java.util.ArrayList;

public class SortArraylist {

	public static void main(String[] args) {


		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(34);
		list.add(23);
		list.add(81);
		list.add(78);
		list.add(97);
		list.add(15);
		
		for (int i = 0; i < list.size(); i++) 
		{
			for (int j = i+1; j < list.size(); j++) 
			{ if(list.get(i)>list.get(j))
			{
				int  tempi = list.get(i);
				int tempj=list.get(j);
				list.set(i, tempj);
				list.set(j, tempi);
			}
			}
		}
		System.out.println(list);

	}

}
