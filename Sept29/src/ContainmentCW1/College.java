package ContainmentCW1;

public class College {
String collegeName;

Address collegeAddress;

public College(String collegeName, Address collegeAddress) {
	super();
	this.collegeName = collegeName;
	this.collegeAddress = collegeAddress;
}
void displayCollegeDetails()
{
	System.out.println("College Name: "+collegeName+" "+"college Address: ");
}
}
