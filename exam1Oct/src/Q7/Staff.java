package Q7;

public class Staff {
String employeeName;
String employeeAddress;
public Staff(String employeeName, String employeeAddress) {
	super();
	this.employeeName = employeeName;
	this.employeeAddress = employeeAddress;
}
void displyStaffDetails()
{
	System.out.println(employeeName+" "+employeeAddress);
}
College c=new College("BNCOE","Pusad");
}
