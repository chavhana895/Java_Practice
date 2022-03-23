package CW1;

public class Student {

	int  rollnumber1;
	String name1;
	int contactNumbe1;
	int marks1;
	
	void inputData(int rn, String name,int contactNumber,int marks)
	{
		rollnumber1=rn;
		name1=name;
		contactNumbe1=contactNumber;
		marks1=marks;
	}
	void display()
	{
		System.out.println(rollnumber1+" "+name1+" "+contactNumbe1+" "+marks1);
	}}

