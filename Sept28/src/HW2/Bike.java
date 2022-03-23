package HW2;

public class Bike extends Vehicle {
double discountRate;
String BikeName;
int BikeModelNo;
int BikePrice;
String ServiceStationName;

void disply()
{
	System.out.println("BikeName"+" "+BikeModelNo+" "+BikePrice+" "+ServiceStationName+" "+discountRate);
}
}
