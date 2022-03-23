package Collection_Comparator;

public class Student
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

}
