package Ques;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListComparable_08 {

	public static void main(String[] args) {

		ArrayList<Student1> list = new ArrayList<>();

		list.add(new Student1("Somu", 1, 41));
		list.add(new Student1("Somya", 2, 39));
		list.add(new Student1("Gomu", 3, 40));
		list.add(new Student1("Gomya", 4, 38));
		
		Collections.sort(list);
		
		System.out.println(list);
		

	}

}

class Student1 implements Comparable<Student1> {

	String name;
	int ro;
	int marks;

	public Student1(String name, int ro, int marks) {
		super();
		this.name = name;
		this.ro = ro;
		this.marks = marks;
	}

	public int compareTo(Student1 s) {
		if (s.marks < marks) {
			return 1;
		} else if (s.marks > marks) {
			return -1;
		} else
			return 0;
	}

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", ro=" + ro + ", marks=" + marks + "]";
	}
}