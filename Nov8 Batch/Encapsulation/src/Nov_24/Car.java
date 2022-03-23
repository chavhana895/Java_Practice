package Nov_24;

public class Car 
{
 private int noOfWheels=10;
 
 
 public void setNoOfWheels(int num) 
 {
	if(num>=0 && num<=5)
		noOfWheels=num;
}
 
 public int getNoOfWheels() 
 {
	return noOfWheels;
}
}
