package Q7;

public class Address {
int streetNo;
String city;
String state;
String country;


public Address(int streetNo, String city, String state, String country) {
	super();
	this.streetNo = streetNo;
	this.city = city;
	this.state = state;
	this.country = country;
}


void displyData()
{
System.out.println(streetNo+" "+city+" "+state+" "+country);	
}
}
