package CW2;

public class Overloading {
	void area(int side)
	{
		System.out.println("square"+(side*side));
	}
	void area(int l,int b)
	{
		System.out.println("rectangle"+(l*b));
	}
	void area(int l,int b,int h)
	{
		System.out.println("triangle");
	}
}
