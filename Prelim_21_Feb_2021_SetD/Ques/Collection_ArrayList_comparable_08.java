package Ques;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_ArrayList_comparable_08 {

	public static void main(String[] args) {

		ArrayList<Student2> list = new ArrayList<>();

		list.add(new Student2(6, "Sonya", 40));
		list.add(new Student2(1, "Somu", 40));
		list.add(new Student2(2, "Somya", 41));
		list.add(new Student2(4, "Gomya", 37));
		list.add(new Student2(5, "Sonu", 39));
		
		Collections.sort(list);

		System.out.println(list);
	}

}

class Student2 implements Comparable<Student2> {

	int ro;
	String name;
	int marks;

	public Student2(int ro, String name, int marks) {
		super();
		this.ro = ro;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public int compareTo(Student2 s) {
		if (s.marks == marks) {
			if ( (int) (s.name.charAt(2)) < (int) (name.charAt(2))) {
				return 1;
			} else if ((int) (s.name.charAt(2)) > (int) (name.charAt(2))) {
				return -1;
			} else {
				return 0;  
			}
		} else if (s.marks < marks) {
			return 1;
		} else if (s.marks > marks) {
			return -1;
		} else {
			return 0;
		}

	}

	@Override
	public String toString() {
		return "Student2 [ro=" + ro + ", name=" + name + ", marks=" + marks + "]";
	}
}
