package HW2_Vehicle;

public class Vehicle {
	String vehiclename;
	int vehiclemodelnumber;
	int vehicleprice;
	String servicestationname;
	
	Vehicle(String vehiclename,int vehiclemodelnumber,int vehicleprice,String servicestationname )
	{
		this.vehiclename=vehiclename;
		this.vehiclemodelnumber=vehiclemodelnumber;
		this.vehicleprice=vehicleprice;
		this.servicestationname=servicestationname;
	}
	void display()
	{
		System.out.println(vehiclename+" "+vehiclemodelnumber+" "+vehicleprice+" "+servicestationname);
	}
		
}
