package ContainmentCW1;

public class Person {
String PName;
int PAdharNo;
String PJobName;
int PJobId;
String PJobLocation;
Address address;

public Person(String pName, int pAdharNo, String pJobName, int pJobId, String pJobLocation, Address address) {
	super();
	PName = pName;
	PAdharNo = pAdharNo;
	PJobName = pJobName;
	PJobId = pJobId;
	PJobLocation = pJobLocation;
	this.address=address;
}
void PersonDisplay()
{
	System.out.println("Name: "+PName+" "+"PAdharNo: "+PAdharNo+" "+"Job Name: "+PJobName+" "+"Employee Id: "+PJobId+" "+"Location: "+PJobLocation);
}
  
}
