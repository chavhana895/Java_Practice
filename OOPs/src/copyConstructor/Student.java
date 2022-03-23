package copyConstructor;

public class Student {
	int rn;
	String name;
	int marks;
	
	public Student(Student s) {
		this.rn=s.rn;
		this.name=s.name;
		this.marks=s.marks;
		}
public Student(int rn,String name,int marks) {
	this.rn=rn;
	this.name=name;
	this.marks=marks;
	}	
void print()
{
	System.out.println(rn+" "+name+" "+marks);
}
	
}