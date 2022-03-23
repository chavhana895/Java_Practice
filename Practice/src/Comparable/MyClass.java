package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class MyClass {

	public static void main(String[] args)
	{
		ArrayList<Student> list=new ArrayList<>();
		
		list.add(new Student(1,"Somu",40));
		list.add(new Student(2,"Gomu",41));
		list.add(new Student(3,"Somya",39));
		list.add(new Student(4,"Gomya",38));
		
		Collections.sort(list);
		System.out.println(list);
	}

}
