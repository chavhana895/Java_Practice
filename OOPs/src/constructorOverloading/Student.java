package constructorOverloading;

public class Student {
	int rn;
	String name;
	int marks;
	Student (int newRn)
	{
		rn=newRn;
	}
	Student (int newRn, String newName)
	{    rn= newRn;
		name=newName;
	}
	Student(int newRn,String newName,int newMarks)
	{
		rn=newRn;
		name=newName;
		marks=newMarks;
	}
	void print()
	{
		System.out.println(rn);
	}

}
