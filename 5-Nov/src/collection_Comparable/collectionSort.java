package collection_Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class collectionSort {

	public static void main(String[] args) {
		
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(1,"Somu"));
		list.add(new Student(3,"Gomu"));
		list.add(new Student(4,"Somya"));
		list.add(new Student(2,"Gomya"));
		
		Collections.sort(list);
		System.out.println(list);

	}

}
