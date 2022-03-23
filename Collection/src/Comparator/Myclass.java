package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Myclass {

	public static void main(String[] args)
	{
	  ArrayList<Student> list=new ArrayList<Student>();
	  
	list.add(new Student(1,"Somu",40));
	list.add(new Student(2,"Gomu",41));
	list.add(new Student(3,"Somya",39));
	list.add(new Student(4,"Gomya",38));
	
	Collections.sort(list,new Abcd());
	
	System.out.println(list);
	
	}
}