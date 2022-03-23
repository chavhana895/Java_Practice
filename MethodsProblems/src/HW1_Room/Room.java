package HW1_Room;

public class Room {
	int l;
	int w;
	int h;
	
	float whiteWashingArea()
	{
		return 2*l*h + 2*w*h + l*w;
	}
	int whiteWashingCost()
	{
		return (2*l*h + 2*w*h + l*w)*80;
	}
	int geometricFlooringcost()
	{
		return l*w*200;
	}
	int cementFlooring()
	{
		return l*w*100;
	}
}
