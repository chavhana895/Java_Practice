package HW4_Triangle;

public class Triangle {
	int side1;
	int side2;
	int side3;
	int angle1;
	int angle2;
	int angle3;
	
	void trianglePerimeter()
	{
		int area=side1*side2*side3;
		System.out.println("Perimeter="+area);
	}
	void triangleArea()
	{
		float p=(side1*side2*side3)/2;
		double a=Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		System.out.println("Area="+a);
	}
	void isosceles()
	{
		if((side1==side2 || side2==side3) && (angle1==angle2 || angle2==angle3))
			System.out.println("Isosceles triangle");
			else
				System.out.println("not a isosceles triangle");
		
	}
	void equilateral()
	{
		if(side1==side2 && side2==side3 && angle1==angle2 && angle2==angle3)
			System.out.println("it is equilateral triangle");
		else
			System.out.println("Not a equilateral  triangle");
	}
	void rightAngled()
	{
		if((angle1==90 || angle2==90 || angle3==90))
			System.out.println("Right angle triangle");
		else
			System.out.println("not right angle triangle");
	}
}
