package Collection_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Myclass {

	public static void main(String[] args) 
	{
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(1,"som"));
		list.add(new Student(3,"Gommhdvsdsyc"));
		list.add(new Student(4,"s"));
		list.add(new Student(2,"somsdv"));
		
		myComparator m=new myComparator();
		Collections.sort(list,m);
		
		System.out.println(list);
	}

}
