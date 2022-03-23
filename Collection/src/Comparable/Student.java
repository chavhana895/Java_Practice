package Comparable;

public class Student implements Comparable<Student>
{
int rn;
String name;
int marks;
public Student(int rn, String name, int marks) {
	super();
	this.rn = rn;
	this.name = name;
	this.marks = marks;
}
@Override
public int compareTo(Student nextStudent) 
{
	if(marks<nextStudent.marks)
	    return 1;
	
	else if(marks>nextStudent.marks)
		return -1;
	else
	    return 0;
}
@Override
public String toString() {
	return "Student [rn=" + rn + ", name=" + name + ", marks=" + marks + "]";
}


}
