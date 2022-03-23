package ArrayList_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> list=new ArrayList<Student>();
		
		list.add(new Student(1, "Somu", 40));
		list.add(new Student(2, "Gomu", 39));
		list.add(new Student(3, "Somya", 37));
		list.add(new Student(4, "Gomya", 38));
		list.add(new Student(5, "Sonya", 41));
		
		Collections.sort(list, new Teacher());
		
		System.out.println(list);
		
		
	}

}
