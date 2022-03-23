package Q7;

public class Person {
String PName;
long PAdharNo;
String PJobName;
int PJobId;
String PJobLocation;
public Person(String pName, long pAdharNo, String pJobName, int pJobId, String pJobLocation) {
	super();
	this.PName = PName;
	this.PAdharNo = PAdharNo;
	this.PJobName = PJobName;
	this.PJobId = PJobId;
	this.PJobLocation = PJobLocation;
}
Address abc=new Address(1, "Pusad", "Maharashtra", "India");
void displyPersonDetails()
{
	System.out.println(PName+" "+PAdharNo+" "+PJobName+" "+PJobId+" "+PJobLocation);
}
}
