package methodHw1;

public class ROOM {
	int l;
	int w;
	int h;
	
	float whiteWashingArea()
	{
		return (2*1*h +2*w*h+1*w);
	}
	int whiteWashingcost()
	{
		return((2*1*h +2*w*h+1*w)*80);
	}
	int geometricalflooringCost()
	{
		return l*w*200;
	}
	int cementFlooring()
	{
		return l*w*100;
	}

}
