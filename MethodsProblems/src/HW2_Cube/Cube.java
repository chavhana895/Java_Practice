package HW2_Cube;

public class Cube {

	int h;
	int w;
	int d;
	void insertdata(int h, int w, int d) 
	{
		this.h = h;
		this.w = w;
		this.d = d;
	}
	
	void display()
	{
		System.out.println(d+" "+h+" "+w);
	}
	
	void volumeofCube(int a)
	{
		System.out.println("Volume of cube: "+a*a*a);
	}
}