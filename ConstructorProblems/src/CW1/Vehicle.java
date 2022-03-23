package CW1;

public class Vehicle {
	String color="Black";
	int wheelCount=4;
	int gearscount=5;
	
	Vehicle()
	{
		System.out.println(color+" "+wheelCount+" "+gearscount);
	}
	
	Vehicle(String color,int gearsCount)
	{
		this.color=color;
		this.gearscount=gearscount;
		System.out.println(color+"  "+gearsCount);
	}
}
