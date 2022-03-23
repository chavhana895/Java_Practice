package collection_Comparable;

public class Student implements Comparable<Student> 
{
int rn;
String name;
public Student(int rn, String name) 
{
	super();
	this.rn = rn;
	this.name = name;
}
@Override
public String toString() {
	return "Student [rn=" + rn + ", name=" + name + "]";
}
@Override
public int compareTo(Student s) {
	if(this.rn>s.rn)
		return 1;
	else if(this.rn<s.rn)
		return -1;
	else
	return 0;
}

}
