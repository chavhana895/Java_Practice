package Comparator;

import java.util.*;
import java.util.Collections;

public class MyClass {

	public static void main(String[] args)
	{
	  ArrayList<Student> list= new ArrayList<>();
	  
	  list.add(new Student(1,"Somu",40));
	  list.add(new Student(2,"Gomu",39));
	  list.add(new Student(3,"Somya",41));
	  list.add(new Student(4,"Gomya",38));
	  
	  Collections.sort(list,new Abcd());
	  
	  System.out.println(list);
	  
	}

}
