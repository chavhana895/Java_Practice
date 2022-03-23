package HW2;

public class Rectangle {
	int length;
	int breadth;
	
	public Rectangle() 
	{
		length=0;
		breadth=0;
		
	}
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public Rectangle(int num)
	{
		this.length=num;
		this.breadth=num;
	}
	void print()
	{
		System.out.println("Area="+(length*breadth));
	}
}
