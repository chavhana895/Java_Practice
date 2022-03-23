package POJO;

public class car extends Object
{
 int noOfWheels;
 int noOfGears;
 
 public car()
 {
	 super();
 }

public car(int noOfWheels, int noOfGears) {
	super();
	this.noOfWheels = noOfWheels;
	this.noOfGears = noOfGears;
}

public int getNoOfWheels() {
	return noOfWheels;
}

public void setNoOfWheels(int noOfWheels) {
	this.noOfWheels = noOfWheels;
}

public int getNoOfGears() {
	return noOfGears;
}

public void setNoOfGears(int noOfGears) {
	this.noOfGears = noOfGears;
}

@Override
public String toString() {
	return "car [noOfWheels=" + noOfWheels + ", noOfGears=" + noOfGears + "]";
}


}
