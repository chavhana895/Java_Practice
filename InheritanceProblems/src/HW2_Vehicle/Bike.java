package HW2_Vehicle;

public class Bike extends Vehicle {
	int discountrate;
	String bikename;
	int bikemodelnumber;
	int bikeprice;
	String servicestationname;
	
	Bike(String vehiclename, int vehiclemodelnumber, int vehicleprice, String servicestationname,int discountrate) 
	{
		super(vehiclename, vehiclemodelnumber, vehicleprice, servicestationname);

		this.discountrate=discountrate;
		this.bikename=vehiclename;
		this.bikemodelnumber=vehiclemodelnumber;
		this.bikeprice=vehicleprice;
		this.servicestationname=servicestationname;
		
	}
	
	void Discount()
	{
		int discount=bikeprice-discountrate;
		System.out.println(discount);
	}
	
	void display()
	{
		System.out.println(bikename+" "+bikemodelnumber+" "+bikeprice+" "+servicestationname);
	}
}
