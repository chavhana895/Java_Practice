 package AssimentHW;

import java.util.Scanner;
class HW25 
 {

	public static void main(String[] args)
	{
		Student s1[]=new Student[10];
		
		Scanner sc=new Scanner(System.in);
		int roll;
		for (int i = 0; i < s1.length; i++)
		{
			
			System.out.println(s1[i]);
		}
	
		
	}

}
 class Student 
 {
	 int rollno, marks;
	 String name;
	public Student(int rollno, int marks, String name)
	{
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	void display()
	{
		System.out.println("Name :-"+name+"roll_name"+rollno+"\tmarks :-"+marks);
	}
	
 }
