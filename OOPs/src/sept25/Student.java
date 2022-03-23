package sept25;

public class Student {
	
	int rollNumber;
	String name;
	int contactNumber;
	int marks;
	void inputData(int rn,String name,int contactNumber,int marks)
	{
		rollNumber=rn;
		this.name=name;
		this.contactNumber=contactNumber;
		this.marks=marks;
	}
	void disply()
	{
		System.out.println(rollNumber+" "+name+" "+contactNumber+" "+marks+" ");
	}
	

}
