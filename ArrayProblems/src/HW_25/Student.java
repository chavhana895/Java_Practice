package HW_25;

public class Student {
int rn;
int marks;
String name;
public Student(int rn, int marks, String name)
{
	super();
	this.rn = rn;
	this.marks = marks;
	this.name = name;
	
	
}
@Override
public String toString() {
	return "Student [rn=" + rn + ", marks=" + marks + ", name=" + name + "]";
}


}
